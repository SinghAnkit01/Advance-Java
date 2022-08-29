// import java.lang.ProcessBuilder.Redirect.Type;

public class autoboxing {
    public static void main(String[] args) {
       int i=10;
    //    Autobox
    Integer I1 = Integer.valueOf(i);
    System.out.println("Value of Integer-Class:" + I1);
    // int a=(int) Typeof(I1);
    // System.out.println(a);

    // Auto-Unbox
    int i1=I1;
    System.out.println("Value of Primitive-DataType:" + i1);

    // char Autoboxing

    char x='A';
    //    Autobox
    // Integer C1 = Integer.valueOf(x); .........................(1)
    // this line will going to print an ascii value of given character.line(1,2)
    Character C1 = Character.valueOf(x);
    System.out.println("Value of character-Class:" + C1);
    // int a=(int) Typeof(I1);
    // System.out.println(a);

    // Auto-Unbox
    // int c1=C1;..................................(2)
    char c1=C1;
    System.out.println("Value of Primitive-CharDataType:" + c1);
    }
    }
    

    

