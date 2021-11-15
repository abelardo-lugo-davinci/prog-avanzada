package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class MyJDBC {

    public static void main(String[] args) {

        Connection connection = null;

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("José");
        nombres.add("Pablo");
        nombres.add("Pedro");

        ArrayList<String> apellidos = new ArrayList<>();
        apellidos.add("Pérez");
        apellidos.add("Gonzalez");
        apellidos.add("Fernandez");

        ArrayList<Integer> DNIs = new ArrayList<>();
        DNIs.add(100000);
        DNIs.add(20000);
        DNIs.add(30000);

        try{

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "root");
            connection.setAutoCommit(false);

            // PreparedStatement consultaPreparada = connection.prepareStatement("INSERT INTO estudiante (dni, nombre, apellido) VALUES (?, ?, ?);");
            // PreparedStatement consultaPreparada = connection.prepareStatement("DELETE FROM estudiante WHERE id>10");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM estudiante WHERE id>10");

/*
            for (int i = 0; i < 3; i++) {
                consultaPreparada.setInt(1,DNIs.get(i));
                consultaPreparada.setString(2,nombres.get(i));
                consultaPreparada.setString(3,apellidos.get(i));
                consultaPreparada.executeUpdate();
            }
*/

            String consultaSql= "SELECT * FROM estudiante";

            ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiante");

            connection.commit();

            while(resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
            }

        }catch (SQLException sqlException){

            System.out.println(sqlException);
            if(connection != null){
                try{
                    connection.rollback();
                } catch (SQLException sqlException1){
                    System.out.println(sqlException1);
                }
            }

        }finally{

            try{
                if(connection != null){
                    connection.close();
                }
            }catch (SQLException sqlException){
                System.out.println(sqlException);
            }

        }

    }

}
