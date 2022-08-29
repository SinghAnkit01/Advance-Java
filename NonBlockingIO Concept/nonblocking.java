import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class nonblocking {
    // nio package are generic it can be used for any kind of communication whether for reading and writing.
    // if you want to read pre-defined classes just put the cursor on it and click ctrl..
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\All Languages\\Advanced java\\NonBlockingIO Concept\\source.txt");

        // uses to read a file from a given source.
        FileChannel readchannel = fin.getChannel();
        // we have created a filechannel because we are dealing with file if we are dealing with socket we have to create socket channel. 
        // fin.getchannel() contains the object of FileInputStream and reference of FileChannel.
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        // Allocating size to a file(1024 bytes) using tool of nio package.
        int result = readchannel.read(readBuffer);
        // channel-object.read(size using ByteBuffer Class) and passing buffer object to it.
        System.out.println("File read Successfully" +" " + result);
        fin.close();
         FileOutputStream fout = new FileOutputStream("C:\\All Languages\\Advanced java\\NonBlockingIO Concept\\destination.txt");
        //  providing destination for file writing
         FileChannel writeChannel = fout.getChannel();
        //  creating channel for writing purpose.
         ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        //  creating bytebuffer for writing purpose.
         String message = "This is a test string";
        
         writeBuffer.put(message.getBytes());
        //  writeBuffer will take string and write into the file. byte-by-byte using .put() and .getBytes() method.
         writeBuffer.flip();
        //  used to reset the index to [0]
         writeChannel.write(writeBuffer);
        //  writing buffer to the channel using channel-object.write() method and passing buffer object to it.
         System.out.println("File Written Successfully");
         fout.close();


        //  int content;

        // while ((content = fin.read()) != -1) {
        //     // read the file source.txt until we reached to -1 means last byte and keep writing it on destination.txt
        //     fout.write((byte)content);
        //     System.out.println("File has been written successfully");
        // }
        // fin.close();
        // fout.close();
    }
}
