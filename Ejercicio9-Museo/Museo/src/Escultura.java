import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder

public class Escultura extends Objeto{
    private String material;
    private int altura;
    private int peso;
    private String estilo;
}
