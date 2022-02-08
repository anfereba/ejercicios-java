import javax.swing.*;

public class Principal {

    /*
    Saber cuantas veces se repite un carácter dentro de una cadena de texto:
    Por ejemplo, si quiero saber cuántas veces se encuentra la letra 'a'
    dentro de la cadena de texto "La pizza es deliciosa",
    nos arrojaría este mensaje: "La letra 'a'
    se repite 3 veces en la cadena de texto anterior".
    * */


    public static void main(String[] args) {

        int cont = contarCaracteres('i',"Babidi");
        System.out.println("El caracter se repite " + cont + " veces");

    }

    public static int contarCaracteres(char letra, String cadena){
        int contador = 0;
        int pos = cadena.indexOf(letra);
        while (pos != -1){
            contador++;
            pos = cadena.indexOf(letra, pos+1);
        }
        return contador;
    }
}
