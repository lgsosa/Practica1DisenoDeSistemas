import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Plato {
    private String nombre;
    private int precio;

    public void pedir(){
        System.out.println("Pidiendo: "+nombre+"  ; TOTAL: "+precio);
    }
}
