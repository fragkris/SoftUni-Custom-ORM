package ormFramework.core;


import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public interface EntityManager {

    /*
    The first <T> signifies that we create a generic method. The second T is the return type.
    The third <T> is the type of the input parameter.

    In this case if we receive a Class<String> the return type will be String.
     */

    <T> T findById(int id, Class<T> type) throws SQLException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

    <T> boolean persist (T entity) throws IllegalAccessException, SQLException;

    <T> boolean delete (T entity) throws IllegalAccessException, SQLException;
}
