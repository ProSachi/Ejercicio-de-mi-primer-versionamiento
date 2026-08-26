public class Zoologico {
    public static void main(String[] args) {
        
    Animal perro = new Animal();
    Animal gato = new Animal(true,"4",true,"Naranjado");

    gato.comer();
    gato.comer("OhMyCat");

    }
}
