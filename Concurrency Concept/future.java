import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class future {
    public static void main(String[] args) {
        //  initializing ExecutorService class
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // if a single thread terminated due to some kind of reason then Executors.newSingleThreadExecutor will create a new thread automatically.
        Future<String> future = executorService.submit(()->{
            // creating runnable thread called Thread.sleep().
            Thread.sleep(10000);
            // sleeping the thread for 10 sec
            return "Completed";
        });
        try {
            while (!future.isDone()) {
                // if true then task completed otherwise false then below task will run.
                System.out.println("Task still in progress....wait");
                // this block is used to check status of above thread.
                // this block is asynchronous block this block will not going to wait above thread
                // to be completed it will execute according to its own reference.
                Thread.sleep(500);
            }
            System.out.println("Task Completed");
            String result = future.get(3000,TimeUnit.MILLISECONDS);
            // result = completed.
            // future.get() method will going to fetch the result of future object as mentioned above.
            System.out.println(result);
            executorService.shutdown();
        } catch (Exception e) {
           future.cancel(true);
        //    we can cancel the running task explicitly by using above method.
           future.isDone();
        //   use for checking status of program  
           future.isCancelled();
        //    to check if the user or some other process explicitly cancelled the execution of the
        // submission of the executorService task.
        //  this 3 are methos of future object.
        // asynchronous is very important concept to be used in concurrent application.
                }
    }
}
