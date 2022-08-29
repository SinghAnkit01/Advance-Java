import java.util.concurrent.Executor;

public class Caller implements Executor {
    @Override
    public void execute(Runnable runnable) {
        runnable.run();
       
        // creating our own thread called runnable and running it through runnable.run() method.
        // object will call using object.function-name()->void execute()->thread wil using runnable run()->
        // lambda function of executorInvoke()-> Function-Body
    }

   
}
