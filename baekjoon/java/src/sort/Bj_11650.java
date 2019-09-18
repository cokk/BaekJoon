package sort;

import java.util.*;

public class Bj_11650 {
    public static void main(String[] args) {
        List<Location> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            l.add(new Location(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(l, (o1, o2) -> {
            if (o1.x > o2.x) return 1;
            else if (o1.x < o2.x) return -1;
            else if (o1.y > o2.y) return 1;
            else return -1;
        });

        for (Location lc : l) {
            System.out.println(lc);
        }
    }
}
class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

