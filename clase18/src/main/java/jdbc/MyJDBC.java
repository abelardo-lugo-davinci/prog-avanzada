package main.java.jdbc;

import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root", "root");

              // Statement statement = connection.createStatement();
//                PreparedStatement consultaPreparada = connection.prepareStatement("SELECT * FROM estudiante WHERE apellido=? AND dni BETWEEN ? AND ? ORDER BY apellido");
//                consultaPreparada.setInt(1,50000);
//                consultaPreparada.setInt(2,120000);

                PreparedStatement consultaPreparada = connection.prepareStatement("SELECT * FROM estudiante WHERE apellido>=? AND dni BETWEEN ? AND ?;");
                consultaPreparada.setString(1,"Messi");
                consultaPreparada.setInt(2,50000);
                consultaPreparada.setInt(3, 100000);

            // String consultaSelect = "SELECT * FROM estudiante";

            // ResultSet primerResultSet = statement.executeQuery("SELECT * FROM estudiante");
            // ResultSet primerResultSet = statement.executeQuery(consultaSelect);

            ResultSet resultSet = consultaPreparada.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString("id") + " " + resultSet.getString("nombre") + " " + resultSet.getString("apellido") + " " + resultSet.getString("dni"));
            }

            System.out.println();
//
//            String sentenciaUpdate = "INSERT INTO estudiante (dni, nombre, apellido) VALUES (90000, 'Pablo', 'Aimar');";
//
//            statement.executeUpdate(sentenciaUpdate);
//
//            ResultSet segundoResultSet = statement.executeQuery("SELECT * FROM estudiante");
//
//            while(segundoResultSet.next()){
//                System.out.println(segundoResultSet.getString("id") + " " + segundoResultSet.getString("nombre")+ " " + segundoResultSet.getString("apellido"));
//            }

        }catch(Exception e){
            // Instrucciones a ejecutar en caso que ocurra la excepción
            e.printStackTrace();
        }

    }

}
