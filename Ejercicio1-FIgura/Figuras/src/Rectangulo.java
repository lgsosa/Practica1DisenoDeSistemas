import lombok.Data;

@Data

public class Rectangulo extends Cuadrilatero{

    public Rectangulo() {
        super();
    }

    public static Rectangulo crearRectangulo(Lado l1, Lado l2, Lado l3, Lado l4){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.lados.add(l1);
        rectangulo.lados.add(l2);
        rectangulo.lados.add(l3);
        rectangulo.lados.add(l4);
        return rectangulo;
    }

    @Override
    public String toString(){
        return "Es un rectangulo";
    }
}
