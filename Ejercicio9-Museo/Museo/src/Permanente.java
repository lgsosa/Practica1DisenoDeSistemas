import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder

public class Permanente extends Pertenencia{
    private Date fechaAdquisicion;
    private int costo;
    private String estado;
}
