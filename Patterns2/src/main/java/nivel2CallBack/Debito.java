package nivel2CallBack;

public class Debito implements MedioDePago{
    @Override
    public void pago() {
        System.out.println("Pagado con tarjeta de débito.");
    }
}

