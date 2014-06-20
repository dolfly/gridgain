/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.testsuites.bamboo;

import junit.framework.*;
import org.gridgain.grid.kernal.processors.hadoop.*;
import org.gridgain.grid.kernal.processors.hadoop.shuffle.collections.*;
import org.gridgain.grid.kernal.processors.hadoop.shuffle.streams.*;
import org.gridgain.grid.kernal.processors.hadoop.taskexecutor.external.*;
import org.gridgain.grid.kernal.processors.hadoop.taskexecutor.external.communication.*;

/**
 * Test suite for Hadoop Map Reduce engine.
 */
public class GridHadoopTestSuite extends TestSuite {
    /**
     * @return Test suite.
     * @throws Exception Thrown in case of the failure.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Gridgain Hadoop MR Test Suite");

        suite.addTest(new TestSuite(GridHadoopValidationSelfTest.class));

        suite.addTest(new TestSuite(GridHadoopDefaultMapReducePlannerSelfTest.class));
        suite.addTest(new TestSuite(GridHadoopJobTrackerSelfTest.class));
        suite.addTest(new TestSuite(GridHadoopHashMapSelfTest.class));
        suite.addTest(new TestSuite(GridHadoopDataStreamSelfTest.class));
        suite.addTest(new TestSuite(GridHadoopConcurrentHashMultimapSelftest.class));
        suite.addTestSuite(GridHadoopSkipListSelfTest.class);
        suite.addTest(new TestSuite(GridHadoopTaskExecutionSelfTest.class));

        suite.addTest(new TestSuite(GridHadoopV2JobSelfTest.class));

        suite.addTest(new TestSuite(GridHadoopSerializationWrapperSelfTest.class));
        suite.addTest(new TestSuite(GridHadoopSplitWrapperSelfTest.class));

        suite.addTest(new TestSuite(GridHadoopTasksV1Test.class));
        suite.addTest(new TestSuite(GridHadoopTasksV2Test.class));

        suite.addTest(new TestSuite(GridHadoopMapReduceTest.class));
        suite.addTest(new TestSuite(GridHadoopMapReduceEmbeddedSelfTest.class));

        suite.addTest(new TestSuite(GridHadoopExternalTaskExecutionSelfTest.class));
        suite.addTest(new TestSuite(GridHadoopExternalCommunicationSelfTest.class));

        suite.addTest(new TestSuite(GridHadoopSortingTest.class));
        suite.addTest(new TestSuite(GridHadoopSortingExternalTest.class));

        suite.addTest(new TestSuite(GridHadoopGroupingTest.class));

        return suite;
    }
}