import java.sql.*;
public class TestConnection {
    public static void main(String []args)
    {
        String na,cl;
        int ro,yr;
        Connection con;
        Statement st;
        ResultSet rs;
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
            try
            {
              con = DriverManager.getConnection(url,"c##chandan","sharma");
             System.out.println("Connection Established");
             st=con.createStatement();
             rs=st.executeQuery("select * from babulog");
             System.out.println("\nList of Records");
             while(rs.next())
             {
                na = rs.getString("name");
                ro = rs.getInt("roll");
                cl = rs.getString("class");
                yr = rs.getInt("year");
                System.out.printf("\n%20s%4d%10s%2d",na,ro,cl,yr);
             }
             st.close();
             con.close();
            }catch(SQLException e)
            {
                System.out.println("Connection not Established");
            }
        } catch(ClassNotFoundException e)
        {
            System.out.println("Driver not Loaded");
        }
    }
}
