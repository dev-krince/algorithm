package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class 공_넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];

        for (int i = 1; i <= M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int firstBasket = Integer.parseInt(st1.nextToken());
            int lastBasket = Integer.parseInt(st1.nextToken());
            int number = Integer.parseInt(st1.nextToken());

            for (int j = firstBasket; j <= lastBasket; j++) {
                basket[j] = number;
            }
        }

        br.close();

        for (int i = 1; i <= N; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
