public class sync2 implements Runnable {
    mathutils mu;
    //  both sync1 and sync2 have reference to a class mathutils
    public sync2(mathutils mu) {
        this.mu=mu;
    }
    public void run() {
        try {
            mu.getmultiples(3);
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
      
}
} 