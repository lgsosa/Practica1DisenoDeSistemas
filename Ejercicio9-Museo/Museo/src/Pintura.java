import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder

public class Pintura extends Objeto{
    private String tipo;
    private String soporte;
    private String estilo;
}
