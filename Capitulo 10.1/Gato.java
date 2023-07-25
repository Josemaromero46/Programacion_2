// Archivo: Gato.java

// Clase Gato que extiende de Animal
public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau miau");
    }
}
