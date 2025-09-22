import jdk.jfr.DataAmount;
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

public class Restaurante {
    private final String nombre;
    private List<Plato> platos = new ArrayList<>();

    public void agregarPlato(Plato plato){
        platos.add(plato);
    }
}
