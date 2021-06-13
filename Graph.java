import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Graph {
    public Map<String, htNode> ht;

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

    public ArrayList<String> searchNum(String name){
        ArrayList<String> result = new ArrayList<>();
        for(Map.Entry<String, htNode> entry : ht.entrySet()){
            if(entry.getValue().name.equals(name)){
                result.add(entry.getKey());
            }
        }
        return result;
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