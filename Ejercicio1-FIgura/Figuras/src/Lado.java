import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Lado {
    private Punto inicio;
    private Punto fin;
    private double longitud;

    public Lado(Punto inicio, Punto fin){
        this.inicio=inicio;
        this.fin=fin;
        this.longitud=inicio.distancia(fin);
    }

    @Override
    public String toString(){
        return "Lado: inicio->" + inicio + " , " + "fin->"+ fin + " , " + "Longitud=" + longitud;
    }
}
