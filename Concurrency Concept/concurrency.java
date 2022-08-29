import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class concurrency {
    // example of executor interface.
    public static void main(String[] args) {
        // calling constructor at main method 
        executorInvoke();
        executorServiceInvoke();
    }
    private static void executorInvoke() {
        Executor executor = new Caller();
        // creating reference of Executor class and along with reference it needs a class or object.
        executor.execute(() ->{
            System.out.println("Executor example");
            
            // execute() is the user-defined method of Executor class
        });
        // () ->{
        //     System.out.println("Executor example");
        // } 
        // lambda function implemantation
    }
    private static void executorServiceInvoke() {
     ExecutorService executorService = Executors.newFixedThreadPool(10);
    //  
     executorService.submit(()->{
         System.out.println("Executor Service Example");
        //  submit() is the pre-defined method of ExecutorService class.
     });
    }
        
      
}
