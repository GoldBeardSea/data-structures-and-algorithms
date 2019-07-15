package Challenges.Graph;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Graph<T> {

    class GraphNode {
        String label;
        Integer weight;
        GraphNode(String label, Integer weight) {
            this.label = label;
            this.weight = weight;
        }

        public boolean equals(Object comparison) {
            if (this.getClass() != comparison.getClass()) {
                return false;
            }

            return this.label.equals(((GraphNode) comparison).label);
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }

    private Map<GraphNode, List<GraphNode>> adjacencyList;

    public Graph(Map<GraphNode, List<GraphNode>> adjVertices) {
        this.adjacencyList = adjVertices;
    }

    public Map<GraphNode, List<GraphNode>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(Map<GraphNode, List<GraphNode>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public GraphNode addNode(String label) {
        GraphNode node = new GraphNode(label, null);
        //figure out weight
        adjacencyList.put(node, new ArrayList<>());
        return node;
    }



    public int size() {
        return adjacencyList.size();
    }
}