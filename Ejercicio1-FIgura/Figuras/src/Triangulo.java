import lombok.Data;

@Data

public class Triangulo extends Poligono{

    public Triangulo() {
        super();
    }

    public static Triangulo crearTriangulo(Lado l1, Lado l2, Lado l3){
        Triangulo triangulo=new Triangulo();
        triangulo.lados.add(l1);
        triangulo.lados.add(l2);
        triangulo.lados.add(l3);
        return triangulo;
    }
}
