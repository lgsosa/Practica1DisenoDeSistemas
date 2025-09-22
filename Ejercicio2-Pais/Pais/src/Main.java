import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ciudades
        Ciudad caba = new Ciudad();
        caba.setNombre("CABA");
        Ciudad mendozaCapital = new Ciudad();
        mendozaCapital.setNombre("Mendoza Capital");
        Ciudad sanRafael = new Ciudad();
        sanRafael.setNombre("San Rafael");
        Ciudad laPlata = new Ciudad();
        laPlata.setNombre("La Plata");

        // Crear países
        Pais argentina = new Pais();
        argentina.setNombre("Argentina");
        argentina.setCapital(caba);

        Pais chile = new Pais();
        chile.setNombre("Chile");
        chile.setProvincias(Collections.emptyList());
        chile.setPaisesLimitrofes(Arrays.asList(argentina));

        // Colocar paises limitrofes de Argentina
        argentina.setPaisesLimitrofes(Arrays.asList(chile));

        // Crear provincias
        Provincia buenosAires = new Provincia();
        buenosAires.setNombre("Buenos Aires");
        buenosAires.setCapital(laPlata);
        buenosAires.setCiudades(Arrays.asList(laPlata, caba));

        Provincia entreRios = new Provincia();
        entreRios.setNombre("Entre Ríos");
        entreRios.setCiudades(Collections.emptyList());
        entreRios.setPaisesLimitrofes(Collections.emptyList());

        Provincia santaFe = new Provincia();
        santaFe.setNombre("Santa Fe");
        santaFe.setCiudades(Collections.emptyList());
        santaFe.setPaisesLimitrofes(Collections.emptyList());

        Provincia sanJuan = new Provincia();
        sanJuan.setNombre("San Juan");
        sanJuan.setCiudades(Collections.emptyList());
        sanJuan.setPaisesLimitrofes(Collections.emptyList());

        Provincia mendoza = new Provincia();
        mendoza.setNombre("Mendoza");
        mendoza.setCapital(mendozaCapital);
        mendoza.setCiudades(Arrays.asList(mendozaCapital, sanRafael));
        mendoza.setPaisesLimitrofes(Arrays.asList(chile));

        // Provincias limitrofes
        buenosAires.setProvinciasLimitrofes(Arrays.asList(entreRios, santaFe));
        buenosAires.setPaisesLimitrofes(Collections.emptyList());
        entreRios.setProvinciasLimitrofes(Arrays.asList(buenosAires, santaFe));
        santaFe.setProvinciasLimitrofes(Arrays.asList(buenosAires, entreRios));
        mendoza.setProvinciasLimitrofes(Arrays.asList(sanJuan));
        sanJuan.setProvinciasLimitrofes(Arrays.asList(mendoza));

        // Agregar provincias a Argentina
        argentina.setProvincias(Arrays.asList(buenosAires, mendoza, entreRios, santaFe, sanJuan));

        // Crear continente
        Continente americaDelSur = new Continente();
        americaDelSur.setNombre("América del Sur");
        americaDelSur.setPaises(Arrays.asList(argentina, chile));

        //Mostrar continente
        System.out.println(americaDelSur);

        // Mostrar países
        System.out.println("PAÍSES:");
        for (Pais pais : americaDelSur.getPaises()) {
            System.out.println(pais);
        }

        // Mostrar provincias de Argentina
        System.out.println("PROVINCIAS DE ARGENTINA:");
        for (Provincia provincia : argentina.getProvincias()) {
            System.out.println(provincia);
        }

        // Mostrar ciudades
        System.out.println("CIUDADES:");
        System.out.println(mendozaCapital);
        System.out.println(caba);
        System.out.println(laPlata);
        System.out.println(sanRafael);
    }
}