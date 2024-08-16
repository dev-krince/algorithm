import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int number1 = Integer.parseInt(st1.nextToken());
            int number2 = Integer.parseInt(st1.nextToken());
            int target1 = basket[number1];
            int target2 = basket[number2];

            basket[number1] = target2;
            basket[number2] = target1;
        }

        br.close();

        for (int i = 1; i <= N; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}