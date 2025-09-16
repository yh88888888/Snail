import java.util.ArrayList;
import java.util.List;

public class Practice {


    public static void main(String[] args) {
        int[][] arr;
        int n;
        int x = 0;
        int y = 0;
        int num = 0;
        record Dir(int a, int b) {
        }
        List<Dir> dirs = new ArrayList<>();

        dirs.add(new Dir(0, 1));
        dirs.add(new Dir(1, 0));
        dirs.add(new Dir(-1, 0));
        dirs.add(new Dir(0, -1));


        n = 4;
        arr = new int[n][n];
        Dir dir;


        x = x + 0;
        y = y + 0;
        arr[x][y] = ++num;

        int index = 0;
        int currentIndex = 0;


        int[] steps = {2, 2, 2, 1, 1};


        //----------y 2증가
        for (int k = 0; k < steps.length; k++) {
            currentIndex = index % 4;
            index++;
            for (int i = 0; i < steps[k]; i++) {
                dir = dirs.get(currentIndex);
                x = x + dir.a;
                y = y + dir.b;
                arr[x][y] = ++num;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            for (int l = 0; l < arr[j].length; l++) {
                System.out.printf("% 4d", arr[j][l]);
            }
            System.out.println();
        }
    }
}
