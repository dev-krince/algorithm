package baekjoon.silver;

import java.io.*;

public class _2Xn_타일링_2 {
    static int[] memoization = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        br.close();

        int result = dp(input);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static int dp(int x) {
        if (x == 1) {
            return 1;
        }

        if (x == 2) {
            return 3;
        }

        if (memoization[x] != 0) {
            return memoization[x];
        }

        return memoization[x] = (dp(x - 1) + dp(x - 2) * 2) % 10007;
    }
}