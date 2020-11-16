package geco;

import jdk.nashorn.internal.runtime.ECMAException;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class LoginServiceTest extends TestCase {

    LoginService ls;

    @Before
    public void setUp() throws Exception {
        String[] passwords = {};
        ls = new LoginService(passwords);
    }

    @Test
    public void testAddLogin() throws Exception {
        ArrayList<String> passwords = new ArrayList<String>();
        passwords.add("Axel");
        ls.addLogin("Axel");
        assertEquals(passwords,ls.findAllLogins());
    }

    @Test
    public void testLoginExists() throws Exception {
        ls.addLogin("Axel");
        assertTrue(ls.loginExists("Axel"));
        assertFalse(ls.loginExists("Philippe"));
    }

    @Test
    public void testAllLoginsStartingWith() throws Exception {
        ArrayList<String> passwords = new ArrayList<String>();
        passwords.add("Axel");
        passwords.add("Antoine");

        ls.addLogin("Axel");
        ls.addLogin("Antoine");

        assertEquals(passwords,ls.findAllLoginsStartingWith("A"));
        passwords.remove("Antoine");
        assertEquals(passwords,ls.findAllLoginsStartingWith("Ax"));
        passwords.remove("Axel");
        assertEquals(passwords,ls.findAllLoginsStartingWith("Z"));
    }

    @After
    public void tearDown() throws Exception {
    }
}
