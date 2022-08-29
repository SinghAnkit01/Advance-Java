
    
/**
 * multithreading
 */

 class sync1 extends Thread{
 mathutils mu;
//  both sync1 and sync2 have reference to a class mathutils
public sync1(mathutils mu) {
    this.mu=mu;
}
public void run() {
    try {
        mu.getmultiples(2);
    } catch (Exception e) {
        System.out.println("Exception is caught");
    }
    
}
}

    


