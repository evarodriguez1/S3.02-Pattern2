package nivel2CallBack;

public class PayPal implements MedioDePago{
    @Override
    public void pago() {
        System.out.println("Pagado con Paypal.");
    }
}
