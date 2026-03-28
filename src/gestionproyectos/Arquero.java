public class Arquero extends Tarea {
    private int flechas;

    public Arquero(String nombre, int flechas) {
        super(nombre);
        this.flechas = flechas;
    }

    public void disparar() {
        System.out.println("Disparando con " + flechas + " flechas");
    }
}