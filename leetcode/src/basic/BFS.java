package basic;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    public static void BFS(Graph graph, int s) {
        boolean[] visited = new boolean[graph.V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s+ " ");

            Iterator<Integer> i = graph.adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
