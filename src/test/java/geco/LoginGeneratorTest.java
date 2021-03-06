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
        ls = new LoginService(new String[]{"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        ;
        lg = new LoginGenerator(ls);
    }

    @Test
    public void testLoginForNomAndPrenom() throws Exception {
        assertEquals("PDUR", lg.generateLoginForNomAndPrenom("Durand", "Paul"));
        assertEquals("JROL1", lg.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    @Test
    public void testIteration() throws Exception {
        assertEquals("JRAL2", lg.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void testShortName() throws Exception{
        assertEquals("PDU",lg.generateLoginForNomAndPrenom("Du","Paul"));
    }

    @After
    public void tearDown() throws Exception {
    }
}
