import java.io.*;

public class Subway {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = br.readLine()) != "\n") {
            //vertex 추가
        }
        while ((line = br.readLine()) != null) {
            //edge 추가
        }

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String input = br2.readLine();
            if(input.compareTo("QUIT") == 0) break;
            command(input);
        }
    }

    private static void command(String input)
    {

    }
}