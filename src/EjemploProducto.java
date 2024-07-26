public class EjemploProducto {
    public static void main(String[] args) {
    Producto[] productos = new Producto[8];
    productos[0] = new Fruta("Manzana", 2.5, 40, "roja");
    productos[1] = new Fruta("piña", 4.8, 80, "amarillo" );
    productos[2] = new Lacteo("Yogurt griego", 6.9, 2, 5);
    productos[3] = new Lacteo("Yogurt fresa", 5.8, 5, 4);
    productos[4] = new NoPerecible("Fideos", 3.7, 9, 500);
    productos[5] = new NoPerecible("Atun", 5.5, 4, 400);
    productos[6] = new Limpieza("Poet", 2.8, "Fresa", 1.5);
    productos[7] = new Limpieza("Afloja todo", 15, "WD-40", 1);

    for (Producto prod : productos){
        System.out.println("-------------------------" + prod.getClass().getSimpleName() + "-------------------------");
        System.out.println("Nombre: " + prod.getNombre());
        System.out.println("Precio: " + prod.getPrecio());

        if(prod instanceof Fruta) {
            System.out.println("Peso: " + ((Fruta) prod).getPeso() + " gr");
            System.out.println("Color: " + ((Fruta) prod).getColor());
        } else if (prod instanceof Lacteo) {
            System.out.println("Cantidad: " + ((Lacteo) prod).getCantidad()+ " lt");
            System.out.println("Proteinas: " + ((Lacteo) prod).getProteinas() + " gr");
        } else if (prod instanceof NoPerecible) {
            System.out.println("Contenido: " + ((NoPerecible) prod).getContenido() + " und");
            System.out.println("Calorias: " + ((NoPerecible) prod).getCalorias() + " kCal");
        } else if (prod instanceof Limpieza) {
            System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
            System.out.println("Litros: " + ((Limpieza) prod).getLitros() + " lt");
        }
    }

    }
}
