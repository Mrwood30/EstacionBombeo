public class Oleoducto {
    public String nombre;            // cualquiera lo ve
    private double presionMaxima;    // solo esta clase

    public Oleoducto(String nombre, double presionMaxima) {
        this.nombre = nombre;
        this.presionMaxima = presionMaxima;
    }
}