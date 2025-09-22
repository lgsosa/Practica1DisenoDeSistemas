import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Servicio {
    private int nroServicio;
    private Avion avion;
    private Date fecha;
    private int horas;
    private String tipoTrabajo;
    private List<Mecanico> mecanicos = new ArrayList<>();

    public static Servicio realizarServicio(int nroServicio, Avion avion, Date fecha, int horas, String tipoTrabajo, List<Mecanico> mecanicos) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        for (Servicio s : avion.getServicios()) {
            if (formato.format(s.getFecha()).equals(formato.format(fecha)) &&
                    s.getTipoTrabajo().equalsIgnoreCase(tipoTrabajo)) {
                System.out.println("Ya existe un servicio de ese tipo en esa fecha para este avión.");
                return null;
            }
        }

        Servicio nuevo = new Servicio(nroServicio, avion, fecha, horas, tipoTrabajo, mecanicos);
        avion.getServicios().add(nuevo);
        System.out.println("Servicio agregado al avión " + avion.getMatricula());
        return nuevo;
    }
}
