public class Persona {

    private int identificacion;
    private String nombre;
    private String fechaNacimiento;


    public Persona(int identificacion, String nombre, String fechaNacimiento ) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdenticacion() {
        return identificacion;
    }

    public void setIdenticacion(int identificacionV2) {
        this.identificacion = identificacionV2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String  fechaV2) {
        this.fechaNacimiento = fechaV2;
    }


    public static void main(String[] args) {

        Persona personUno = new Persona(126363, "John", "26/07/2003");
        System.out.println(personUno.getIdenticacion());
        System.out.println(personUno.getNombre());
        System.out.println(personUno.getFechaNacimiento());

        System.out.println("================== Informacion leida y modificada del Segundo objeto ==================");

        personUno.setIdenticacion(17728344);
        personUno.setNombre("Angel");
        personUno.setFechaNacimiento("25/08/2002");

        System.out.println(personUno.getIdenticacion());
        System.out.println(personUno.getNombre());
        System.out.println(personUno.getFechaNacimiento());

    }

}
