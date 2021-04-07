import java.io.*;
import java.util.Arrays;

class ffff {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input_size = Integer.parseInt(br.readLine());
        // 공간에 한변의 길이가 N인 정사각형 공간
        int space[][] = new int[input_size][input_size];
        String temp[] = new String[input_size];
        for (int a=0; a < input_size; a++){
            String s = br.readLine();
            temp = s.split("");
            space[a] = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        }

        for (int n = 1; n <= input_size; n++){
            int answer = 0;
            for (int a = 0; a <= input_size-n; a++){
                for (int b = 0; b <= input_size-n; b++){
                    if (space[a][b] == 1) {
                        answer += block(space, n, a, b);
                    }
                }
            }
            if (answer > 0){
                System.out.println("size[" + n + "]:" + " " + answer );
            }
        }

    }

    private static int block(int[][] space, int n, int x, int y) {
        int temp = 0;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                temp += space[a+x][b+y];
            }
        }
        if (temp == n * n){
            return 1;
        }
        return 0;
    }
}