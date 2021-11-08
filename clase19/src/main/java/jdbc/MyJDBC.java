package jdbc;

import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) {

        Connection connection = null;

        try{

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root", "root");

            connection.setAutoCommit(false); // va a permitir ejecutar las sentencias sql en bloques (transacciones)

            Statement statement = connection.createStatement();
//                PreparedStatement consultaPreparada = connection.prepareStatement("SELECT * FROM estudiante WHERE apellido=? AND dni BETWEEN ? AND ? ORDER BY apellido");
//                consultaPreparada.setInt(1,50000);
//                consultaPreparada.setInt(2,120000);

/*
                PreparedStatement consultaPreparada = connection.prepareStatement("SELECT * FROM estudiante WHERE apellido>=? AND dni BETWEEN ? AND ?;");
                consultaPreparada.setString(1,"Messi");
                consultaPreparada.setInt(2,50000);
                consultaPreparada.setInt(3, 100000);
                ResultSet consultaPreparada = consultaPreparada.executeQuery();

*/
            String consultaSelect = "SELECT * FROM estudiante";
            ResultSet primerResultSet = statement.executeQuery(consultaSelect);
            // ResultSet primerResultSet = statement.executeQuery("SELECT * FROM estudiante");

            while(primerResultSet.next()){
                System.out.println(primerResultSet.getString("id") + " " + primerResultSet.getString("nombre") + " " + primerResultSet.getString("apellido") + " " + primerResultSet.getString("dni"));
            }

            System.out.println();

            // String sentenciaUpdate = "INSERT INTO estudiante (dni, nombre, apellido) VALUES (90000, 'Pablo', 'Aimar');";

            statement.executeUpdate("INSERT INTO estudiante (dni, nombre, apellido) VALUES (91000, 'José', 'Aimar');");
            statement.executeUpdate("INSERT INTO estudiante (dni, nombre, apellido) VALUES (92000, 'Pablito', 'Aimar');");
            statement.executeUpdate("INSERT INTO estudiante (dni, nombre, apellido) VALUES (93000, 'Pedro', 'Aimar');");
            statement.executeUpdate("INSERT INTO estudiante (dni, nombre, apellido) VALUES (94000, 'Matías', 'Aimar');");
            statement.executeUpdate("INSERT INTO estudiante (dni, nombre, apellido) VALUES (95000, 'Mateo', 'Aimar');");

            // connection.commit(); // En este punto se ejecutan las sentencias sql previas al commit

/*
            statement.executeUpdate("DELETE FROM estudiante WHERE dni=91000;");
            statement.executeUpdate("DELETE FROM estudiante WHERE dni=9200;");
            statement.executeUpdate("DELETE FROM estudiante WHERE dni=93000;");
            statement.executeUpdate("DELETE FROM estudiante WHERE dni=94000;");
            statement.executeUpdate("DELETE FROM estudiante WHERE dni=95000;");
            connection.commit();
*/

            ResultSet segundoResultSet = statement.executeQuery(consultaSelect);
            while(segundoResultSet.next()){
                System.out.println(segundoResultSet.getString("id") + " " + segundoResultSet.getString("nombre") + " " + segundoResultSet.getString("apellido") + " " + segundoResultSet.getString("dni"));
            }

            System.out.println();


        }catch(SQLException e){
            // Instrucciones a ejecutar en caso que ocurra la excepción
            System.out.println(e.toString());

            if(connection != null){

                try {
                    connection.rollback();
                } catch (SQLException exception){
                    System.out.println(exception.toString());
                }

            }

        } finally {

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e){
                System.out.println(e.toString());
            }

        }

        }

}


