import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data

public class Poligono extends Figura {
    protected List<Lado> lados;

    public Poligono() {
        super();
        this.lados = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Poligono con "+lados.size()+" lados";
    }
}
