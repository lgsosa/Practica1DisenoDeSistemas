import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder

public class Mecanico extends Persona {
    private int salario;
    private String turno;
    private TipoAvion tipoAvionQueMantiene;


}
