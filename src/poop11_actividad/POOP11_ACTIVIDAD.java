/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11_actividad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Esta clase representa la solución a la actividad de la práctica 11 de POO.
 * Se encarga de manejar la lectura y escritura de datos de alumnos desde un archivo CSV.
 * Además, muestra diferentes métodos para leer la información del archivo utilizando diferentes enfoques.
 */
public class POOP11_ACTIVIDAD {

    /**
     * El método principal de la aplicación. Aquí se realiza la ejecución de las tareas.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Creación del arreglo de alumnos y llenado de datos
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Oscar","Cruz","Lopez",317167434,21,20));
        listaAlumnos.add(new Alumno("Dayna","Suarez","Guzman",31673412,20,21));
        listaAlumnos.add(new Alumno("Juan","Perez","Hernandez",317167441,22,19));
        listaAlumnos.add(new Alumno("Osvaldo","Salamanca","Juarez",317167432,21,20));
        listaAlumnos.add(new Alumno("Paulina","Reyes","Gortari",317167411,20,21));
        listaAlumnos.add(new Alumno("Raul","Gomez","Gomez",317167421,23,18));
        listaAlumnos.add(new Alumno("Paul","Emir","Gotero",317167391,20,22));
        listaAlumnos.add(new Alumno("Angel","Orvelin","Pineda",317167851,24,17));
        listaAlumnos.add(new Alumno("Ramon","Dino","Caveiro",317167312,20,21));
        listaAlumnos.add(new Alumno("Jose","Mendez","Esínoza",317167111,20,21));
        
        // Creación del archivo
        File archivo = new File("alumnos.csv");
        if (!archivo.exists()) {
            try {
                System.out.println("Creando archivo");
                boolean seCreo = archivo.createNewFile();
                System.out.println("Archivo creado correctamente: " + seCreo);
                System.out.println(archivo.exists());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        // Escribir en un archivo con la información de los alumnos
        try {            
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            try (PrintWriter salida = new PrintWriter(bw)) {
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    salida.println(listaAlumnos.get(i));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Leer la información de los alumnos desde el archivo "alumnos.csv" (método 1)
        /*
        try {
            BufferedReader br= new BufferedReader(new FileReader("alumnos.csv"));
            String linea = br.readLine();
            while (linea!=null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
        
        // Leer la información de los alumnos desde el archivo "alumnos.csv" (método 2)
        try (BufferedReader reader = new BufferedReader(new FileReader("alumnos.csv"))) {

            // Leer las líneas restantes que contienen la información de los alumnos
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");

                // Crear un objeto Alumno a partir de los datos leídos
                String nombre = datos[0];
                String apellidoPaterno = datos[1];
                String apellidoMaterno = datos[2];
                int numeroCuenta = Integer.parseInt(datos[3]);
                int edad = Integer.parseInt(datos[4]);
                int anioIngreso = Integer.parseInt(datos[5]);

                Alumno alumno = new Alumno(nombre, apellidoPaterno, apellidoMaterno, numeroCuenta, edad, anioIngreso);
                listaAlumnos.add(alumno);
            }

            // Mostrar la información de los alumnos en la salida estándar
            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        
        // Crear otra lista e inicializarlos con la información tokenizada del archivo
        List<Alumno> listaAlumnos2 = new ArrayList<>();

        // Leer la información de los alumnos desde el archivo "alumnos.csv"
        try (BufferedReader reader = new BufferedReader(new FileReader("alumnos.csv"))) {
            // Leer las líneas que contienen la información de los alumnos
            String linea;
            while ((linea = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");
                String nombre = tokenizer.nextToken();
                String apellidoPaterno = tokenizer.nextToken();
                String apellidoMaterno = tokenizer.nextToken();
                int numeroCuenta = Integer.parseInt(tokenizer.nextToken());
                int edad = Integer.parseInt(tokenizer.nextToken());
                int anioIngreso = Integer.parseInt(tokenizer.nextToken());

                Alumno alumno = new Alumno(nombre, apellidoPaterno, apellidoMaterno, numeroCuenta, edad, anioIngreso);
                listaAlumnos2.add(alumno);
            }

            // Mostrar la información de los alumnos en la salida estándar
            for (Alumno alumno : listaAlumnos2) {
                System.out.println(alumno);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
