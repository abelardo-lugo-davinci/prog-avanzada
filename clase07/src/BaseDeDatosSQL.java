public class BaseDeDatosSQL implements IAccesoDatos {


    @Override
    public void crear() {
        System.out.println("Insertar un registro en la base de Datos MySQL: ");
    }

    @Override
    public void consultar() {
        System.out.println("Consultar un registro en la base de Datos MySQl: ");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar un registro en la base de Datos MySQl: ");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar un registro en la base de Datos MySQl: ");
    }
}
