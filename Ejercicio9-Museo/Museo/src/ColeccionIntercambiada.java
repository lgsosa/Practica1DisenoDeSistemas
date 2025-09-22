import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ColeccionIntercambiada {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String personaContacto;
}
