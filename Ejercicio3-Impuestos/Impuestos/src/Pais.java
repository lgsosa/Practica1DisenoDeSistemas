import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@AllArgsConstructor

public class Pais {
    private final String nombre;
    private List<Provincia> provincias=new ArrayList<>();

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public Long gastoPais() {
        return provincias.stream().mapToLong(Provincia::gastoProvincia).sum();
    }

    public long calcularCantidadRecaudada() {
        return provincias.stream()
                .mapToLong(Provincia::calcularCantidadRecaudada)
                .sum();
    }

    public long calcularDeficit() {
        return calcularCantidadRecaudada()-gastoPais();
    }
}
