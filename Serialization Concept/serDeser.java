import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class serDeser{
    public static void main(String[] args) {
        serialization ser=new serialization("Ankit","Thane-06 sawarkar nagar");
        ser.setX(10);
        
        String filename="C:\\All Languages\\Advanced java\\Serialization Concept\\Serialization.txt";
        FileOutputStream fileout = null;
        ObjectOutputStream objout = null;
        // imp is ObjectPutputStream
        // serialization
        try {
            fileout=new FileOutputStream(filename);
            objout=new ObjectOutputStream(fileout);
            objout.writeObject(ser);
            // imp is objout.writeObject
            objout.close();
            fileout.close(); 
            System.out.println("Object has beed serialized:\n" + ser);
        } catch (Exception e) {
            System.out.println("IO Exception is caught");
       
        }
        // Deserialization
        
    
        FileInputStream fileint = null;
        ObjectInputStream objin = null;
        // String filename="C:\\All Languages\\Advanced java\\Serialization Concept\\Serialization.txt";
   
    try {
        fileint=new FileInputStream(filename);
        objin=new ObjectInputStream(fileint);
        serialization object = (serialization) objin.readObject();
        // casting serialization as class type because serialization is a class in another file 
        // imp is objout.writeObject
        fileint.close();
        objin.close(); 
        System.out.println("Object has beed deserialized:\n" + object);
        System.out.println("the deserialized value of x:"+ object.getX());
    } catch (Exception e) {
        System.out.println("IO Exception is caught");
   
    }
}
}

