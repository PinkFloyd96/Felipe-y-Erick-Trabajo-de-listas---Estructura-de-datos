import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

/// Clase principal
/// @author Erick y Felipe
/// @version 1.0
public class Main {

    static final int TOTAL_ALUMNOS = 350_000;
    static String[] nombres = {"Ana", "Joao", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
    static String[] apellidos = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};

    /**
     * Metodo principal
     */
    public static void main(String[] args) {

        List<Alumno> arrayList = new ArrayList<>();
        List<Alumno> linkedList = new LinkedList<>();
        List<Alumno> vectorList = new Vector<>();

        long tiempoInicioArray = System.currentTimeMillis();
        llenarLista(arrayList);
        long tiempoFinArray = System.currentTimeMillis();

        long tiempoInicioLinked = System.currentTimeMillis();
        llenarLista(linkedList);
        long tiempoFinLinked = System.currentTimeMillis();

        long tiempoInicioVector = System.currentTimeMillis();
        llenarLista(vectorList);
        long tiempoFinVector = System.currentTimeMillis();

        long tiempoCadastroArray = tiempoFinArray - tiempoInicioArray;
        long tiempoCadastroLinked = tiempoFinLinked - tiempoInicioLinked;
        long tiempoCadastroVector = tiempoFinVector - tiempoInicioVector;

        long tiempoOrdenArray = medirTiempo(() -> Collections.sort(arrayList));
        long tiempoOrdenLinked = medirTiempo(() -> Collections.sort(linkedList));
        long tiempoOrdenVector = medirTiempo(() -> Collections.sort(vectorList));

        long tiempoExportArray = medirTiempo(() -> exportarCSV(arrayList, "alumnos_arraylist.csv"));
        long tiempoExportLinked = medirTiempo(() -> exportarCSV(linkedList, "alumnos_linkedlist.csv"));
        long tiempoExportVector = medirTiempo(() -> exportarCSV(vectorList, "alumnos_vector.csv"));

        System.out.println("\nOperacion\tArrayList (ms)\tLinkedList (ms)\tVector (ms)");
        System.out.println("Cadastro\t" + tiempoCadastroArray + "\t\t" + tiempoCadastroLinked + "\t\t" + tiempoCadastroVector);
        System.out.println("Ordenacion\t" + tiempoOrdenArray + "\t\t" + tiempoOrdenLinked + "\t\t" + tiempoOrdenVector);
        System.out.println("Exportacion\t" + tiempoExportArray + "\t\t" + tiempoExportLinked + "\t\t" + tiempoExportVector);
    }

    /**
     * Llena la lista con alumnos aleatorios
     */
    static void llenarLista(List<Alumno> lista) {
        Random rand = new Random();
        for (int i = 0; i < TOTAL_ALUMNOS; i++) {
            String nombre = nombres[rand.nextInt(nombres.length)] + " " + apellidos[rand.nextInt(apellidos.length)];
            String matricula = String.format("%05d", rand.nextInt(100000));
            int dia = rand.nextInt(28) + 1;
            int mes = rand.nextInt(12) + 1;
            int anio = 1980 + rand.nextInt(20);
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            lista.add(new Alumno(nombre, matricula, fecha));
        }
    }

    /**
     * Exporta la lista a un archivo CSV
     */
    static void exportarCSV(List<Alumno> lista, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Nombre,Matricula,Fecha de Nacimiento\n");
            for (Alumno a : lista) {
                writer.write(a.nombre + "," + a.matricula + "," + a.fechaNacimiento + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Calcula el tiempo
     */
    static long medirTiempo(Runnable accion) {
        long inicio = System.currentTimeMillis();
        accion.run();
        return System.currentTimeMillis() - inicio;
    }

    /**
     * Clase Alumno con nombre, matrícula y fecha
     */
    static class Alumno implements Comparable<Alumno> {
        String nombre;
        String matricula;
        LocalDate fechaNacimiento;

        /**
         * Crea un nuevo Alumno
         */
        public Alumno(String nombre, String matricula, LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.matricula = matricula;
            this.fechaNacimiento = fechaNacimiento;
        }

        /**
         * Compara alumnos por nombre
         */
        @Override
        public int compareTo(Alumno o) {
            return this.nombre.compareTo(o.nombre);
        }

        /**
         * Devuelve el alumno en formato CSV
         */
        @Override
        public String toString() {
            return nombre + "," + matricula + "," + fechaNacimiento;
        }
    }
}