package solution;

import java.util.Iterator;

public class DFS {

    public static void DFS(Graph g, int s) {
        boolean[] visited = new boolean[g.V];

        visited[s] = true;
        dfs(g, s, visited);
    }

    private static void dfs(Graph g, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        Iterator<Integer> i = g.adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfs(g, n, visited);
            }
        }
    }
}
