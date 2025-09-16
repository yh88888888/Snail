import java.util.ArrayList;
import java.util.List;

//
public class Ex09 {
    public static void main(String[] args) {
        int n = 0; // 배열 수
        int num = 0; // 각 행열에 들어가는 수
        int x = 0; // 행
        int y = 0; // 열
        int[][] arr; // 행열
        record Dir(int a, int b) {
        } // 행열에 들어가는

        //0,1 -> 1, 0 -> 0, -1 -> -1, 0

        List<Dir> dirs = new ArrayList<>();
        dirs.add(new Dir(0, 1));
        dirs.add(new Dir(1, 0));
        dirs.add(new Dir(0, -1));
        dirs.add(new Dir(-1, 0));

        // 2. N=3일 때, 달팽이
        n = 3;
        num = 1;
        arr = new int[n][n];
        Dir dir;

        int index = 0;
        int currentIndex = 0;
        int[] steps = {2, 2, 2, 1, 1};
        x = 0;
        y = 0;
        // 2.1 예외 초기값
        arr[x][y] = 1;//0,0

        //2.2 공통모듈

        for (int k = 1; k < steps.length; k++) {
            currentIndex = index % 4;
            index++;
            for (int i = 0; i < steps[k]; i++) {
                dir = dirs.get(currentIndex);
                x = x + dir.a;
                y = y + dir.b;
                arr[x][y] = ++num;
            }
            System.out.println(arr[x][y]);
        }
    }
}
