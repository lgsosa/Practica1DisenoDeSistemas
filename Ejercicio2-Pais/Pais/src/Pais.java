import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Ciudad capital;
    private List<Pais> paisesLimitrofes;

    @Override
    public String toString() {
        return "Pais: " + nombre + " ; Conformado por: " + provincias + " ; Su capital es: " + capital;
    }
}