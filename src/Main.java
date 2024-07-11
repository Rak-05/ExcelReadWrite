import java.io.*;

import org.apache.commons.io.IOUtils;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//try {
//
//    File fis = new File("C:\\Users\\Prabhakaran\\" +
//            "IdeaProjects\\ApacheTrain\\Cars.txt");
//    FileReader fr =new FileReader(fis);
//    int ch;
//     while((ch=fr.read()) != -1) {
//
//         System.out.print((char)ch);
//              }
//
//
//} catch (IOException e) {
//    throw new RuntimeException(e);
//}
//

try {

InputStream ins = new FileInputStream("C:\\Users\\Prabhakaran\\" +
        "IdeaProjects\\ApacheTrain\\Cars.txt");
        System.out.println(IOUtils.toString(ins , "UTF-8"));

    }

catch (IOException e)

    {
  throw new RuntimeException(e);

    }}}
