public class Rectangulo extends FiguraGeometrica
{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = base * altura;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (2*base) + (2*altura);
    }
}
