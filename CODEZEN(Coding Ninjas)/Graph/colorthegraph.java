import java.util.*;
/**
 * colorthegraph
 */
public class colorthegraph {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        int[][] edges = new int[V][V];

        for (int i = 0; i < E; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            edges[a][b] = 1;
            edges[b][a] = 1;

        }

        int[] color = new int[V];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;

        }
        //red=0
        //blue=1
        //nocolor=-1
        System.out.println(graphcolor(edges, V, color, 0));
    }
    
    public static String graphcolor(int[][] edges, int V, int[] color, int sv) {
        if (sv == V) {
            return "YES";
        }

        for (int i = 0; i <= 1; i++) {
            if (issafe(edges, color, sv, i)) {
                color[sv] = i;
                if (graphcolor(edges, V, color, sv + 1) == "YES") {
                    return "YES";
                }

                color[sv] = -1;

            }

        }
        return "NO";

    }

    public static boolean issafe(int[][] edges, int[] color, int sv, int c) {
        for (int i = 0; i < edges.length; i++) {
            if (edges[sv][i] == 1 && color[i] == c) {
                return false;
            }
        }
        return true;
        
    }
}