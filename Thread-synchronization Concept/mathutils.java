public class mathutils {
//    synchronized void getmultiples(int n){
    void getmultiples(int n){
    //    after setting synchronized keyword before a method it will display a output in well-Fashioned manner.
    //    after setting synchronized sync1 thread will lock the object of mathutils class(obj)object until
    //    sync1 will not finished its execution sync2 will not be able to accessed mathutils class(obj)object 
    //    getmultiples() is accessing multiple thread at a same time i.e. sync1.java which
    // has been inherited from Thread(pre-defined Thread of java jdk) and sync2 which
    //  is  come from Runnable interface.
     synchronized (this){
        for(int i=1;i<=5;i++){
            System.out.println(n * i);
            // 2x2=4;
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
}
// if we dont want to lock the object using synchronized keyword we have to analyze thread sensitive code
// if we have analyze thread sensitive code then we can give synchronized(this){thread sensitive code}
// this will prevent the entry of multiple thread and if one thread will enter it will lock the thread
// -sensitive-code by using synchronized(this){} syntax it work as same as synchronized keyword.