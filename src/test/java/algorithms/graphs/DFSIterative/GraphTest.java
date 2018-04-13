package algorithms.graphs.DFSIterative;

import org.junit.Test;

public class GraphTest {

    @Test
    public void Iterative() throws Exception {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Search Iterative (with Stack):");

        g.DFS(2);
    }


}
