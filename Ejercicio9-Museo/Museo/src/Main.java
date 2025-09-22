import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Crear artista
        Artista picasso = Artista.builder()
                .nombre("Pablo Picasso")
                .fechaNacimiento(new Date(81, 9, 25))
                .fechaDefuncion(new Date(73, 3, 8))
                .paisOrigen("España")
                .epoca("Siglo XX")
                .estiloPrincipal("Cubismo")
                .descripcion("Pintor y escultor español, creador del cubismo")
                .build();

        //Crear pintura permanente
        Pintura guernica = Pintura.builder()
                .idObjeto(1001)
                .artista("Pablo Picasso")
                .anoCreacion(1937)
                .titulo("Guernica")
                .descripcion("Obra maestra del cubismo que representa los horrores de la guerra")
                .pais("España")
                .cultura("Occidental")
                .epoca("Siglo XX")
                .tipo("Óleo")
                .soporte("Lienzo")
                .estilo("Cubismo")
                .pertenencia(
                        Permanente.builder()
                                .fechaAdquisicion(new Date(120, 4, 15))
                                .costo(2500000)
                                .estado("exposicion")
                                .build()
                )
                .build();

        //Crear colección intercambiada
        ColeccionIntercambiada louvre = ColeccionIntercambiada.builder()
                .nombre("Museo del Louvre")
                .tipo("Museo")
                .descripcion("Museo nacional de Francia, uno de los más importantes del mundo")
                .direccion("Rue de Rivoli, París, Francia")
                .telefono("261645789")
                .personaContacto("Jean Dupont")
                .build();

        //Crear una escultura en préstamo
        Escultura venus = Escultura.builder()
                .idObjeto(2001)
                .artista("Desconocido")
                .anoCreacion(-130)
                .titulo("Venus de Milo")
                .descripcion("Escultura griega antigua que representa a Afrodita")
                .pais("Grecia")
                .cultura("Griega")
                .epoca("Helenística")
                .material("Mármol")
                .altura(202)
                .peso(900)
                .estilo("Clásico")
                .pertenencia(
                        Prestamo.builder()
                            .nombreColeccion(louvre)
                            .fechaInicioPrestamo(new Date(124, 0, 1))
                            .fechaDevolucion(new Date(124, 11, 31))
                            .build()
                )
                .build();

        //Crear objeto 'otro' permanente
        Permanente infoPermanente2 = Permanente.builder()
                .fechaAdquisicion(new Date())
                .costo(50000)
                .estado("almacen")
                .build();

        Otro jarron = Otro.builder()
                .idObjeto(3001)
                .artista("Desconocido")
                .anoCreacion(1400)
                .titulo("Jarrón Ming")
                .descripcion("Jarrón de porcelana de la dinastía Ming")
                .pais("China")
                .cultura("China")
                .epoca("Dinastía Ming")
                .pertenencia(
                        Permanente.builder()
                        .fechaAdquisicion(new Date())
                        .costo(50000)
                        .estado("almacen")
                        .build()
                )
                .build();

        //Crear exposición
        Exposicion exposicion = Exposicion.builder()
                .nombre("Maestros del Arte Universal")
                .fechaInicio(new Date(124, 5, 1))
                .fechaFin(new Date(124, 11, 31))
                .build();

        //Agregar objeto a exposicion
        exposicion.agregarObjeto(guernica);
        exposicion.agregarObjeto(venus);
        exposicion.agregarObjeto(jarron);

        //Mostrar artista
        System.out.println("\n");
        System.out.println("Artista: " + picasso.getNombre());
        System.out.println("Nacimiento: " + picasso.getFechaNacimiento());
        System.out.println("Estilo: " + picasso.getEstiloPrincipal());

        //Mostrar obra permamante
        System.out.println("\n");
        System.out.println("ID: " + guernica.getIdObjeto());
        System.out.println("Título: " + guernica.getTitulo());
        System.out.println("Artista: " + guernica.getArtista());
        System.out.println("Tipo: " + guernica.getTipo());
        System.out.println("Estado: " + ((Permanente) guernica.getPertenencia()).getEstado());
        System.out.println("Costo: $" + ((Permanente) guernica.getPertenencia()).getCosto());

        //Mostrar obra prestamo
        System.out.println("\n");
        System.out.println("ID: " + venus.getIdObjeto());
        System.out.println("Título: " + venus.getTitulo());
        System.out.println("Material: " + venus.getMaterial());
        System.out.println("Altura: " + venus.getAltura() + " cm");
        System.out.println("Prestado por: " + ((Prestamo) venus.getPertenencia()).getNombreColeccion().getNombre());
        System.out.println("Fecha devolución: " + ((Prestamo) venus.getPertenencia()).getFechaDevolucion());

        //Mostra exposicion
        System.out.println("\n");
        System.out.println("Nombre: " + exposicion.getNombre());
        System.out.println("Fecha inicio: " + exposicion.getFechaInicio());
        System.out.println("Fecha fin: " + exposicion.getFechaFin());
        System.out.println("Cantidad de obras: " + exposicion.getCantidadObjetos());

        System.out.println("Objetos: ");
        for (Objeto objeto : exposicion.getObjetosExhibidos()) {
            System.out.println("- " + objeto.getTitulo() + " (ID: " + objeto.getIdObjeto() + ")");
        }

    }
}