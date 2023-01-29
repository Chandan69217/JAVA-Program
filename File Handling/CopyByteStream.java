import java.io.*;
public class CopyByteStream {
 public static void main(String agrs[]){
    File inputStream = new File("Input Into Byte Stream.txt");
    FileInputStream input = null;
    FileOutputStream output = null;
    int ch;
    try{
        input = new FileInputStream(inputStream);
        output = new FileOutputStream("Output From Byte Stream.txt");
        do{
            ch = input.read();
            if(ch!=-1)
            output.write(ch);
        }while(ch!=-1);
    }
    catch (FileNotFoundException e) {
        System.out.print("\nFile is not Found");
    }
    catch(IOException e){
        System.out.print(e);
    }
    try{
      input.close();
      output.close();
      System.out.print("Copy Sucessfully");
    }
    catch(IOException e){
        System.out.print(e);
    }
 }
}
