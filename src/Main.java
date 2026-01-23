import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Introduce un numero (Cero para salir): ");
            int num = sc.nextInt();
            lista.add(num);
            if (num == 0) {
                continuar = false;
            }
        }
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