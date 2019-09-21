package graph;

import java.util.*;

public class Bj_1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        ArrayList<Integer>[] a = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) a[i] = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v);
            a[v].add(u);
        }

        for (int i = 1; i <= n; i++) Collections.sort(a[i]);

        Stack<Integer> stk = new Stack<>();
        boolean[] check = new boolean[n + 1];
        dfs(a, stk, check, start);
        System.out.println();

        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(check, false);
        q.add(start);
        check[start] = true;
        System.out.print(start + " ");
        bfs(a, q, check, start);
    }

    private static void dfs(ArrayList<Integer>[] a, Stack<Integer> s, boolean[] c, int start) {
        s.push(start);
        c[start] = true;
        System.out.print(start + " ");

        List<Integer> l = a[s.pop()];
        for (int i = 1; i <= l.size(); i++) {
            if (c[l.get(i - 1)] == false) {
                dfs(a, s, c, l.get(i - 1));
            }
        }
    }

    private static void bfs(ArrayList<Integer>[] a, Queue<Integer> q, boolean[] c, int start) {
        List<Integer> l = a[start];
        for (int i = 1; i <= l.size(); i++) {
            if (c[l.get(i - 1)] == false) {
                q.add(l.get(i - 1));
                c[l.get(i - 1)] = true;
                System.out.print(l.get(i - 1) + " ");
            }
        }
        if (!q.isEmpty()) bfs(a, q, c, q.poll());
    }
}
