public class Main {
    public static void main(String[] args) {

        //Crear restaurantes
        Restaurante res1=new Restaurante("McDonalds");

        //Crear Sucursales
        Sucursal suc1=new Sucursal("capital");
        Sucursal suc2=new Sucursal("Godoy Cruz");

        //Crear platos
        Plato plato1=new Plato("pasta",3000);
        Plato plato2=new Plato("carne",5000);

        //Agregar platos a restaurante
        res1.agregarPlato(plato1);
        res1.agregarPlato(plato2);

        //Pedir
        plato1.pedir();
        plato2.pedir();
    }
}