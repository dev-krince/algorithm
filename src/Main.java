import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberArrayLength = Integer.parseInt(st.nextToken());
        int targetNumber = Integer.parseInt(st.nextToken());
        int[] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        br.close();

        for (int i = 0; i < numberArrayLength - 2; i++) {
            for (int j =  i + 1; j < numberArrayLength - 1; j++) {
                for (int k = j + 1; k < numberArrayLength; k++) {
                    int thisNumber = numberArray[i] + numberArray[j] + numberArray[k];
                    if (thisNumber <= targetNumber && thisNumber >= result) {
                        result = thisNumber;
                    }
                }
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}