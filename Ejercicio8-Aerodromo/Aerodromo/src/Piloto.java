import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder

public class Piloto extends Persona{
    private int nroLicencia;
    private String restricciones;
    private TipoAvion tipoAvionQuePilota;
}
