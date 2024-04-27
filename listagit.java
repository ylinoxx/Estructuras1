import java.util.LinkedList;
import java.util.Scanner;

public class listagit {
    public static void main(String[] args) {
        LinkedList<nodoslista> empleados = new LinkedList<nodoslista>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            nodoslista item = new nodoslista(null, null, i, null, null);
            System.out.println("Porfavor ingrese el nombre");
            item.setNombre(in.next());
            System.out.println("Ingrese el apellido");
            item.setApellido(in.next());
            System.out.println("Ingrese la edad");
            item.setEdad(in.nextInt());
            System.out.println("Ingrese la direccion");
            item.setDireccion(in.nextLine());
            System.out.println("Ingrese el cargo");
            item.setCargo(in.next());
        }
        String cadena = " ";
        for (nodoslista nodoslista : empleados) {
            cadena = nodoslista.getNombre() + "\n" + nodoslista.getApellido() + "\n" + nodoslista.getEdad() + "\n" + nodoslista.getDireccion() + "\n" + nodoslista.getCargo() + "\n";
        }
        System.out.println(cadena);
    }
}
