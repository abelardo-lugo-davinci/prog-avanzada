import java.io.File;
import java.io.IOException;

public class CreadorDeArchivos {
    public static void main(String[] args) {

        try {
            File archivo = new File("archivo.txt");

            if (archivo.createNewFile()) {
                System.out.println("Se creó el archivo de texto: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }

            archivo.delete();

        } catch (IOException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }

    }

}
