package jdbc.primeraclase;

import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root", "root");

            Statement statement = connection.createStatement();

            ResultSet primerResultSet = statement.executeQuery("SELECT * FROM estudiante");

            while(primerResultSet.next()){
                System.out.println(primerResultSet.getString("id") + " " + primerResultSet.getString("nombre") + " " + primerResultSet.getString("apellido"));
            }

            System.out.println();

            String sentenciaUpdate = "UPDATE estudiante SET dni = 80000, nombre= 'Lionel', apellido='Messi' WHERE id=9;";


            statement.executeUpdate(sentenciaUpdate);

            ResultSet segundoResultSet = statement.executeQuery("SELECT * FROM estudiante");

            while(segundoResultSet.next()){
                System.out.println(segundoResultSet.getString("id") + " " + segundoResultSet.getString("nombre")+ " " + segundoResultSet.getString("apellido"));
            }

        }catch(Exception e){
            // Instrucciones a ejecutar en caso que ocurra la excepción
            e.printStackTrace();
        }

    }

}
