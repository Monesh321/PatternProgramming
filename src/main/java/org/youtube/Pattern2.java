package org.youtube;

public class Pattern2 {

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
