// Archivo: Main.java

// Clase principal para probar el polimorfismo
public class Prueba {
    public static void main(String[] args) {
        Animal perro = new Perro("Perro Bobby");
        Animal gato = new Gato("Gato Pelusa");

        // Utilizando polimorfismo para invocar el método hacerSonido()
        hacerRuidoDelAnimal(perro);
        hacerRuidoDelAnimal(gato);
    }

    // Método que utiliza polimorfismo
    public static void hacerRuidoDelAnimal(Animal animal) {
        animal.hacerSonido();
    }
}
