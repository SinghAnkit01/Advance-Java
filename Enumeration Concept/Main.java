public class Main {
    public static void main(String[] args) {
        enumeration e1=enumeration.RED;
        // pointing RED enum types of class enumeration
        enumeration e2=enumeration.GREEN;
         // pointing GREEN enum types of class enumeration

        
        // e1 is for RED enum type which has been declared in enumeration.java
        // e2 is for GREEN enum type which has been declared in enumeration.java
        // i have use enumeration class for creating object in Main class.
        // thats why enumeration and Main class get connected.
       
        System.out.println("Red Enum name: " + e1.name());
        System.out.println("Green Enum name: " + e2.name());
        // predefined (.name) method to returns the name of enums
        System.out.println("Red enum values " + e1.getvalue());
        System.out.println("Red enum values " + e2.getvalue());
    }
}

