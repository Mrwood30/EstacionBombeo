public class Oleoducto {
    public String nombre;
    private double presionMaxima;

    public Oleoducto(String nombre, double presionMaxima) {
        this.nombre = nombre;
        setPresionMaxima(presionMaxima);   // también valida al crear
    }

    // Getter: consultar
    public double getPresionMaxima() {
        return presionMaxima;
    }

    // Setter: cambiar con validación
    public void setPresionMaxima(double valor) {
        if (valor > 0 && valor <= 2000) {
            this.presionMaxima = valor;
        } else {
            System.out.println("Valor rechazado: " + valor + " psi fuera de rango");
        }
    }
}