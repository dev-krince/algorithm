package baekjoon.bronze;

import java.io.*;

public class 문자와_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        int num = Integer.parseInt(br.readLine()) - 1;
        br.close();

        bw.write(text.charAt(num));

        bw.flush();
        bw.close();
    }
}