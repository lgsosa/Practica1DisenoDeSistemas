import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Exposicion {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    @Builder.Default
    private List<Objeto> objetosExhibidos = new ArrayList<>();

    public void agregarObjeto(Objeto objeto) {
        if (objeto != null) {
            this.objetosExhibidos.add(objeto);
            System.out.println("Objeto agregado a la exposición: " + objeto.getTitulo());
        }
    }

    public int getCantidadObjetos() {
        return objetosExhibidos.size();
    }
}
