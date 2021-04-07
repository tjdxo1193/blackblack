import java.io.*;

class three {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_ref = br.readLine();
        // 장르선호도 5개의 실수 공백을 기준으로 순서대로(장르 A B C D E(0.0~5.0))

        String input_size = br.readLine();

        // 평점을 정렬하기, Y 좌표들을 찾아서 평점 높은 순으로 정렬해서 먼저출력, 그후에 O에

        // 콘텐츠 크기 N(세로 ㅣ) x M(가로 ㅡ) ex) 2 3
        int N = Integer.parseInt(String.valueOf(input_size.charAt(0)));
        int M = Integer.parseInt(String.valueOf(input_size.charAt(input_size.length() - 1)));
        System.out.println(N+" "+M);


        //열람 정보 W O Y 로만 구성, W는 끝까지 본 컨텐츠, O는 열람했으나 끝까지 보지 않은 콘텐츠, Y는 열람하지 않은 콘텐츠
        StringBuilder input_info = new StringBuilder();
        for (int i = 0; i < N ; i++){
            input_info.append(br.readLine());
            if (i != N-1){
                input_info.append(" ");
            }
        }
        System.out.println(input_info);
        // 장르 정보
        StringBuilder input_genre = new StringBuilder();
        for (int i = 0; i < N ; i++){
            input_genre.append(br.readLine());
            if (i != N-2){
                input_genre.append(" ");
            }
        }
        System.out.println(input_genre);



    }
}