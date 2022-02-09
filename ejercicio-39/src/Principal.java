import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int cantidadValores = requestIntValue("Ingrese la cantidad de elementos"),
                suma = 0, maximo = 0, minimo = 0;
        int[] numeros = new int[cantidadValores];
        double promedio = 0;

        /* Rellenamos array */

        for (int i = 0; i < cantidadValores; i++) {
            numeros[i] = requestIntValue("Ingrese el valor del elemento #" + i);
        }

        /* Operaciones solicitadas */

        suma = getSuma(numeros);
        promedio = getPromedio(numeros);
        maximo = getMaximo(numeros);
        minimo = getMinimo(numeros);

        /* Muestra resultados*/

        System.out.println("suma = " + suma);
        System.out.println("promedio = " + promedio);
        System.out.println("maximo = " + maximo);
        System.out.println("minimo = " + minimo);
    }

    /* Retornamos la suma del array*/

    private static int getSuma(int[] numeros) {
        int suma = 0;
        for (int i : numeros) {
            suma += i;
        }
        return suma;
    }

    /* Retornamos el promedio del array*/

    private static double getPromedio(int[] numeros) {
        int suma = getSuma(numeros);
        return (double) suma / numeros.length;
    }

    /* Retornamos el maximo del array*/

    private static int getMaximo(int[] numeros) {
        int maximo = Integer.MIN_VALUE;
        for (int i: numeros) {
            if (i > maximo){
                maximo = i;
            }
        }
        return maximo;
    }

    /* Retornamos el minimo del array*/

    private static int getMinimo(int[] numeros) {
        int minimo = Integer.MAX_VALUE;
        for (int i: numeros) {
            if (i < minimo){
                minimo = i;
            }
        }
        return minimo;
    }

    /* Solicita un entero */

    public static int requestIntValue(String mensaje){
        int numero = 0;
        do{
            try{
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog(mensaje));
            }catch (NumberFormatException ex){
                numero = -1;
            }
        }while (!(numero > 0));
        return numero;
    }
}
