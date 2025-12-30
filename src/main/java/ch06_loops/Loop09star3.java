package ch06_loops;
/*
            *
           **
          ***
         ****
        *****
        다음엔 반대로
 */
public class Loop09star3 {
    public static void main(String[] args) {
       // 개행을 책임지는 for-i 문
            //공백을 책임지는 for-j 문 : 공백은 줄어들어야 함
            //별을 책임지는 for-k문 : 별 개수는 늘어나야 함

        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 5 ; j > i ; j-- ) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //개행을 책임지는 for - i 문



        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < i ; j++ ) {
                System.out.print(" ");
            }
            for (int k = 5 ; k > i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
