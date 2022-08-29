import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
// import java.net.UnknownHostException;
import java.util.Arrays;

// we have to define an url and we try to access bunch information of information how this website is hosting
public class networking {
    /**
     * @param args
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException  {
        String url = "www.google.com";
        System.out.println("information gathering of google.com");
        InetAddress inetAddress = Inet4Address.getByName(url);
        // inetAddress class contains all rhe information about internet address on which particular website is hosted
        // we have created an pre-defined InetAddress class object i.e. inetAddress = class(Inet4Address,Inet6Address) and get their information by url also we can fetch their information through their ipaddress. .
        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));
        // this will indicate the ip-address of website.
        // it has 4 section and this will going to return an address in the form of array of string i.e.[65,9,50,73] or anything.
        System.out.println("Host Address : " + inetAddress.getHostAddress());
        // getHostAddress()Method
        // it prints exact format of networking-world.
        // same values but different representation of address such as getHost and getAddress.
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());
        //  isAnyLocalAddressMethod()Method
        // returns boolean
        // if false then no wild-card address associated for this particular address or vice-versa.
        System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());
        // isLinkLocalAddress()Method
        // returns boolean
        // if false it means that address is not a linklocal unicast address or vice-versa
        System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());
        // // isLoopbackAddress()Method
        // returns boolean
        // if false it means website doesnt have a loopback address or vice-versa
        System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());
        // isSiteLocalAddress()Method
        // returns boolean
        // if false means inetaddress is not a site local unicast address or vice-versa

        // summary.....
        //  if all bool values are false it means a website which has been indicated in url section 
        // is built with a very good practice. means it doesnt have any loopback,anysitelocaladdress,
        // linklocal,or anylocaladdress.

        System.out.println("hashCode : " + inetAddress.hashCode());
        //  hasdCode()Method
    }
}
