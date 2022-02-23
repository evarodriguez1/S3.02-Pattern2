package nivel3DependencyInjection;

public class Main {
    public static void main(String[]args) {

        Tienda tienda = new Tienda();

        tienda.addProducto("Zapatillas Adidas", 79.90);
        tienda.addProducto("mochila nike", 29.90);
        tienda.addProducto("calcetines Jordan", 13);

        tienda.getLista();

        System.out.println("Conversion a Dolar EE.UU: ");
        tienda.changeCoinValue(new DolarEEUU());

        System.out.println("Conversion a Peso Argentino: ");
        tienda.changeCoinValue(new PesoArgentino());

    }

}
