package ico.fes.db;

import java.util.ArrayList;
import org.sqlite.SQLiteException;

/**
 *
 * @author VIKTOR
 */
public class InterfazDao {
     public abstract ArrayList obtenerTodo() throws SQLiteException;
    public abstract boolean insertar(Object o) throws SQLiteException;
    public abstract boolean eliminar(String n) throws SQLiteException;
}
