package TrabajadorDaoTest;

import DAO.TrabajadorDao;
import model.Trabajador;
import static org.junit.Assert.*;
import org.junit.Test;

public class TrabajadorDaoTest {

    @Test
    public void testInsert() {
        TrabajadorDao dao = new TrabajadorDao();
        Trabajador t = new Trabajador();
        t.setNombre("Test");
        t.setApellido("Usuario");
        t.setEdad(25);
        t.setFechNac("2000-01-01");
        t.setDireccion("Av. Prueba 123");
        t.setEmail("test@example.com");
        t.setFechIngreso("2024-06-01");
        t.setSueldo(1200.0);
        boolean resultado = dao.insert(t);

        assertTrue("El trabajador no se insertó correctamente", resultado);
    }
}

//Test 