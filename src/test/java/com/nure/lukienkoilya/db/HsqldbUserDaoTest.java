package test.java.com.nure.lukienkoilya.db;

import main.java.com.nure.lukienkoilya.User;
import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

import main.java.com.nure.lukienkoilya.db.ConnectionFactory;
import main.java.com.nure.lukienkoilya.db.ConnectionFactoryImpl;
import main.java.com.nure.lukienkoilya.db.DatabaseException;
import main.java.com.nure.lukienkoilya.db.HsqldbUserDao;
import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;


public class HsqldbUserDaoTest extends TestCase {

    private HsqldbUserDao dao;
    private ConnectionFactory connectionFactory;
    private Date tempDate;


    protected void setUp() throws Exception {
        super.setUp();
        connectionFactory = new ConnectionFactoryImpl();
        dao = new HsqldbUserDao(connectionFactory);

        Calendar calendar = Calendar.getInstance();
        calendar.set(1984, Calendar.MAY, 26);
        tempDate = calendar.getTime();
    }

    public void testCreate() {
        try {
            User user = new User();
            user.setFirstName("John");
            user.setLastName("Doe");
            user.setDateOfBirthday(tempDate);

            assertNull(user.getId());

            user = dao.create(user);
            assertNotNull(user);
            assertNotNull(user.getId());
        } catch (DatabaseException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }
}