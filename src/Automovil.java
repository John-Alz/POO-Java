public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindraje;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: " + this.fabricante);
        sb.append("Modelo: " + this.modelo);
        sb.append("Color: " + this.color);
        sb.append("Cilindaraje: " + this.cilindraje);
        return sb.toString();
    }

    public  Automovil (String fabricante, String modelo, String color, double cilidraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilidraje;
    }

}
