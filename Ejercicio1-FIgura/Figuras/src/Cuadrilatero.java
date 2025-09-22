import lombok.Data;

@Data

public class Cuadrilatero extends Poligono {

    public Cuadrilatero() {
        super();
    }

    public static Cuadrilatero crearCuadrilatero(Lado l1, Lado l2, Lado l3, Lado l4){
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        cuadrilatero.lados.add(l1);
        cuadrilatero.lados.add(l2);
        cuadrilatero.lados.add(l3);
        cuadrilatero.lados.add(l4);
        return cuadrilatero;
    }
}
