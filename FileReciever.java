import java.io.*;
import java.net.*;

public class FileReciever {

    public FileReciever(String host, int port, String newfile) throws Exception {

        Socket user = new Socket(host, port);

        String line = "";
        String content = "";
        //System.out.println(user.getInputStream().available());
        BufferedReader in = new BufferedReader(new InputStreamReader(user.getInputStream()));
       
        while ((line = in.readLine()) != null) {

            content += line;
            content += "\n";

        }

        BufferedWriter write = new BufferedWriter(new FileWriter(newfile));
        write.write(content);

        write.close();
        in.close();
        user.close();

    }

    public static void main(String[] args) throws Exception {

        new FileReciever("10.8.5.75", 8888, "H:\\cheats.txt");

    }

}