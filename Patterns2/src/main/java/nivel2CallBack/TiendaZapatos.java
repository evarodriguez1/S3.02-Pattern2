package nivel2CallBack;

public class TiendaZapatos {

    //Un callback (llamada de vuelta) es una función que recibe como argumento otra función y la ejecuta
    public void pago(MedioDePago medioDePago) {
        medioDePago.pago();
    }
}

