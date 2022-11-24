import java.sql.*;
import java.io.*;

class sharma
{
    String na, cl;
    int ro, yr;
    Connection con;
    Statement st;
    ResultSet rs;
    public void sumi()
    {
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    }catch(
    ClassNotFoundException e)
    {
        System.out.print(e.getMessage());
    }try
    {
        con = DriverManager.getConnection("jdbc:odbc:chandan", "c##chandan", "sharma");
        st = con.createStatement();
        rs = st.executeQuery("select * from babulog");
        System.out.print("\nLIST OF RECORDS");
        while (rs.next()) {
            // na=rs.getString(rs(0));
            // ro=rs.getInt(rs(1));
            // cl=rs.getString(rs(2));
            // yr=rs.getInt(rs(3));
            na = rs.getString("name");
            ro = rs.getInt("roll");
            cl = rs.getString("class");
            yr = rs.getInt("year");
            System.out.printf("\n%20s%4d%10s%2d", na, ro, cl, yr);
        }
        st.close();
        con.close();
    }catch(SQLException e)
    {
        System.out.print(e.getMessage());
    }
} 
}


class chandan 
{
    public static void main(String x[])
     
    {
      sharma s2 = new sharma();  
      s2.sumi();
    }
}
