import java.io.*;
public class BufferedReadertest {
    public static void main(String[] args)throws Exception{
        FileReader inputting = new FileReader("testbuffer.txt");
        BufferedReader bufferReader = new BufferedReader(inputting);
        
        int i;
        while((i = bufferReader.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println("");

        bufferReader.close();
        inputting.close();
    }
    
}