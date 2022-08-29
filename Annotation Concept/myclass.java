import java.lang.reflect.Method;

public class myclass {
    @MyCustomAnnotation(value=10)
    // function name that means value as defined as 10
    public void sayhello() {
        System.out.println("My custom annotation");
    }
    public static void main(String[] args) throws Exception{
        myclass h = new myclass();
        Method m1 = h.getClass().getMethod("sayhello");
        MyCustomAnnotation mycustomannotation = m1.getAnnotation(MyCustomAnnotation.class);
        // fetching annotation using .getAnnotation method using reflection api of java.
        System.out.println("value is: " + mycustomannotation.value());
    }
}
