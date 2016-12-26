package test.java.com.nure.db;

import static org.junit.Assert.*;

import main.java.com.nure.db.DaoFactory;
import main.java.com.nure.db.UserDao;
import org.junit.Test;

public class DaoFactoryTest {

    @Test
    public void testGetUserDao() {
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            assertNotNull("DaoFactory instance is null", daoFactory);
            UserDao userDao = daoFactory.getUserDao();
            assertNotNull("UserDao instance is null", userDao);
        } catch (RuntimeException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }

}