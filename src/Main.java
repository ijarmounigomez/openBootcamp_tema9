public class Main {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        Trabajador miTrabajador = new Trabajador();
        System.out.println(miCliente.edad);
        System.out.println(miCliente.nombre);
        System.out.println(miCliente.telefono);
        System.out.println(miCliente.credito);
        System.out.println(miTrabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    public int credito;
}

class Trabajador extends Persona {
    public int salario;
}