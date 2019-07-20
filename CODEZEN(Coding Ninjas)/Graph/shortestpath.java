import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] graph = new int[n + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;

        }
        int s = in.nextInt();
        int t = in.nextInt();

        System.out.println(bfs(graph, s, t));
    }

    public static int bfs(int[][] graph, int start, int target) {
        int count = 0;
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == target) {
                return count;
            }
            count++;
            for (int i = 0; i < graph.length; i++) {
                if ((graph[node][i] == 1 || graph[i][node] == 1) && visited[node] == false) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
        return count;
        
    }
}
