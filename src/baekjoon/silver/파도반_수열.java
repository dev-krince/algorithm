package baekjoon.silver;

import java.io.*;

public class 파도반_수열 {

    public static long[] memoization = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputLength = Integer.parseInt(br.readLine());
        int[] inputs = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        for (int i = 0; i < inputLength; i++) {
            int input = inputs[i];

            bw.write(dp(input) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static long dp(int number) {

        if (number == 1) return 1;
        if (number == 2) return 1;
        if (number == 3) return 1;
        if (number == 4) return 2;
        if (number == 5) return 2;
        if (memoization[number] != 0) return memoization[number];

        return memoization[number] = dp(number - 1) + dp(number - 5);
    }
}
