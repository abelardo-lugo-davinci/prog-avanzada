package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class MyJDBC02 {

    public static void main(String[] args) {

        Connection connection = null;

        try{

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "root");
            connection.setAutoCommit(false);

            PreparedStatement consultaPreparada = connection.prepareStatement("INSERT INTO estudiantes (dni, nombre, apellido) VALUES (?, ?, ?);");

            // PreparedStatement consultaPreparada = connection.prepareStatement("DELETE FROM estudiantes WHERE id>10");
            // Statement statement = connection.createStatement();
            // statement.executeUpdate("DELETE FROM estudiantes WHERE id>10");

            consultaPreparada.setString(1,"200000");
            consultaPreparada.setString(2,"John");
            consultaPreparada.setString(3,"Doe");

            consultaPreparada.executeUpdate();

            connection.commit();

            ResultSet resultSet = consultaPreparada.executeQuery("SELECT * FROM estudiantes");

            while(resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
            }

        }catch (SQLException sqlException1){

            System.out.println(sqlException1);
            if(connection != null){
                try{
                    connection.rollback();
                } catch (SQLException sqlException2){
                    System.out.println(sqlException2);
                }
            }

        }finally{

            try{
                if(connection != null){
                    connection.close();
                }
            }catch (SQLException sqlException3){
                System.out.println(sqlException3);
            }

        }

    }

}
