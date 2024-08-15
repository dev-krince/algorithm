package baekjoon.silver;

import java.io.*;

public class 계단_오르기 {
    static int[][] memoization = new int[3][301];
    static int[] scoreOfStep = new int[301];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStep = Integer.parseInt(br.readLine());

        for (int i = 1; i <= numberOfStep; i++) {
            scoreOfStep[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        int result = Math.max(oneStepDp(numberOfStep), twoStepDp(numberOfStep));

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static int oneStepDp(int numberOfStep) {
        if (numberOfStep == 1) return memoization[1][1] = scoreOfStep[1];
        if (numberOfStep == 2) return memoization[1][2] = scoreOfStep[1] + scoreOfStep[2];
        if (memoization[1][numberOfStep] != 0) return memoization[1][numberOfStep];

        return memoization[1][numberOfStep] = twoStepDp(numberOfStep - 1) + scoreOfStep[numberOfStep];
    }

    public static int twoStepDp(int numberOfStep) {
        if (numberOfStep == 1) return 0;
        if (numberOfStep == 2) return memoization[2][numberOfStep] = scoreOfStep[numberOfStep];
        if (memoization[2][numberOfStep] != 0) return memoization[2][numberOfStep];

        return memoization[2][numberOfStep] = Math.max(oneStepDp(numberOfStep - 2), twoStepDp(numberOfStep - 2)) + scoreOfStep[numberOfStep];
    }
}
