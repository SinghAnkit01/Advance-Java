
/**
 * multithreading
 */

 class multithreading extends Thread{
    //  Thread is the parent class and we are acheiving it through single-level . inheritance
         // First way to create Thread
    //  Thread class wil ask me to override run() method

@Override
public void run(){
    // thread may can come in run() method is fuel indicator,speedometer,laps to be covered by the user,
        // leaderboard position and many more different threads running at a same time in a car game.
     
     
        try {
        System.out.println("Multithreading is running");
        // int a=10,b=20;
        // int c=a+b;
        // System.out.println("Addition of two number is:" + c);
        // we can perform any operation inside run()
       
    } catch (Exception e) {
        System.out.println("Exception raised" + e);
    }
    
}
}

    
