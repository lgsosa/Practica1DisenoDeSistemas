import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder

public class Prestamo extends Pertenencia{
    private ColeccionIntercambiada nombreColeccion;
    private Date fechaInicioPrestamo;
    private Date fechaDevolucion;
}
