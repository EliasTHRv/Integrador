package servicio;

import entidad.Estudiante;
//import java.util.Scanner;

/**
 *
 * @author elias
 */
public class EstudianteServicio {
//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
//estudiantes con sus respectivas notas.
    //Objeto nombreVector[] = new Objeto[];


     private Estudiante[] estudiantes;
    
    public void Escuela() {
        // Creamos los estudiantes con sus respectivas notas
        Estudiante estudiante1 = new Estudiante("Juan", 8.5);
        Estudiante estudiante2 = new Estudiante("Pedro", 7.0);
        Estudiante estudiante3 = new Estudiante("María", 9.3);
        Estudiante estudiante4 = new Estudiante("Ana", 6.5);
        Estudiante estudiante5 = new Estudiante("Carlos", 8.8);
        Estudiante estudiante6 = new Estudiante("Lucía", 7.2);
        Estudiante estudiante7 = new Estudiante("Javier", 9.0);
        Estudiante estudiante8 = new Estudiante("Marta", 7.8);
        
        // Creamos el arreglo de estudiantes y los almacenamos en él
        estudiantes = new Estudiante[]{estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante7, estudiante8};
    }

//Calcular y mostrar el promedio de notas de todo el curso
    public double calcularPromedio() {
        double sumaNotas = 0;
        double promedioDeClase = 0;
  
        for (int i = 0; i < estudiantes.length; i++)
        {
        sumaNotas += estudiantes[i].getNota();
        }
        promedioDeClase = sumaNotas / estudiantes.length;
    
        return promedioDeClase;
    }

    public void mostrarPromedio() {
        System.out.println("El promedio de las notas es: " + calcularPromedio());
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron una
//nota mayor al promedio del curso
    public String[] compararNotas() {
        int contNotas = 0;

// este for solo rellena el contador para darle dimension al vector donde vamos a guardar los nombres
        for (Estudiante vectorEstudiante : estudiantes)
        {
            if (calcularPromedio() < vectorEstudiante.getNota())
            {
                contNotas++;
            }
        }
        String[] nombresAlumnos = new String[contNotas];

//en este for rellenamos el nuevo vector con los nombres de los alumnos que su nota sobrepase el promedio 
//general del curso
        //esta variable nos sirve para darle la posicion al vector donde guardaremos el nombre
        int z = 0;
        for (int i = 0; i <  8; i++)
        {
            if (estudiantes[i].getNota() > calcularPromedio())
            {
                nombresAlumnos[z] =  this.estudiantes[i].getNombre();
                //la variable va incrementando para cambiar de posicion
                z++;
            }
        }
        return nombresAlumnos;
    }

    //Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
    public void mostrarAlumnos() {
        String[] nombresA = compararNotas();

        for (int i = 0; i < nombresA.length; i++)
        {
            System.out.println("El alumno que supero el promedio es: "+nombresA[i]);
        }

    }

}
