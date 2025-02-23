public class Persona {

    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola soy " + this.nombre);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona Juan = new Persona("Juan", 42);
        Persona Jairo = new Persona("Jairo", 89);

        System.out.println(Juan.getNombre());
        System.out.println(Juan.getEdad());
        Juan.mostrarInformacion();
        Juan.saludar();


        System.out.println("================== Informacion leida y modificada del Segundo objeto ==================");

        Jairo.mostrarInformacion();
        Jairo.setNombre("John");
        Jairo.setEdad(21);
        Jairo.mostrarInformacion();
    }

}
