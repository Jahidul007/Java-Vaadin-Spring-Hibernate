import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String [] args) {

        // The name of the file to open.
    	String fileName = "temp.txt";
    	String fileName1 = "temp1.txt";
       

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);
            FileWriter fileWriter =
                    new FileWriter(fileName1);

           
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
          
            int i=1;
            while((line = bufferedReader.readLine()) != null && i<=2000) {
            	System.out.println("insert into pertable values("+i+", '"+line+"');");
            	
            	
        		String c ="insert into pertable values("+i+", '"+line+"');\n";
        		bufferedWriter.write(c);
        		i++;
        		

  
            }   

            System.out.println("Read and write successful!!!!!!!!!");
            // Always close files.
            bufferedReader.close(); 
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}