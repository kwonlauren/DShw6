import java.util.Hashtable;

public class Graph {
    public Hashtable<String, htNode> ht;

    public Graph(){
        ht = new Hashtable<>();
    }

    public void addVertex(String stationNum, String name, String line){
        ht.put(stationNum, new htNode(name, line));
    }

    public void addEdge(String startStation, String endStation, int time){
        htNode node = ht.get(startStation);
        node.adjacentStations.put(endStation, time);
    }

}

class htNode{
    public String name;
    public String line;
    public Hashtable<String, Integer> adjacentStations;

    htNode(String name, String line){
        this.name = name;
        this.line = line;
        adjacentStations = new Hashtable<>();
    }
}