import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Continente {
    private String nombre;
    private List<Pais> paises;

    @Override
    public String toString() {
        return "Continente: " + nombre + "; Conformado por: " + paises;
    }
}
