import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Artista {
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaDefuncion;
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;
}
