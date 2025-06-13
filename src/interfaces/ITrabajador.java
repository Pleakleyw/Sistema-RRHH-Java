
package interfaces;

import java.util.List;
import model.Trabajador;

public interface ITrabajador extends ICRUD<Trabajador>{
    public abstract List<Trabajador> lisPorDat();
    public abstract List<Trabajador> lisInfPer();
    public abstract List<Trabajador> lisEstTra();
}
