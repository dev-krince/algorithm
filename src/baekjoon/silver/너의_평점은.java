package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class 너의_평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        float ea = 0F;
        float result = 0F;

        for (int i = 1; i <= 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();

            float score = Float.parseFloat(st.nextToken());
            String rating = st.nextToken();
            float ratingScore = 0F;
            if (rating.equals("P")) continue;

            ea += score;

            if (rating.equals("A+")) ratingScore = 4.5F;
            if (rating.equals("A0")) ratingScore = 4.0F;
            if (rating.equals("B+")) ratingScore = 3.5F;
            if (rating.equals("B0")) ratingScore = 3.0F;
            if (rating.equals("C+")) ratingScore = 2.5F;
            if (rating.equals("C0")) ratingScore = 2.0F;
            if (rating.equals("D+")) ratingScore = 1.5F;
            if (rating.equals("D0")) ratingScore = 1.0F;
            if (rating.equals("F")) ratingScore = 0F;

            result += score * ratingScore;
        }

        br.close();

        bw.write(String.valueOf(result / ea));
        bw.flush();
        bw.close();
    }
}
