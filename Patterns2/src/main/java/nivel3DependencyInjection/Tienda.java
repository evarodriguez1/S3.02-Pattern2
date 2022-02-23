package nivel3DependencyInjection;

import java.util.HashMap;

public class Tienda {

    private HashMap<String, Double> productos = new HashMap<>();

    public void getLista() {
        System.out.println(productos);
    }

    public void addProducto(String producto, double precio) {
        productos.put(producto, precio);
    }

    public void changeCoinValue(ConversorDeMoneda conversor) {
        HashMap<String, Double> productos_change = new HashMap<>();

        //.keySet() ---> Devuelve un set que contiene todas las claves del HashMap
        for(String item : productos.keySet()) {
            double precio = productos.get(item);
            precio = conversor.cambioDeMoneda(precio);
            productos_change.put(item, precio);
        }
        System.out.println(productos_change);

    }

}
