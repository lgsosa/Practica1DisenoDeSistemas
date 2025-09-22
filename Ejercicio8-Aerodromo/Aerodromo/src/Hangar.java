import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Hangar {
    private int nroHangar;
    private int capacidad;
    private String ubicacion;
}
