public class FamiliaHernandez {

    String nombre;
    static final String APELLIDO = "Hernández";
    int edad;

    public FamiliaHernandez(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void saludar() {
        System.out.println("Hola somos la familia " + APELLIDO);
    }
}
