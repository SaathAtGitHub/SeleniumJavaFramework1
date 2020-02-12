/* Followiing code is copied from "How do I break out of nested loops in Java?" found at https://stackoverflow.com/questions/886955/how-do-i-break-out-of-nested-loops-in-java?answertab=votes#tab-top
 */
package test;

public class BreakOutOfTheInnermostLoop_WithoutUsingBreak {

	public static void main(String[] args) {
        loop();
        System.out.println("Done");
    }

    public static void loop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    return;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("----The control comes here when it breaks all the way out of all the loops and go to the statement AFTER THE END (AFTER THE ENDING BRACE) OF the FIRST 'for' loop.");
    }
}
