import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String user = "postgres";
        String pass = "Prod12";
        String Url = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = DriverManager.getConnection(Url,user,pass);
        Statement st = con.createStatement();
        st.execute("INSERT INTO jdbc_test.students(\"Name\", \"Age\")\n" +
                "\tVALUES (\'Nika\', \'21\');");
        System.out.println("added");
//        ResultSet result = st.executeQuery("SELECT * FROM jdbc_test.students");
//        while (result.next()) {
//            String Name = result.getString("Name");
//            Integer Age = result.getInt("Age");
//            System.out.println("Name: " + Name + ", Age: " + Age);
//
//        }

    }
}
