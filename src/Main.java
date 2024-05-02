import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenidos a la Inmersión en JAVA!");
        System.out.println("Película Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = "La mejor pelicula del fin del Milenio";
        double mediaEvaluacionUsuario = 0;

        System.out.println("Nombre: " + nombre);
        System.out.println("Sinópsis: " + sinopsis);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Plan: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/ 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                           "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);
    }
}