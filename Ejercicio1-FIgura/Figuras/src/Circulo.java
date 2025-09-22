import lombok.Data;

@Data
public class Circulo extends Elipse {
    private double radio;
    private Punto centro;

    public Circulo() {
        super();
    }

    public Circulo(Punto centro, double radio) {
        super();
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio;
    }
}