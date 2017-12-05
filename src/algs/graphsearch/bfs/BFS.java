package algs.graphsearch.bfs;

import dataStructure.queue.Queue;

public class BFS {

    public void bfs(Vertex root) {
        Queue<Vertex> queue = new Queue<>();

        root.setVisited(true);
        queue.enqueue(root);

        while (!queue.isEmpty()) {
           Vertex actualVertex = queue.dequeue();
            System.out.println(actualVertex);

            for (Vertex v : actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.enqueue(v);
                }
            }

        }
    }


}
