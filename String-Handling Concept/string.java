// import java.util.Arrays;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Password:" + " ");
            String s = sc.nextLine();
            // String s= sc.nextInt();
            // for integer value
            // String s = sc.nextFloat();
            // for float value
            // System.out.println("your name is:" + " "+s);

            try (Scanner sc1 = new Scanner(System.in)) {
                System.out.print("Confirm your Passwords:" + " ");
                String s1 = sc.nextLine();
                // String str1 = " " + "Ankit is a programmer";
                // String str2 = "Hii i am ankit";
                // 1 string method
                // System.out.println(str1.length());
                // System.out.println(str2.length());
                // Note: counting starts from 1 till last including space.
                // 2 string method
                // accepting values from user using scanner class;
                if(s.equals(s1)){
                System.out.println("Passwords are match");
                }else{
                System.out.println("Passwords are not match");
                }
                // 3 string method
                // String result = str2.concat(str1);
                // System.out.println(result);
                // System.out.println(str2.concat(str1));
                // 4 string method
                // index counting strats from 0
                // System.out.println(str1.charAt(1));
                // 5 string method
                // String st = String.format("My name is" + "%s, and my age is %d","Ankit",20);
                // String st1 = String.format("my name is %s" + " " + "and my age is
                // %d","Ayush",17);
                // System.out.println(st);
                // System.out.println(st1);
                // 6 string method
                // this method is the reverse of charAt() method is use to find out the
                // character at specified values
                // and indexOf is used to find out the index at specified character
                // if you dont have character at specified string it will return -1 as a output
                // System.out.println(str1.indexOf('A'));
                // 7 string method
                // replace() nethod
                // suppose if two matches found it will replace all the matches with new one
                // (oldchar,newchar)
                // System.out.println(str2.replace('i', 'p'));
                // 8 string method
                // split() method
                // String[] arr = str1.split("Ankit");
                // Arrays.asList(arr).forEach(s -> System.out.println(s));
                // 9 string method
                // substring() method
                // it will going to take mini string out of a long string;
                // (starting-index,ending-index) but
                // in terms of printing it goes till (n-1) means(5-1) putput will be Anki.
                // System.out.println(str1.substring(1,5));
                // System.out.println(str2.substring(0,6));

            }
        }
    }
}
