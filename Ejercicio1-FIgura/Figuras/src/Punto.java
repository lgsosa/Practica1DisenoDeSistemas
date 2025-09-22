import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Punto {
    private int x;
    private int y;

    public double distancia(Punto otropunto){
        return Math.sqrt( Math.pow(otropunto.x-this.x,2) + Math.pow(otropunto.y-this.y,2) );
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
