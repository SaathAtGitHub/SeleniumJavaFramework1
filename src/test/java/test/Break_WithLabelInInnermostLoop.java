/* Followiing code is copied from "How do I break out of nested loops in Java?" found at https://stackoverflow.com/questions/886955/how-do-i-break-out-of-nested-loops-in-java?answertab=votes#tab-top
 */
package test;

public class Break_WithLabelInInnermostLoop {

    public static void main(String[] args) {
        outerloop:
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    break outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("The control comes here when it breaks all the loop and go to the statement AFTER THE END (AFTER THE ENDING BRACE) OF the loop labelled as 'outeloop'.");
    }
}