public class Cuadrado extends FiguraGeometrica
{
    private double lado;

    //Al construir una figura, automáticamente se calcula el área y perímetro
    public Cuadrado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = lado * lado;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 4 * lado;
    }
}
