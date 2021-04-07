import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        char C[] = S.toCharArray();
        int move = 0;
        int answer = dfs(N, C, move); // 한칸씩 가기
        System.out.println(answer);
    }

    private static int dfs(int n, char[] c, int move) { //move = 0~n-1
        if (n==move+1){
            return 1;
        }else if(n < move+1){
            return 0;
        }else {
            if (c[move] == '0'){
                return dfs(n, c, move+2);
            }else { // 10101
                if ((n-move>=2)&&c[move+1]=='0'){
                    return dfs(n, c, move+2);
                }
                return dfs(n, c, move + 1) + dfs(n, c, move + 2);
            }
        }
    }


}