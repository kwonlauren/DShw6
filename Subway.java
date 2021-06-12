import java.io.*;

public class Subway {
    public static void main(String[] args) throws Exception{
        Graph map = new Graph();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        while (!(line = br.readLine()).isEmpty()) {
            //graph에 vertex 추가
            String[] strs = line.split(" ");
            map.addVertex(strs[0], strs[1], strs[2]);
        }
        while ((line = br.readLine()) != null) {
            //graph에 edge 추가
            String[] strs = line.split(" ");
            map.addEdge(strs[0], strs[1], Integer.parseInt(strs[2]));
        }


        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String input = br2.readLine();
            if(input.compareTo("QUIT") == 0) break;
            String[] strs = input.split(" ");
            // dijkstra(map, strs[0], strs[1]);
        }

    }

    private static String dijkstra(Graph G,String origin, String destination)
    {
        //origin, destination은 역 이름(고유번호x)
        //초기화

    }
}