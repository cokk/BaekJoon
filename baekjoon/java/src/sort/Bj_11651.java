package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Location2> l = new ArrayList<>();
        while (n-- > 0) {
            l.add(new Location2(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(l);

        for (Location2 l2 : l) {
            System.out.println(l2);
        }
    }
}

class Location2 implements Comparable{
    int x;
    int y;

    public Location2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public int compareTo(Object o) {
        Location2 l = (Location2) o;
        if (this.y > l.y) return 1;
        else if (this.y < l.y) return -1;
        else if (this.x > l.x) return 1;
        else return -1;
    }
}