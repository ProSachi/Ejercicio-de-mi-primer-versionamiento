public class Animal {
    // caracteristicas o atributos
    boolean tienePatas;
    String patas;
    boolean tieneCola;
    String color;
    String especie;

    // constructores

    public Animal() {
    }

    public Animal(boolean tienePatas, String patas, boolean tieneCola, String color) {
        this.tienePatas = tienePatas;
        this.patas = patas;
        this.tieneCola = tieneCola;
        this.color = color;
    }

    // acciones (metodos)
    public void volar() {
        System.out.println("El animal vuela");
    }

    public void correr() {
        System.out.println("El animal vuela");
    }

    public void comer() {
        System.out.println("El animal come cuido");
    }

    public void comer(String cuido) {
        System.out.println("El animal solo como este cuido: " + cuido);
    }

}
