import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BytestreamExample {
    public static void main(String[] args) throws IOException {
    FileInputStream instream = null;
    FileOutputStream outstream = null;
    // this are the references of FileInputStream and FileOutputStream
      
    try {
        instream = new FileInputStream("C:\\All Languages\\Advanced java\\Input\\Output-Stream Concept\\source.txt");
        outstream = new FileOutputStream("C:\\All Languages\\Advanced java\\Input\\Output-Stream Concept\\destination.txt");

        // reads a byte at a tim, if it reached end of fil, returns -1;
        int content;

        while ((content = instream.read()) != -1) {
            // read the file source.txt until we reached to -1 means last byte and keep writing it on destination.txt
            outstream.write((byte)content);
        }
        
    }finally {
      if(instream!=null){
          instream.close();
      }
      if(outstream!=null){
          outstream.close();
      }
    }
}
}
