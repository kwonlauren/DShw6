import java.util.Hashtable;
import java.util.LinkedList;

public class nametoNum {
    private Hashtable<String, LinkedList<String>> ht;

    public nametoNum(){
        ht = new Hashtable<>();
    }
    public void add(String name, String stationNum){
        if(ht.containsKey(name)){
            ht.get(name).add(stationNum);
        } else{
            LinkedList<String> ll = new LinkedList<>();
            ll.add(stationNum);
            ht.put(name, ll);
        }
    }
}
