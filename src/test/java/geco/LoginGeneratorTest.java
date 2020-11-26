package geco;

import jdk.nashorn.internal.runtime.ECMAException;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class LoginGeneratorTest extends TestCase {

    LoginService ls;
    LoginGenerator lg;

    @Before
    public void setUp() throws Exception {
        ls = new LoginService(new String[]{"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});;
        lg = new LoginGenerator(ls);
    }

    @Test
    public void testLoginForNomAndPrenom() throws Exception {
        assertEquals("PDUR",lg.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void testIteration() throws Exception {
        assertEquals("JRAL2",lg.generateLoginForNomAndPrenom("Ralling","John"));
    }

    @After
    public void tearDown() throws Exception {
    }
}
