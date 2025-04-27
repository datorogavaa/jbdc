//import org.hibernate.SQLQuery;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//import java.sql.*;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) throws ClassNotFoundException {
//       SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        Query query = session.createSQLQuery("SELECT * FROM jdbc_test.students");
//        List<Object[]> results  = query.list();
//        for (Object[] row : results) {
//            System.out.println("Column1: " + row[0] + ", Column2: " + row[1] + ", Column3: " + row[2]); // Adjust for your columns
//        }
//        session.close();
//        sessionFactory.close();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//






//        String user = "postgres";
//        String pass = "Prod12";
//        String Url = "jdbc:postgresql://localhost:5432/postgres";
//        Connection con = DriverManager.getConnection(Url,user,pass);
//        Statement st = con.createStatement();
//         Session session = new Configure()                                                                                                                                                            //        st.execute("INSERT INTO jdbc_test.students(\"Name\", \"Age\")\n" +
//                "\tVALUES (\'Nika\', \'21\');");
//        System.out.println("added");
//        ResultSet result = st.executeQuery("SELECT * FROM jdbc_test.students");
//        while (result.next()) {
//            String Name = result.getString("Name");
//            Integer Age = result.getInt("Age");
//            System.out.println("Name: " + Name + ", Age: " + Age);
//
//        }