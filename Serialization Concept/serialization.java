import java.io.Serializable;

class serialization implements Serializable{

private String name;
private String address;

// public static void main(String[] args) {
 

// }
transient int x;
// if transient value=0; otherwise value=10 if not transient ;
// if i want to keep any variable safe or secured we can use it as transient.
// transient variable is not being accessed to consumer machine

public serialization(String name, String address){
    this.name=name;
    this.address=address;
}
public void setname(String name){
    this.name=name;
}
public void setaddress(String address){
    this.address=address;
}
public String getname(){
    return name;
}
public String getaddress(){
    return address;
}
public void setX(int x){
    this.x=x;
}
public int getX(){
    return x;
}

@Override
public String toString(){
    
    // return address;
    return("Student name is:" + this.getname() + ", Address of student is:" + this.getaddress());

}

}

   

