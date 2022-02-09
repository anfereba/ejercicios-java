import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int cantidadNotas = requestIntValue("Ingrese la cantidad de notas", 1, 10);
        double[] calificaciones = rellenarArray(cantidadNotas);
        double promedio = getPromedio(calificaciones);
        JOptionPane.showMessageDialog(null, "Su promedio es de: "+promedio);
        if (promedio >= 9){
            JOptionPane.showMessageDialog(null, "Recibes 100 dolares");
        }else if(promedio >=8) {
            JOptionPane.showMessageDialog(null, "Recibes 60 dolares");
        }else if (promedio >= 6){
            JOptionPane.showMessageDialog(null, "Recibes 30 dolares");
        }else{
            JOptionPane.showMessageDialog(null, "No tienes derecho a beca");
        }
    }

    /* Se rellena un array de tipo double */

    private static double[] rellenarArray(int cantidadNotas) {
        double[] array = new double[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++){
            array[i] = requestDoubleValue("Ingrese la nota #" +(i+1), 1, 10);
        }
        return array;
    }

    /* Retornamos la suma del array*/

    private static double getSuma(double[] numeros) {
        double suma = 0;
        for (double i : numeros) {
            suma += i;
        }
        return suma;
    }

    /* Retornamos el promedio del array*/

    private static double getPromedio(double[] numeros) {
        return getSuma(numeros)/ numeros.length;
    }

    /* Solicitar un valor double */

    public static double requestDoubleValue(String mensaje, int limInf, int limSup){
        double numero = 0;
        do{
            try{
                numero = Double.parseDouble(
                        JOptionPane.showInputDialog(mensaje));
            }catch (NumberFormatException ex){
                numero = limInf - 1;
            }
        }while (!(numero >= limInf && numero <= limSup));
        return numero;
    }

    /* Solicitar un valor int */

    public static int requestIntValue(String mensaje, int limInf, int limSup){
        int numero = 0;
        do{
            try{
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog(mensaje));
            }catch (NumberFormatException ex){
                numero = limInf - 1;
            }
        }while (!(numero >= limInf && numero <= limSup));
        return numero;
    }
}
