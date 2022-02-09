public class Principal {
    public static void main(String[] args) {
        double velocidadKilometros = 1;
        System.out.println(obtenerMetrosXSegundo(velocidadKilometros));
    }

    private static double obtenerMetrosXSegundo(double velocidad) {
        return ((float)10/36)*(velocidad);
    }
}
