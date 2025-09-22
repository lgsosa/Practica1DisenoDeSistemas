import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Persona {
    private int nroSeguridadSocial;
    private String nombre;
    private String ubicacion;
    private int telefono;
}
