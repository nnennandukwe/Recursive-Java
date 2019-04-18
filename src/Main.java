public class Main {

    public int counter = 0;
    public String stringified = "";

    public static void main(String[] args) {

        Main me = new Main();
        me.doIt();
    }

    public void doIt() {
        System.out.println("Welcome to Recursion!");

        pyramid(10, 0, 10, 0);
        pyramid(8, 0, 8, 0);
        pyramid(4, 0, 4, 0);


        convert(1234, 0);

        stringified = "";

        convert(187800, 0);

        stringified = "";

        convert(922, 0);

        stringified = "";
    }

    // official recursive method for HW PROBLEM #1:
    public void pyramid(int... z) {

        if ( z[1] <= z[0] ) {

            for (int j = 0; j < z[1]; j++ ) {
                System.out.print("*");
            }

            System.out.println();
            counter++;

            pyramid(z[0], z[1] + 1, z[2], z[3]);
        }

        else if (z[2] > z[3]) {

            if (counter == z[1]) {

                for (int x = 0; x < (z[1] - 1); x++) {
                    System.out.print("*");
                }

                System.out.println();

            }

            for (int k = 0; k < z[2]; k++) {
                System.out.print("*");
            }

            System.out.println();
            counter++;

            pyramid(0, 1, z[2] - 1, z[3]);

        } else {
            counter = 0;
        }
    }

    // HW PROBLEM #2: convert integer recursively
    public String convert(int input, int start) {

        if ( start < String.valueOf(input).length() ) {
            stringified += String.valueOf(input).charAt(counter);
            counter++;
            return convert(input, counter);
        }

        else {
            counter = 0;
        }

        System.out.println(stringified);
        return stringified;

    }


    // practicing without recursion
    public void iter(int n) {


        // print out in ascending order
        int l = 1;
        while ( l <= n) {
            for (int o = 0; o < l; o++){
                System.out.print("*");
            }
            l++;
            System.out.println();
        }

        // print out full amount once
        for (int k = 0; k < n; k++) {
                System.out.print("*");
        }
            System.out.println();


        // print out in descending order
        while ( n > 0) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }


    // separate descending method for practice with recursion
    public void desc(int n, int i) {

        // print out in descending order
        if ( n > i) {
            for(int k = 0; k < n; k++){
                System.out.print("*");
            }
            System.out.println();
            desc(n - 1, i);
        }
    }

    // separate ascending method for practice with recursion
    public void asc(int n, int i) {

        // print out in ascending order
        if ( i <= n ) {
            for (int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
            asc(n, i + 1);
        }
    }

    // separate straight line printing for practice
    public void across(int n) {

        // print out full amount once
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

}
