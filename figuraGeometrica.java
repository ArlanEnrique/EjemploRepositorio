package figuraGeometrica;

public class figuraGeometrica {
    private String nombre;

    public figuraGeometrica(String nombre) {
        setNombre(nombre);
    }

    public figuraGeometrica() {
        this.nombre = nombre;
    }

    public double calcularArea() {
        // Cálculo de área genérico
        return 0.0;
    }

    public double calcularPerimetro() {
        // Cálculo de perímetro genérico
        return 0.0;
    }

    public String show() {
        return "Nombre: " + getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "null" : nombre;
    }
}