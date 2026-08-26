import java.util.Scanner;

public class ValidacionStock {
    public static void main(String[] args) {

        String producto;
        int stockActual;
        int STOCKMINIMO = 5;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame el nombre del producto: ");
        producto = leer.next();
        System.out.println("Dame el stock actual: ");
        stockActual = leer.nextInt();
        if (stockActual < STOCKMINIMO) {
            System.out.println("El stock del producto " + producto + " esta por debajo del minimo.");
        }
        leer.close();
    }
}
