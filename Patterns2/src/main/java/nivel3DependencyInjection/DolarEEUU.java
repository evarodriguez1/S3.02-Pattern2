package nivel3DependencyInjection;

public class DolarEEUU implements ConversorDeMoneda {

    @Override
    public double cambioDeMoneda(double precio) {

      return precio * 1.13;
    }
}
