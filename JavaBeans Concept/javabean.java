import java.io.Serializable;

public class javabean implements Serializable {
    // defining private attributes
    private String name;
    private int age;
    private String address;
    // java bean automatically generate default constructor at the time of compiling the program. like
    // student(){//no-body} or we can give it  manually.
    // public javabean(String name,int age,String address){
    //     this.name = name;
    //     this.age = age;
    //     this.address = address;
    // }
    public javabean(){
        // default no-argument constructor
    }
    public void setname(String name){
        this.name=name;
        System.out.println(name);
    }
    public void setage(int age){
        this.age=age;
        System.out.println(age);
    }
    public void setaddress(String address){
        this.address=address;
        System.out.println(address);
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getaddress(){
        return address;
    }
    @Override
    public String toString(){
        return("Student name is" + this.getname() + "age is" + this.getage() + "and address is" + this.getaddress());
    }
    public static void main(String[] args) {
        javabean jb = new javabean();
        jb.setname("ankit");
        jb.setage(21);
        jb.setaddress("Thane-06");
        String a = jb.getname();
        System.out.println(a);
        int a1 = jb.getage();
        System.out.println(a1);
        String a2 = jb.getaddress();
        System.out.println(a2);
        
    }
}
