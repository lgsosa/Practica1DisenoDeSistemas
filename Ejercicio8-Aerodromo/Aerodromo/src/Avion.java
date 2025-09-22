import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Avion {
    private int matricula;
    private TipoAvion tipoAvion;
    private Hangar nroHangar;
    private Date fechaAdquisicion;
    private Propietario propietario;
    @Builder.Default
    private List<Servicio> servicios = new ArrayList<>();

    public int cantidadServicios() {
        return servicios.size();
    }

    public void imprimirMecanicos() {
        System.out.println("Mecánicos que trabajaron en el avión " + matricula + ":");
        for (Servicio servicio : servicios) {
            for (Mecanico m : servicio.getMecanicos()) {
                System.out.println("- " + m.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nTipo de Avión: " + tipoAvion + "\nHangar: " + nroHangar + "\nPropietario: " + propietario ;
    }

}
