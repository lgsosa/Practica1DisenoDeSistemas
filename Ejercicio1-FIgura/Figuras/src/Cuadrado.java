import lombok.Data;

@Data

public class Cuadrado extends Cuadrilatero{

    public Cuadrado() {
        super();
    }

    public static Cuadrado crearCuadrado(Lado l1, Lado l2, Lado l3, Lado l4){
        if (!esCuadrado(l1, l2, l3, l4)) {
            throw new IllegalArgumentException("Todos los lados deben tener la misma longitud para formar un cuadrado");
        }

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.lados.add(l1);
        cuadrado.lados.add(l2);
        cuadrado.lados.add(l3);
        cuadrado.lados.add(l4);
        return cuadrado;
    }

    private static boolean esCuadrado(Lado l1, Lado l2, Lado l3, Lado l4) {
        double longitud=l1.getLongitud();
        return l2.getLongitud()==longitud &&
                l3.getLongitud() == longitud &&
                l4.getLongitud() == longitud;
    }

    @Override
    public String toString() {
        return "Cuadrado con lados de longitud: " + lados.getFirst().getLongitud();
    }
}
