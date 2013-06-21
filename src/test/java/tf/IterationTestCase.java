package tf;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tf.rt.CaseManager;
import tf.rt.CaseRT;
import tf.rt.IterationRT;
import tf.rt.StepRT;

/**
 * @author taskleron  6/18/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/tf/context.xml"})
public class IterationTestCase extends TestCase{


    @Autowired
    CaseManager caseManager;

    @Test
    public void testIteration() {
        IterationRT irt = caseManager.startIteration("productId", "versionId");

        CaseRT crt = irt.startCase("id");
        StepRT srt = crt.startStep("id");                    //
        //srt.stopStep("result", boolean)                   //checkStep(id, boolean)
        //stopCase(guid) || crt.stop()
        //irt.stop() || stopIteration(guid)

    }
}
