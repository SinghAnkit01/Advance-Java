public class singleGenerics<T>{
    T obj1;

singleGenerics(T obj1){
    this.obj1=obj1;
}
public T getobjet(){
    return this.obj1;

}
public static void main(String[] args) {
    // This generic is are of integer type.
    singleGenerics<Integer> iobj = new singleGenerics<Integer>(10);
    // System.out.println("Generic are of Integer type :" + iobj.getobjet());
    // System.out.println( iobj.getobjet());
    System.out.println("Value of Integer generic is:" + iobj.getobjet());
     // This generic is are of integer type.
     singleGenerics<String> sobj = new singleGenerics<String>("Hii i am string generic");
    //  System.out.println("Generic are of Integer type :" + sobj.getobjet());
    // System.out.println( sobj.getobjet());
    System.out.println("Value of string generic is:" + sobj.getobjet());
}

}