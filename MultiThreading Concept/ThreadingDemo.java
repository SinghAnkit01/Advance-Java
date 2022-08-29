 class ThreadingDemo {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++)
        {
            multithreading m1 =  new multithreading();
            m1.start();
            // there is no start method in multithreading file but it calls the run() internally in java jdk;
            //  start() will change the state of thread from ready to running;
            // as soon as we invoke a start() thread will start running.
            Thread m2 =  new Thread(new multithreading2());
            // Thread is pre-defined class in java (jdk thread class) and we can use it as a parent class in inheritance.
            // initialization is bit different as shown above because in class multithreading2 we are using
            // Runnable as a interface.
            // (new multithreading()) is own class type.
            m2.start();
            // in the output you will see that Thread is not running in sequential manner this is the power of 
            // concurrency this is because threads never run in sequence threads run in parallel;
        }
    }
}
