package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class 바구니_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int i = 1; i <= M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int firstBasket = Integer.parseInt(st1.nextToken());
            int lastBasket = Integer.parseInt(st1.nextToken());
            count = lastBasket;
            int[] cloneBasket = basket.clone();

            for (int j = firstBasket; j <= lastBasket; j++) {
                basket[j] = cloneBasket[count];
                count--;
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