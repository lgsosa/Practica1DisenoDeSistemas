import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cereal {
    private String tipo;
    private Set<String> mineralesRequeridos= new HashSet<>();

    public boolean puedeSembrarseEnLote(Lote lote) {
        boolean tieneMinerales = lote.getMinerales().containsAll(this.mineralesRequeridos);
        if (this.tipo.equals("pastura")) {
            return tieneMinerales && lote.disponibilidadSiembraPastura();
        }
        return tieneMinerales;
    }
}
