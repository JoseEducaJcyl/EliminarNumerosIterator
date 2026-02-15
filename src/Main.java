import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos un ArrayList para numeros
        List<Integer> lista = new ArrayList<>();

        //Declaramos un scanner 
        Scanner sc = new Scanner(System.in);
        //Declaramos un boolean para controlar el bucle
        boolean continuar = true;
        //Le pedimos al usuario numeros hasta que escriba "0"
        while (continuar) {
            System.out.println("Introduce un numero (Cero para salir): ");
            int num = sc.nextInt();
            lista.add(num);
            if (num == 0) {
                continuar = false;
            }
        }
        //Con un interator recorremos la lista, si es par, se quita de la lista
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            int valor = iterator.next();
            if (valor % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Lista: " + lista);
    }
}
