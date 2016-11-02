package test.java.com.nure.lukienkoilya;

import junit.framework.TestCase;
import main.java.com.nure.lukienkoilya.User;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Илья on 10.10.2016.
 */
public class UserTest extends TestCase {
    private User user;
    private Date dateOfBirth;

    @org.junit.Before
    public void setUp() throws Exception {
        user = new User();

        Calendar calendar = Calendar.getInstance();
        calendar.set(1997, Calendar.MAY, 31);
        dateOfBirth = calendar.getTime();
    }


    public void testGetFullName() {
        user.setFirstName("Ilya");
        user.setLastName("Lukienko");
        assertEquals("Lukienko, Ilya", user.getFullName());
    }

    public void testGetAge() {
        user.setDateOfBirthday(dateOfBirth);
        assertEquals(2016 - 1997, user.getAge());

    }
}