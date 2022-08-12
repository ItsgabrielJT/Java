public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = base * altura;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado + lado + lado;
    }
}
