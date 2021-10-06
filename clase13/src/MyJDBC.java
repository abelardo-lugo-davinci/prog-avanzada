import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc-practica","root","root");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiantes;");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            // System.out.println(resultSetMetaData);

            int numeroDeColumnas = resultSetMetaData.getColumnCount();

            System.out.println(numeroDeColumnas);

            System.out.println( "Tabla de alumnos:" );

            for (int i = 1; i <= numeroDeColumnas; i++) {
                System.out.printf("%-8s\t", resultSetMetaData.getColumnName( i ));
            }

            System.out.println();

            while (resultSet.next()) {
                for ( int i = 1; i <= numeroDeColumnas; i++ )
                    System.out.printf( "%-8s\t", resultSet.getObject( i ) );
                    System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
