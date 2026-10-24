
import java.sql.*;

public class DisplayStudents {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:ucanaccess://D:/java_lab/ICE_PUST.accdb";

        Connection con = DriverManager.getConnection(url);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM Student");

        while (rs.next()) {
            System.out.println("Name: " + rs.getString("Name"));
            System.out.println("Email: " + rs.getString("Email"));
            System.out.println("Phone: " + rs.getString("Phone"));
            System.out.println("----------------");
        }

        rs.close();
        st.close();
        con.close();
    }
}
