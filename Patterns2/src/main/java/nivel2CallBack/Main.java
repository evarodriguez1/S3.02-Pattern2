package nivel2CallBack;

public class Main {
    public static void main(String[]args) {

        TiendaZapatos zapatosPepe = new TiendaZapatos();
        MedioDePago fila = new Debito();
        MedioDePago armani = new PayPal();

        zapatosPepe.pago(fila);
        zapatosPepe.pago(armani);

    }
}

