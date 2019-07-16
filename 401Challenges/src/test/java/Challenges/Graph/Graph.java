package Challenges.Graph;


import java.util.*;


public class Graph<T> {

    class GraphNode<V> {
        V label;
        HashSet<Edge> connecting;

        GraphNode(V label) {
            this.label = label;
            this.connecting = new HashSet<>();
        }



        public boolean equals(Object comparison) {
            if (this.getClass() != comparison.getClass()) {
                return false;
            }

            return this.label.equals(((GraphNode) comparison).label);
        }

        public V getLabel() {
            return label;
        }

        public void setLabel(V label) {
            this.label = label;
        }

        public HashMap<GraphNode<V>, Integer> getConnecting() {
            return connecting;
        }

        public void setConnecting(HashMap<GraphNode<V>, Integer> connecting) {
            this.connecting = connecting;
        }
    }

    class Edge {
        int weight;
        GraphNode node;
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

    public Set<String> breadthFirstTraversal(Graph graph, String startingNode) {
    // using baeldung as a guide
        Set<String> result = new HashSet<>();
        Queue <String> traversingQueue = new LinkedList<>();
        traversingQueue.add(startingNode);
        result.add(startingNode);
        while(!traversingQueue.isEmpty()){
            String poppedNode = traversingQueue.poll();
            for (GraphNode graphNode: graph.adjacencyList) {
                //need to finish my graphs. 
            }
        }
        return result;
    }
}