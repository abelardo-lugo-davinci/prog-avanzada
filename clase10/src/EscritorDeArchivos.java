import java.io.FileWriter;
import java.io.IOException;

public class EscritorDeArchivos {
    public static void main(String[] args) {

        try {
            FileWriter escritorDelArchivo = new FileWriter("archivo.txt");
            escritorDelArchivo.write("Hola Mundo");
            escritorDelArchivo.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }

    }
}
