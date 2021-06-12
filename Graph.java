import java.util.Hashtable;

public class Graph {
    public Hashtable<String, htNode> ht;

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
