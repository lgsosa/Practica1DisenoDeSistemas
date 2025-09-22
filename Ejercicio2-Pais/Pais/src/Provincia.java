import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;
    private Ciudad capital;
    private List<Provincia> provinciasLimitrofes;
    private List<Pais> paisesLimitrofes;

    @Override
    public String toString() {
        return "Provincia: " + nombre + " ; Conformado por: " + ciudades + " ; Su capital es: " + capital ;
    }
}
