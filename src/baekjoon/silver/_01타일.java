package baekjoon.silver;

import java.io.*;

public class _01타일 {
    public static int[] memoization;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        br.close();

        memoization = new int[input + 1];

        int result = dp(input) % 15746;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static int dp(int number) {

        if (number == 1) return 1;
        if (number == 2) return 2;
        if (memoization[number] != 0) return memoization[number];

        return memoization[number] = dp(number - 1) + dp(number - 2);
    }
}
