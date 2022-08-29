 class synchronizationDemo {
  public static void main(String[] args) {
      mathutils obj = new mathutils();

     sync1 s1 = new sync1(obj);
     Thread s2 = new Thread(new sync2(obj));
     s1.start();
     s2.start();
    //  flow of execution
    // synchronizationDemo.java(obj,s1.start()to sync1.java,s2.start.sync2.java) -> sync1 && sync2 -> mathutils.java
    // s1.start() will call the method void run externally and then mu=obj.getmultiples(2) will call himself
    // and then cursor will move to mathutils.java
}
}
