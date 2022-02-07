public class Principal {

    /** Crearemos un arreglo de 10 posiciones, con datos tipo char, algunos repetidos.
     * Al momento de imprimir el arreglo,
     * no mostraremos los elementos que se repiten, en vez de eso, mostraremos un espacio en blanco. **/

    public static void main(String[] args) {
        char[] arr = {'9','2','1','8','1','3','4','5','6','7','8','8','2'};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (i!=j){ // Para no comparar mismas posiciones
                    System.out.println(i + " - " + j);
                    if (arr[i] == arr[j]) {  // i = 0; i = 1; (Si esta repetido, se muestra en blanco
                        arr[j]= ' ';
                    }
                }
            }
        }

        for (char c: arr) {
            System.out.print("[" + c + "]");
        }
    }
}
