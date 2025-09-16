public class Ex04 {
    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        int x = 0;
        int y = 0;
        int[][] arr;

        n = 3;
        num = 0;
        arr = new int[n][n];

        x = 0;
        y = 0;
        //예외 초기값
        x = x + 0;
        y = y + 0;
        arr[x][y] = ++num;//0,0

        //[+2,+2,-2,-1,+1,]
        //y 2증가-------------
        x = x + 0;
        y = y + 1;
        arr[x][y] = ++num;//0,1
        x = x + 0;
        y = y + 1;
        arr[x][y] = ++num;//0,2

        //x 2증가-------------
        x = x + 1;
        y = y + 0;
        arr[x][y] = ++num;//1,2
        x = x + 1;
        y = y + 0;
        arr[x][y] = ++num;//2,2

        //y 2감소-------------
        x = x + 0;
        y = y - 1;
        arr[x][y] = ++num;//2,1
        x = x + 0;
        y = y - 1;
        arr[x][y] = ++num;//2,0

        //x 1감소-------------
        x = x - 1;
        y = y + 0;
        arr[x][y] = ++num;//1,0

        //y 1증가-------------
        x = x + 0;
        y = y + 1;
        arr[x][y] = ++num;//1,1

        //[+3,+3,-3,-2,+2,+1,-1]
        n = 4;
        num = 0;
        arr = new int[n][n];
        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[0][3] = ++num;
        arr[1][3] = ++num;
        arr[2][3] = ++num;
        arr[3][3] = ++num;
        arr[3][2] = ++num;
        arr[3][1] = ++num;
        arr[3][0] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;
        arr[1][1] = ++num;
        arr[1][2] = ++num;
        arr[2][2] = ++num;
        arr[2][1] = ++num;

        //[+4,+4,-4,-3,+3,+2,-2,-1,+1]
        n = 5;
        num = 0;
        arr = new int[n][n];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[0][4] = 5;
        arr[1][4] = 6;
        arr[2][4] = 7;
        arr[3][4] = 8;
        arr[4][4] = 9;
        arr[4][3] = 10;
        arr[4][2] = 11;
        arr[4][1] = 12;
        arr[4][0] = 13;
        arr[3][0] = 14;
        arr[2][0] = 15;
        arr[1][0] = 16;
        arr[1][1] = 17;
        arr[1][2] = 18;
        arr[1][3] = 19;
        arr[2][3] = 20;
        arr[3][3] = 21;
        arr[3][2] = 22;
        arr[3][1] = 23;
        arr[2][1] = 24;
        arr[2][2] = 25;

        //n=6
        //[+5,+5,-5,-4,+4,+3,-3,-2,+2,+1,-1]

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}