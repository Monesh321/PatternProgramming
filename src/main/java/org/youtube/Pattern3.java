package org.youtube;

public class Pattern3 {

    static void pattern3(int n){
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }if (row<n-1){
                System.out.println();
            }
        }
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
