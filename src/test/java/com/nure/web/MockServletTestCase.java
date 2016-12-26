package test.java.com.nure.web;

import main.java.com.nure.db.DaoFactory;
import main.java.com.nure.db.MockDaoFactory;

import java.util.Properties;

public class MockServletTestCase extends BasicServletTestCaseAdapter {

    private Mock mockUserDao;

    @Before
    protected void setUp() throws Exception {
        super.setUp();
        Properties properties = new Properties();
        properties.setProperty("dao.factory", MockDaoFactory.class.getName());
        DaoFactory.init(properties);
        setMockUserDao(((MockDaoFactory) DaoFactory.getInstance()).getMockUserDao());
    }

    /**
     * @return the mockUserDao
     */
    public Mock getMockUserDao() {
        return mockUserDao;
    }

    /**
     * @param mockUserDao the mockUserDao to set
     */
    public void setMockUserDao(Mock mockUserDao) {
        this.mockUserDao = mockUserDao;
    }

    @After
    protected void tearDown() throws Exception {
        getMockUserDao().verify();
        super.tearDown();
    }
}
