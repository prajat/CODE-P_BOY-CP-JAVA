import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int m = s.nextInt();

        int[][] edges = new int[V + 1][V + 1];

        for (int i = 1; i <= m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            edges[a][b] = 1;
            // edges[b][a] = 1;

        }

        // boolean[] visited = new boolean[V + 1];

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        for (int i = 1; i <= V; i++) {
            boolean[] visiteddfs = new boolean[V + 1];

            dfs(edges, visiteddfs, i);
            for (int j = 1; j < visiteddfs.length; j++) {
                if (visiteddfs[j] == true) {
                    count++;
                }
            }
            list.add(count);
            count = 0;

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void dfs(int[][] edges, boolean[] visited, int start) {

        visited[start] = true;
        for (int i = 1; i < edges.length; i++) {
            if (i == start) {
                continue;
            }
            if (edges[start][i] == 1 && !visited[i]) {
                dfs(edges, visited, i);
            }
        }

    }
}
