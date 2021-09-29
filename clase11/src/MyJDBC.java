import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc-practica","root","root");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM personas;");

            System.out.println(resultSet);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("idpersonas") + " " + resultSet.getString("Nombre"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
