package baekjoon.bronze;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class 코딩은_체육과목_입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        List<Long> inputs = Arrays.stream(br.readLine().split(" ")).map(Long::parseLong).collect(Collectors.toList());
        Long result = inputs.get(0) + inputs.get(1) + inputs.get(2);

        System.out.println(result);
    }
}