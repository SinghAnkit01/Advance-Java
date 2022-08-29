
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class characterstreamExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
         reader = new FileReader("C:\\All Languages\\Advanced java\\Input\\Output-Stream Concept\\source.txt");
         writer = new FileWriter("C:\\All Languages\\Advanced java\\Input\\Output-Stream Concept\\destination.txt");
            // creating an object for FileReader and FileWriter are reader and writer
        // reding source file and writing content to a target file character by character

        int content;
        while ((content = reader.read()) != -1) {
            // read the file source.txt until we reached to -1 means last byte and keep writing it on destination.txt
           
            // writer.write((byte)content);
            // above line is used to write content byte-by-byte
            writer.append((char)content);
            // above line is used to write content character-by-character thats why we are appending a
            // single character 
        }
        }finally{
                                if(reader!=null){
                                    reader.close();
                                }
                                if(writer!=null){
                                    writer.close();
                                }
        }

    }   
} 


