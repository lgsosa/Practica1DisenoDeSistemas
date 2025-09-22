import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Figura {
    protected String nombre;

    @Override
    public String toString(){
        return "Figura: "+(nombre != null ? nombre : "Sin nombre");
    }
}
