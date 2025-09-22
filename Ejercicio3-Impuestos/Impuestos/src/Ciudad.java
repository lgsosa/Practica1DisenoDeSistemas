import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@RequiredArgsConstructor

public class Ciudad {
    private final String nombre;
    private final int habitantes;
    private final long gasto;
    private List<Impuesto> impuestos=new ArrayList<>();

    public void agregarImpuesto(Impuesto impuesto) {
        impuestos.add(impuesto);
    }

    public long calcularCantidadRecaudada() {
        int valorTotalImpuestos= impuestos.stream()
                                            .mapToInt(Impuesto::getValor)
                                            .sum();
        return (long) valorTotalImpuestos*habitantes;
    }

    public long calcularDeficit() {
        return calcularCantidadRecaudada()-gasto;
    }

}
