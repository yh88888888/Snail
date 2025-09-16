public class Ex01 {
    public static void main(String[] args) {
        int n3 = 3;
        int[][] arr3 = new int[n3][n3];
        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[1][2] = 4;
        arr3[2][2] = 5;
        arr3[2][1] = 6;
        arr3[2][0] = 7;
        arr3[1][0] = 8;
        arr3[1][1] = 9;

        int n4 = 4;
        int[][] arr4 = new int[n4][n4];
        arr4[0][0] = 1;
        arr4[0][1] = 2;
        arr4[0][2] = 3;
        arr4[0][3] = 4;
        arr4[1][0] = 12;
        arr4[1][1] = 13;
        arr4[1][2] = 14;
        arr4[1][3] = 5;
        arr4[2][0] = 11;
        arr4[2][1] = 16;
        arr4[2][2] = 15;
        arr4[2][3] = 6;
        arr4[3][0] = 10;
        arr4[3][1] = 9;
        arr4[3][2] = 8;
        arr4[3][3] = 7;

        int n = 5;
        int[][] arr5 = new int[n][n];
        arr5[0][0] = 1;
        arr5[0][1] = 2;
        arr5[0][2] = 3;
        arr5[0][3] = 4;
        arr5[0][4] = 5;
        arr5[1][4] = 6;
        arr5[2][4] = 7;
        arr5[3][4] = 8;
        arr5[4][4] = 9;
        arr5[4][3] = 10;
        arr5[4][2] = 11;
        arr5[4][1] = 12;
        arr5[4][0] = 13;
        arr5[3][0] = 14;
        arr5[2][0] = 15;
        arr5[1][0] = 16;
        arr5[1][1] = 17;
        arr5[1][2] = 18;
        arr5[1][3] = 19;
        arr5[2][3] = 20;
        arr5[3][3] = 21;
        arr5[3][2] = 22;
        arr5[3][1] = 23;
        arr5[2][1] = 24;
        arr5[2][2] = 25;

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.printf("%4d", arr5[i][j]);
            }
            System.out.println();
        }
    }
}