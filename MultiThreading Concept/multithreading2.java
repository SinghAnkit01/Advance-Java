class multithreading2 implements Runnable {
    // as far as java doesnt support multiple inheitance we have to achieve it
    // through multiple inheritance.
    // we are implementing pre-defined Runnable interface of java.
    // Runnable is the second way of creating Thread.
    @Override
    public void run() {
        try {
            System.out.println("multithreading2 is running");
            // int a = 20, b = 10;
            // int c = a - b;
            // System.out.println("Substraction of two number is:" + c);
             // we can perform any operation inside run()
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }

    }

}
