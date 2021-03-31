package solution;

public class GraphTest {
    public static void main(String[] arg) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);

        int v = 0;
        System.out.print("Run breadth first search from vertex " + v + "\n");
        BFS.BFS(graph, v);

        System.out.print("-------------------------------------\n");

        System.out.print("Run depth first search from vertex " + v+ "\n");
        DFS.DFS(graph, v);
    }
}
