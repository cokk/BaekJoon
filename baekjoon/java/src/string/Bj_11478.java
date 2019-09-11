package string;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bj_11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<String> set = new HashSet<>();

        for(int i=1; i <= str.length(); i++) { // 글자수
            for(int j=i; j <= str.length(); j++) { // 인덱스
                String s = str.substring(j-i, j);
                set.add(s);
            }
        }

        System.out.println(set.size());
    }
}
