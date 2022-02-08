import javax.swing.*;

public class Principal {

    /*
    * Se creará un programa que nos pida capturar las edades de los alumnos.
    * Si la edad de los alumnos está entre 8 y 13 años, y además,
    * el alumno tiene uno o más hermanos estudiando en la misma escuela,
    * recibirá en la inscripción un 50% de descuento.
    * Si la edad está fuera de rango, automáticamente se descartará el descuento,
    * teniendo que pagarse la totalidad de la inscripción. O si cumple la edad,
    * pero no tiene hermanos, igual, tendrá que pagar el 100% de la inscripción.
    *
    *  */
    public static void main(String[] args) {
        int cantAlumnos = 0, costoInscripcion = 1250;
        int[] edadesAlumnos;
        String[] hermanos;
        do{
            try {
                cantAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos: "));
            }catch (NumberFormatException ex){
                cantAlumnos = -1;
            }
        }while (cantAlumnos == -1);

        edadesAlumnos = new int[cantAlumnos];
        hermanos= new String[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++){
            do{
                try {
                    edadesAlumnos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno: " + (i+1)));
                    hermanos[i] = JOptionPane.showInputDialog("Tiene hermanos? ");
                }catch (NumberFormatException ex){
                    edadesAlumnos[i] = -1;
                }
            }while (edadesAlumnos[i] == -1);
        }

        String cad;
        for (int i = 0; i < cantAlumnos; i++){
            if (edadesAlumnos[i] >= 8 && edadesAlumnos[i] <= 13){
                if (hermanos[i].equals("Si")) {
                    cad = ("El alumno" + (i+1) +" tiene el 50% de descuento y pagara " + (costoInscripcion * 0.5));
                }else{
                    cad = ("El alumno" + (i+1) +" no tiene descuento y pagara " + (costoInscripcion));
                }
            }else{
                cad = ("El alumno" + (i+1) +" no esta en el rango de edad y pagara " + (costoInscripcion));
            }
            System.out.println(cad);

        }







    }
}
