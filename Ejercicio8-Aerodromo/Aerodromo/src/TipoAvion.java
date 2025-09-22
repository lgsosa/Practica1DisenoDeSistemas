import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TipoAvion {
    private int nro_modelo;
    private int capacidad;
    private int peso;
}
