package algs.graphsearch.dfs;

import dataStructure.stack.Stack;

import java.util.List;

public class DFS {

    private Stack<Vertex> vertexStack;

    public DFS() {
        this.vertexStack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList) {

        for(Vertex v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }

    private void dfsRecursive(Vertex v) {
        System.out.println(v);

        for (Vertex vertex : v.getNeighbourList()) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }

    }

    private void dfsWithStack(Vertex rootVertex) {
        this.vertexStack.push(rootVertex);
        rootVertex.setVisited(true);

        while (!vertexStack.isEmpty()) {
            Vertex actualVertex = vertexStack.pop();
            System.out.println(actualVertex);

            for (Vertex v : actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    this.vertexStack.push(v);
                }
            }
        }
    }
}
