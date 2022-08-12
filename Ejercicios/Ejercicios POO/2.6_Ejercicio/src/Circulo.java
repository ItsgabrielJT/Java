
public class Circulo extends FiguraGeometrica
{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = Math.PI * (radio * radio);
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (2 * radio) * Math.PI;
    }
}
