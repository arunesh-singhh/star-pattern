// input-5
// output-
//           *
//          ***
//         *****
//          ***
//           *

import java.util.Scanner;

public class diamondOf_stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int firstHalf = (n + 1) / 2;
        int secondHalf = n / 2;
        
        //First half
        int currRow = 1;
        while(currRow <= firstHalf) {
            int spaces = 1;
            while(spaces <= (firstHalf - currRow)) {
                System.out.print(" ");
                spaces += 1;
            }
            int currCol = 1;
            while(currCol <= (2 * currRow) - 1) {
                System.out.print("*");
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
        
        //Second Half
        currRow = secondHalf;
        while(currRow >= 1) {
            int spaces = 1;
            while(spaces <= (secondHalf - currRow + 1)) {
                System.out.print(" ");
                spaces += 1;
            }
            int currCol = 1;
            while(currCol <= (2 * currRow) - 1) {
                System.out.print("*");
                currCol += 1;
            }
            System.out.println();
            currRow -= 1;
        }
        s.close();
    }
}
