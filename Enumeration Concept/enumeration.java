// public class enumeration {
//     public static void main(String[] args) {
//         System.out.println("hii i am using enumeration here..");
//     }
// }
public enum enumeration{
    RED("red"),GREEN("green");
    // enum constant and enum variables
    private String value;

    enumeration(String value){
        this.value=value;
        // getting and setting  the value in enumeration constructor and storing it into value variable.
    }
    public String getvalue(){
        return value;
        // string as a return_type instead of void because void cannot return the value.
    }
}
    
