import java.io.*;

 public class P1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("cricket.txt");
        PrintWriter out = new PrintWriter(fw);
        out.write(100);
        out.println(100);
        out.println(true);
        out.println('c');
        out.println("SaiCharan");
        out.flush();
        out.close();
    }
}
