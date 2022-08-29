public class doubleGenerics<T,U>{
    T obj1;
    U obj2;

doubleGenerics(T obj1,U obj2){
    this.obj1=obj1;
    this.obj2=obj2;
}
// for method 1
// public T getobjetT(){
//     return this.obj1;
// }
// public U getobjetU(){
//     return this.obj2;
// }
// for method 2
public void display() {
    System.out.println(obj1);
    System.out.println(obj2);
}
public static void main(String[] args) {
    
   doubleGenerics<Integer,String> iobj = new doubleGenerics<Integer,String>(10,"Hii");
    
    // method 1
    // System.out.print("My Roll no is:" + iobj.getobjetT());
    // System.out.println(" " + iobj.getobjetU() + " " + "mam my name is Ankit");
    // method 2
    iobj.display();

    
    
     doubleGenerics<String,Integer> sobj = new doubleGenerics<String,Integer>("Ankit",10);
    
    // method 1
    // System.out.print("Hii mam my name is:"+ " " + sobj.getobjetT());
    // System.out.print(" " +"and my roll-no is:"+ " " + sobj.getobjetU());
    // method 2
    sobj.display();
}

}
