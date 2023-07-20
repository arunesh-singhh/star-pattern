// input-4
// output-
//           1
//          232
//         34543
//        4567654

import java.util.Scanner;

public class tringleOf_numbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            int space = 1;
            while(space <= n - i){
                System.out.print(" ");
                space += 1;
            }
            int num = i;
            while(num <= 2 * i - 2){
                System.out.print(num);
                num += 1;
            }
            int dec = 2 * i - 1;
            while(dec >= i){
                System.out.print(dec);
                dec -= 1;
            }

            System.out.println();
            i += 1;
        }
        sc.close();
    }
}