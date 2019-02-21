package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ");
        if (split.length > 0 && split[0].equals("")) System.out.println(split.length - 1);
        else System.out.println(split.length);
    }
}
