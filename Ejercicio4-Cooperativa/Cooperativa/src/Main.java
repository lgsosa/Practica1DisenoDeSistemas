import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //Crear Cereales
        Cereal trigo = new Cereal("grano fino", new HashSet<>(Arrays.asList("nitrogeno", "fosforo")));
        Cereal maiz = new Cereal("grano grueso", new HashSet<>(Arrays.asList("nitrogeno", "potasio", "magnesio")));
        Cereal alfalfa = new Cereal("pastura", new HashSet<>(Arrays.asList("calcio", "fosforo")));

        //Crear Lotes
        Lote lote1 =new Lote(1,"especial");
        lote1.setSiembraPreviaPastura(false);
        lote1.agregarMineral("nitrogeno");
        lote1.agregarMineral("fosforo");
        lote1.agregarMineral("potasio");

        Lote lote2 =new Lote(2,"comun");
        lote2.setSiembraPreviaPastura(true);
        lote2.agregarMineral("nitrogeno");
        lote2.agregarMineral("fosforo");
        lote2.agregarMineral("potasio");

        Lote lote3 =new Lote(3,"especial");
        lote3.setSiembraPreviaPastura(false);
        lote3.agregarMineral("calcio");
        lote3.agregarMineral("fosforo");

        Lote lote4 = new Lote(4,"comun");
        lote4.setSiembraPreviaPastura(true);
        lote4.agregarMineral("calcio");
        lote4.agregarMineral("fosforo");
        lote4.agregarMineral("nitrogeno");

        //verificacion de planatacion de trigo en cada lote
        System.out.println("TRIGO:");
        System.out.println("En Lote 1: " + trigo.puedeSembrarseEnLote(lote1));
        System.out.println("En Lote 2: " + trigo.puedeSembrarseEnLote(lote2));
        System.out.println("En Lote 3: " + trigo.puedeSembrarseEnLote(lote3));
        System.out.println("En Lote 4: " + trigo.puedeSembrarseEnLote(lote4));

        //verificacion de planatacion de maiz en cada lote
        System.out.println("MAIZ:");
        System.out.println("En Lote 1: " + maiz.puedeSembrarseEnLote(lote1));
        System.out.println("En Lote 2: " + maiz.puedeSembrarseEnLote(lote2));
        System.out.println("En Lote 3: " + maiz.puedeSembrarseEnLote(lote3));
        System.out.println("En Lote 4: " + maiz.puedeSembrarseEnLote(lote4));

        //verificacion de planatacion de alfalfa en cada lote
        System.out.println("ALFALFA:");
        System.out.println("En Lote 1: " + alfalfa.puedeSembrarseEnLote(lote1));
        System.out.println("En Lote 2: " + alfalfa.puedeSembrarseEnLote(lote2));
        System.out.println("En Lote 3: " + alfalfa.puedeSembrarseEnLote(lote3));
        System.out.println("En Lote 4: " + alfalfa.puedeSembrarseEnLote(lote4));
    }
}