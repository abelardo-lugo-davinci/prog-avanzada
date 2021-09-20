import java.io.File;
import java.io.IOException;

public class CreadorDeArchivos {
    public static void main(String[] args) {

        try {
            File archivo = new File("archivo.txt");
<<<<<<< HEAD

            if (archivo.createNewFile()) {
                System.out.println("Se creó el archivo de texto: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }

            archivo.delete();

=======
            if (archivo.createNewFile()) {
                System.out.println("Se creó el archivo de texto" + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
>>>>>>> 4e872118a16f0753ae77c03be4c01deb7dc000ed
        } catch (IOException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }
<<<<<<< HEAD

=======
>>>>>>> 4e872118a16f0753ae77c03be4c01deb7dc000ed
    }

}
