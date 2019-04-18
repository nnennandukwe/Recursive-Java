/*
 * Homework #3 - Recursion
    
   Implementing recursive methods.
   
 * Author: Nnenna Ndukwe
 * Date: 4/16/19
 * Class: CS342
 * Concerns: N/A
 * Description: For the first problem, a pyramid had to be constructed recursively
                given parameters that can be tested. For second problem, a recursive
                method had to be constructed for converting an integer into a string.
 
 * Assumptions: These methods do not take into account negative values as arguments for
                invocation. The assumption is also that the starting value to begin
                recursion will be 0. They do not fully take into account 0 as max integers.
                These methods are all invoked automatically upon running
                the program.
**/

// Main class description: this class sets up the different 
public class Main {

    public int counter = 0;     // utilize a class level variable to control how many times recursion occurs per method
    public String stringified = ""; // set string value to an empty string in preparation for new recursion method invocation

    public static void main(String[] args) {

        Main me = new Main();
        me.doIt();
    }

    public void doIt() {
        System.out.println("Welcome to Recursion!");

        pyramid(10, 0, 10, 0);  // repeat same two end and start values in order to keep track of shift in recursing printing
        pyramid(8, 0, 8, 0);    // repeat same two end and start values in order to keep track of shift in recursing printing
        pyramid(4, 0, 4, 0);    // repeat same two end and start values in order to keep track of shift in recursing printing


        convert(1234, 0);       // use an intended integer of choice to convert to a string and supply a starter value
                                // for recursion to occur
        stringified = "";       // reset string value for next method call utilizing this variable

        convert(187800, 0);     // use an intended integer of choice to convert to a string and supply a starter value
                                // for recursion to occur
        stringified = "";       // reset string value for next method call utilizing this variable

        convert(922, 0);        // use an intended integer of choice to convert to a string and supply a starter value
                                // for recursion to occur
        stringified = "";       // reset string value
    }

    /* Recursive method for HW PROBLEM #1:
            this method 'pyramid' unpacks arguments as elements in an array and holds the values
            as they increase and decrease throughout.
    
       Description: 
            builds and prints out an ascending pyramid (0 to maximum integer),
            prints out a full length of the intended max integer,
            and finally, builds and prints out a descending pyramid (max integer to 0)
    */ 
    public void pyramid(int... z) {
        /* check that the counter integer value (0) is less than the max integer placed as the first element
           in the array. if it is, this means we need to print out the ascending (downward positive increment of
           printed asterisks) pyramid.
        */ 
        if ( z[1] <= z[0] ) {
            // print out each asterisk in a line as counter value increases from 0 to the max int at first element
            // in array
            for (int j = 0; j < z[1]; j++ ) {
                System.out.print("*");
            }
            // go to next line
            System.out.println();
            counter++; // increase count to track how many lines are being printed out from the entire pyramid
            // call itself with an increment on the counter integer value (that started at 0) for ascending pyramid
            pyramid(z[0], z[1] + 1, z[2], z[3]);
        }
        /* once the ascending pyramid has been printed out,
           is the third element (which is at the start, the same value as the first element / max integer)
           greater than the fourth element? (the counter integer value that starts as 0)
        */ 
        else if (z[2] > z[3]) {
            // if you are at the nth line that would indicate you are in between the ascending and descending pyramids
            if (counter == z[1]) {
                // then just print out the full line of asterisks with the count of the max integer
                for (int x = 0; x < (z[1] - 1); x++) {
                    System.out.print("*");
                }
                // go to the next line to prepare for the descending pyramid
                System.out.println();

            }
            // descending pyramid after ascending pyramid and straight across asterisk printing has been done
            for (int k = 0; k < z[2]; k++) {
                System.out.print("*");
            }
  
            System.out.println();
            counter++; // keeping track of total lines used for entire pyramid method

            pyramid(0, 1, z[2] - 1, z[3]);

        } else {
            counter = 0; // once entire pyramid has been built and printed out, reset counter for all methods outside this call
        }
    }

    /* Recursive Method for HW PROBLEM #2:
            Description:
                method for converting integer from input into a string, recursively.
                the parameter 'start' is used as initial counter value of how many times
                to recurse, which is updated with the incremented 'counter' class variable
    */
    public String convert(int input, int start) {

        // call itself if loop through each character in the input value
        // has not been met yet. increment the counter as the newly
        // updated start value.
        if ( start < String.valueOf(input).length() ) {
            stringified += String.valueOf(input).charAt(counter);
            counter++;
            return convert(input, counter);
        }
        // in the case that recursion has been completed, reset the counter
        // for any next method that could be called after this method is
        // invoked
        else {
            counter = 0;
        }

        // print out the number for the sake of displaying the string result
        // of the integer value
        System.out.println(stringified);
        return stringified;

    }


/* RECURSION AND NON-RECURSION (PERSONAL PRACTICE) ******
----------------------------------------------
----------------------------------------------
----------------------------------------------

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
*/

}
