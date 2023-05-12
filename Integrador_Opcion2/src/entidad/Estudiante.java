package entidad;

/**
 * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
 * van a ser nombre y nota (representando la nota obtenida en el final).
 *
 * @author elias
 */
public class Estudiante {
private String nombre;
private double nota;

    public Estudiante() {
    }



    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    

    
}
