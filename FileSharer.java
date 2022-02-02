import java.io.*;
import java.net.*;

public class FileSharer {

    public FileSharer(int port, String filename) throws Exception {

        String content = getFile(filename);

        ServerSocket host = new ServerSocket(port);
        Socket user = host.accept();
        OutputStream out = user.getOutputStream();
        out.write(content.getBytes());
        out.close();
        user.close();
        host.close();

    }

    private String getFile(String filename) throws Exception {

        String content = "";
        String line = "";
        BufferedReader read = new BufferedReader(new FileReader(filename));
        while ((line = read.readLine()) != null) {

            content += line;
            content += "\n";

        }

        return content;

    }

    public static void main(String[] args) throws Exception {

        new FileSharer(8888, "H:\\schoolHDrive\\potato.txt");

    }

}