// Archivo: Perro.java

// Clase Perro que extiende de Animal
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau");
    }
}
