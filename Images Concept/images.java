import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// import javafx.scene.image.Image;

public class images {
   public static void main(String[] args) throws IOException{
    int width = 963;
    int height = 640;
    BufferedImage image = null;
    // pre-defined class for imagehandling in java.
    // creating reference of BufferedImage
    //   String str = "C:\\All Languages\\Advanced java\\Images Concept\\flag.jpg";
    image = readFromFile(width,height,image);
    // this method will going to extract image from the given path. 
    // summary: after reading operation done image variable contains Flag.jpg means image.
    writeToFile(image);
    // calling writeToFile() and passing Flag.jpg into it.
    // this method will going to print the image into a file. 
     
   }



private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
    try {
        File sampleFile = new File("C:\\All Languages\\Advanced java\\Images Concept\\flag.jpg");
        // first step is to create file object.
        image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        // creating objet of BufferedImage Class
        // reading input from the file
        image = ImageIO.read(sampleFile);
        // ImageIO is the pre-defined java utility for image read and image write using (read() and write() static method).
        // image variable is accepting output from sampleFile object and also it is acting as a object for BufferedImage class.
        System.out.println("Raading Complete." + image);
    } catch (Exception e) {
        System.out.println("Error : " + e);
    }
   
    return image;
    // and then return the image object it means all 0kay and reading operation is done
} 
private static void writeToFile(BufferedImage image1) throws IOException {
    // BufferedImage is a pre-defined class we can use it as a arguments or we can pass whole reference of BufferedImage
    // one static method can call other static method.
    try {
        File output = new File("C:\\All Languages\\Advanced java\\Images Concept\\imageOutput1.jpg");
        ImageIO.write(image1,"jpg", output);
        // passing whole image object,file-type,destination-location.
        // ImageIO class containsvconvenience static methods for locating(image reader) and (image writer) and performing simple encoding and decoding.
        System.out.println("Writing Complete");
    
      
    } catch (IOException e) {
       System.out.println("Error : " + e);
    }
   
}
}
