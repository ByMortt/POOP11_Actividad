package poop11_actividad;

/*
 * Esta clase representa un objeto Alumno que contiene información sobre un estudiante.
 * Los atributos incluyen el nombre, apellido paterno, apellido materno, número de cuenta,
 * edad y año de ingreso del alumno.
 */

public class Alumno {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int numCuenta;
    private int edad;
    private int anioIngreso;

    /*
     * Constructor predeterminado de la clase Alumno.
     * Crea una instancia de Alumno sin inicializar los atributos.
     */
    public Alumno() {
    }

    /*
     * Constructor de la clase Alumno que recibe parámetros para inicializar los atributos.
     *
     * @param nombre        el nombre del alumno
     * @param apPaterno     el apellido paterno del alumno
     * @param apMaterno     el apellido materno del alumno
     * @param numCuenta     el número de cuenta del alumno
     * @param edad          la edad del alumno
     * @param anioIngreso   el año de ingreso del alumno
     */
    public Alumno(String nombre, String apPaterno, String apMaterno, int numCuenta, int edad, int anioIngreso) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
    }

    /*
     * Método getter para obtener el nombre del alumno.
     *
     * @return el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método setter para establecer el nombre del alumno.
     *
     * @param nombre el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Método getter para obtener el apellido paterno del alumno.
     *
     * @return el apellido paterno del alumno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /*
     * Método setter para establecer el apellido paterno del alumno.
     *
     * @param apPaterno el apellido paterno del alumno
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /*
     * Método getter para obtener el apellido materno del alumno.
     *
     * @return el apellido materno del alumno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /*
     * Método setter para establecer el apellido materno del alumno.
     *
     * @param apMaterno el apellido materno del alumno
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    /*
     * Método getter para obtener el número de cuenta del alumno.
     *
     * @return el número de cuenta del alumno
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /*
     * Método setter para establecer el número de cuenta del alumno.
     *
     * @param numCuenta el número de cuenta del alumno
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /*
     * Método getter para obtener la edad del alumno.
     *
     * @return la edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /*
     * Método setter para establecer la edad del alumno.
     *
     * @param edad la edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
     * Método getter para obtener el año de ingreso del alumno.
     *
     * @return el año de ingreso del alumno
     */
    public int getAnioIngreso() {
        return anioIngreso;
    }

    /*
     * Método setter para establecer el año de ingreso del alumno.
     *
     * @param anioIngreso el año de ingreso del alumno
     */
    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    /*
     * Método toString para obtener una representación en cadena del objeto Alumno.
     *
     * @return una cadena que representa al alumno en el formato "nombre,apellidoPaterno,apellidoMaterno,numCuenta,edad,anioIngreso"
     */
    @Override
    public String toString() {
        return nombre + "," + apPaterno + "," + apMaterno + "," + numCuenta + "," + edad + "," + anioIngreso;
    }   
}
