package customOrm;

import customOrm.entity.Employee;
import customOrm.entity.User;
import ormFramework.core.EntityManager;
import ormFramework.core.EntityManagerFactory;

import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.sql.SQLException;

public class AppStarter {
    public static void main(String[] args) throws SQLException, URISyntaxException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
       EntityManager entityManager =
               EntityManagerFactory
                       .create("mysql", "localhost", 3306, "root", "940325","test_orm", AppStarter.class);

        Employee byId = entityManager.findById(25, Employee.class);

    }
}
