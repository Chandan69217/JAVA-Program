import java.io.*;
public class CopyCharacter {
  public static void main(String agrs[]){
    File inFile = new File("Input File.txt");
    File outfile = new File("Output File.txt");
    FileReader filereader = null;
    FileWriter filewriter = null;

    try{
         filereader = new FileReader(inFile);
         filewriter = new FileWriter(outfile);
         int ch;
         do{
            ch = filereader.read();
            filewriter.write(ch);
         }while(ch!=-1);
    }
    catch(FileNotFoundException e){
        System.out.print("\nFile Not Found");
    }
    catch(IOException e){
        System.out.print(e);
    }
    try{
        filereader.close();
        filewriter.close();
        System.out.print("\nFile Copy Succesfully");
    }catch(IOException e){
        System.out.print(e);
    }
  }  
}
