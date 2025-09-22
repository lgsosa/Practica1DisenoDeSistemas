import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Crear tipos de avion
        TipoAvion boeing737 = new TipoAvion(737, 180, 79000);
        TipoAvion airbusA320 = new TipoAvion(320, 150, 42000);

        //Crear hangares
        Hangar hangar1 = new Hangar(1, 5, "Zona A");
        Hangar hangar2 = new Hangar(2, 10, "Zona B");

        //Crear propietario
        Propietario propietario1 = Propietario.builder()
                .nroSeguridadSocial(1000)
                .nombre("Juan Pérez")
                .ubicacion("Buenos Aires")
                .telefono(2616547)
                .build();
        Propietario propietario2 = Propietario.builder()
                .nroSeguridadSocial(1001)
                .nombre("Maria Lopez")
                .ubicacion("Mendoza")
                .telefono(261346)
                .build();

        //Crear aviones
        Avion avion1 = Avion.builder()
                .matricula(111)
                .tipoAvion(boeing737)
                .nroHangar(hangar1)
                .fechaAdquisicion(new Date())
                .propietario(propietario1)
                .build();

        Avion avion2 = Avion.builder()
                .matricula(222)
                .tipoAvion(airbusA320)
                .nroHangar(hangar1)
                .fechaAdquisicion(new Date())
                .propietario(propietario2)
                .build();

        //Crear mecánicos
        Mecanico mecanico1 = Mecanico.builder()
                .nroSeguridadSocial(2001)
                .nombre("Carlos López")
                .ubicacion("Buenos Aires")
                .telefono(261345766)
                .salario(50000)
                .turno("Mañana")
                .tipoAvionQueMantiene(boeing737)
                .build();

        Mecanico mecanico2 = Mecanico.builder()
                .nroSeguridadSocial(2002)
                .nombre("María Fernández")
                .ubicacion("Mendoza")
                .telefono(444444)
                .salario(52000)
                .turno("Tarde")
                .tipoAvionQueMantiene(airbusA320)
                .build();

        Mecanico mecanico3 = Mecanico.builder()
                .nroSeguridadSocial(2003)
                .nombre("Lucas Ruiz")
                .ubicacion("Cordoba")
                .telefono(6457995)
                .salario(52000)
                .turno("Tarde")
                .tipoAvionQueMantiene(airbusA320)
                .build();

        //Crear pilotos
        Piloto piloto1 = Piloto.builder()
                .nroSeguridadSocial(3001)
                .nombre("Pedro Sánchez")
                .ubicacion("Mendoza")
                .telefono(555555)
                .nroLicencia(9001)
                .restricciones("Ninguna")
                .tipoAvionQuePilota(boeing737)
                .build();

        Piloto piloto2 = Piloto.builder()
                .nroSeguridadSocial(3002)
                .nombre("Ana Martínez")
                .ubicacion("Salta")
                .telefono(666666)
                .nroLicencia(9002)
                .restricciones("Vuelos nocturnos no permitidos")
                .tipoAvionQuePilota(airbusA320)
                .build();

        //Crear servicios
        Servicio s1 = Servicio.realizarServicio(1, avion1, new Date(), 5, "Mantenimiento", Arrays.asList(mecanico1, mecanico3));
        Servicio s2 = Servicio.realizarServicio(2, avion1, new Date(), 3, "Revisión", Arrays.asList(mecanico2));
        Servicio s3 = Servicio.realizarServicio(3, avion1, new Date(), 2, "Mantenimiento", Arrays.asList(mecanico1));
        Servicio s4 = Servicio.realizarServicio(4, avion2, new Date(), 4, "Inspección", Arrays.asList(mecanico2));

        //Mostrar
        System.out.println("\n\nAVION 1: ");
        System.out.println(avion1);
        System.out.println("\nCantidad de servicios del avión 1: " + avion1.cantidadServicios());
        avion1.imprimirMecanicos();

        System.out.println("\n\nAVION 2: ");
        System.out.println(avion2);
        System.out.println("\nCantidad de servicios del avión 2: " + avion2.cantidadServicios());
        avion2.imprimirMecanicos();
    }
}