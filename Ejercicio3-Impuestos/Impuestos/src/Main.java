public class Main {
    public static void main(String[] args) {

        //Crear pais
        Pais argentina = new Pais("Argentina");

        //Crear Provincia, ciudad e impuestos de Mendoza
        Provincia mendoza = new Provincia("Mendoza");
        Ciudad mendozaCapital = new Ciudad("Mendoza Capital", 1500000, 2000);
        Ciudad godoyCruz = new Ciudad("Godoy Cruz", 1000000, 3000);
        mendozaCapital.agregarImpuesto(new Impuesto(1, 1000));
        mendozaCapital.agregarImpuesto(new Impuesto(2, 2000));
        godoyCruz.agregarImpuesto(new Impuesto(4, 1500));
        mendoza.agregarCiudad(mendozaCapital);

        Provincia bsas = new Provincia("Buenos Aires");
        Ciudad laPlata = new Ciudad("La Plata", 800000, 3000);
        laPlata.agregarImpuesto(new Impuesto(3, 5000));
        bsas.agregarCiudad(laPlata);

        argentina.agregarProvincia(mendoza);
        argentina.agregarProvincia(bsas);

        System.out.println("Recaudación Mendoza: " + mendoza.calcularCantidadRecaudada());
        System.out.println("Déficit Mendoza: " + mendoza.calcularDeficit());

        System.out.println("Recaudación Buenos Aires: " + bsas.calcularCantidadRecaudada());
        System.out.println("Déficit Buenos Aires: " + bsas.calcularDeficit());

        System.out.println("Recaudación Argentina: " + argentina.calcularCantidadRecaudada());
        System.out.println("Déficit Argentina: " + argentina.calcularDeficit());
    }
}