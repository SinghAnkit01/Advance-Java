// import java.io.*;
// import java.sql.*;
// // import javax.servlet.*;
// // import javax.servlet.http.*;
import java.sql.Connection;
// import java.net.HttpURLConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



// public class jdbc
// {
//     public static void main(String args[]) throws SQLException{
//  { 
//  Connection con=null;
//  PreparedStatement ps=null;
// //  response.setContentType("text/html");
// //  PrintWriter out = response.getWriter();
//  String username=request.getParameter("uname");
//  String password=request.getParameter("pw");
//  String emailid=request.getParameter("email");
//  String country=request.getParameter("coun");
//  try{ 
//      Class.forName("com.mysql.jdbc.Driver");
//  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/netbeans","root","admin");
//  System.out.println("connection done successfully...");
 
//  //user name="root","admin";
//  ps=con.prepareStatement("insert into register values (?,?,?,?)");
//  ps.setString(1,username);
//  ps.setString(2,password);
//  ps.setString(3,emailid);
//  ps.setString(4,country);
//  ps.execute();
//  System.out.println("Data inserted successfully!!!!");
//  }catch(Exception e) { System.out.println(e);; }
//  System.out.println("<b>"+"<b>");
//  }
// }
// }

public class jdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // creating the connection
        // Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/netbeans";
        Connection conn = null;
        String username="Raja";
        int password = 123456789;
        String x= "abc123@gmail.com";
        String country = "India";
        String sql = "insert into register(Username,Password,Email,Country)" + "values('" + username + "'',"+ password +",'"+ x +"','"+ country +"')";
        try{
            
            conn = DriverManager.getConnection(url,"root","admin");
            Statement st =conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m==1)
            System.out.println("inserted successfully:" + sql);
            else
            System.out.println("insertion Failed");

        }catch(Exception ex){
            System.err.println(ex);
        }finally{
            // conn.close();    
        }

    }
}





