import javax.swing.*;

public class Principal {

    /* El programa nos pedirá un número del sistema decimal, en un rango de 0 a 255,
    y posteriormente nos mostrará en pantalla la conversión a binario. */

    public static void main(String[] args) {

        int contador = 0, num = 0, cantBits = 0;
        boolean bitsEncontrados = false;

        try {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        } catch (NumberFormatException e) {
            num = -1;
        }

        //Encontramos el numero de bits para el numero digitado

        for (int k = 0; !bitsEncontrados; k++){
            int resultado = (int) Math.pow(2, k);
            if (resultado > num){
                bitsEncontrados = true;
            }
            cantBits++;
        }

        int[] arr = new int[cantBits]; // Array con el numero de bits
        if (num == 0){
            arr[contador++] = 0; //Si el numero es 0, entonces el resultado sera cero
        }else{
            while(num != 0){
                arr[contador++] = num % 2;
                num/=2;
            }
        }

        for (int j = contador -1; j >= 0; j-- ){
            System.out.print(arr[j] + " ");
        }
    }
}
