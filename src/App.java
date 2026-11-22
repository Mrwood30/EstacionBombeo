public class App {
    public static void main(String[] args) {
        Oleoducto norte = new Oleoducto("Ruta Norte", 1200);
        System.out.println(norte.getPresionMaxima());
        norte.setPresionMaxima(-500);
        norte.setPresionMaxima(1500);
        System.out.println(norte.getPresionMaxima());
    }
}