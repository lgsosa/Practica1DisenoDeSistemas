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

public class Provincia {
    private final String nombre;
    private List<Ciudad> ciudades=new ArrayList<>();

    public void agregarCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public long gastoProvincia() {
        return ciudades.stream().mapToLong(Ciudad::getGasto).sum();
    }

    public long calcularCantidadRecaudada() {
        return ciudades.stream()
                .mapToLong(Ciudad::calcularCantidadRecaudada)
                .sum();
    }

    public long calcularDeficit() {
        return calcularCantidadRecaudada() - gastoProvincia();
    }
}
