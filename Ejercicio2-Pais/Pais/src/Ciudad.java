import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ciudad {
    private String nombre;

    @Override
    public String toString() {
        return "Ciudad: " + nombre;
    }
}
