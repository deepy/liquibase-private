package liquibase.database.core;

import junit.framework.TestCase;
import liquibase.database.Database;

public class DB2zDatabaseTest extends TestCase {
    public void testGetDefaultDriver() {
        Database database = new Db2zDatabase();

        assertEquals("com.ibm.db2.jcc.DB2Driver", database.getDefaultDriver("jdbc:db2://localhost:50000/liquibas"));

        assertNull(database.getDefaultDriver("jdbc:oracle://localhost;databaseName=liquibase"));
    }


}
