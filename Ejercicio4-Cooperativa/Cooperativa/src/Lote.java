import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor

public class Lote {
    private final int id;
    private final String tipo;
    private Set<String> minerales= new HashSet<>();
    private boolean siembraPreviaPastura;

    public void agregarMineral(String mineral){
        minerales.add(mineral);
    }

    public boolean disponibilidadSiembraPastura() {
        return siembraPreviaPastura;
    }
}
