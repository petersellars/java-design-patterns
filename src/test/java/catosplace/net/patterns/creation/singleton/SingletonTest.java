package catosplace.net.patterns.creation.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by psellars on 18/08/15.
 *
 * Singleton test
 */
public class SingletonTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetInstance() throws Exception {
        Singleton.getInstance();
    }

    @Test
    public void testDoSomething() throws Exception {
        Singleton.getInstance().doSomething();
    }
}