package nivel3DependencyInjection;

public class PesoArgentino implements ConversorDeMoneda{
    @Override
    public double cambioDeMoneda(double precio) {

        return precio * 2.40;
    }
}
