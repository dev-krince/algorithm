package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _1_2_3_더하기 {
    static int[] memoization = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcaseLength = Integer.parseInt(br.readLine());
        List<Integer> testcases = new ArrayList<>();

        for (int i = 0; i < testcaseLength; i++) {
            testcases.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        for (int i = 0; i < testcaseLength; i++) {
            bw.write(dp(testcases.get(i)) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static int dp(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        if (memoization[n] != 0) return memoization[n];

        return dp(n - 1) + dp(n - 2) + dp(n - 3);
    }
}