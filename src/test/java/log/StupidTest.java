package log;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * Created by diego_000 on 05/12/2015.
 */
public class StupidTest {
    private static final Logger log = LoggerFactory.getLogger(StupidTest.class);

    @Test
    public void test() throws SQLException {
        //stupid test
        Assert.assertEquals(1, 1);
    }
}
