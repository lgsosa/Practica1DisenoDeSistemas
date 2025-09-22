import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public abstract class Objeto {
    protected int idObjeto;
    protected String artista;
    protected int anoCreacion;
    protected String titulo;
    protected String descripcion;
    protected String pais;
    protected String cultura;
    protected String epoca;
    protected Pertenencia pertenencia;
}
