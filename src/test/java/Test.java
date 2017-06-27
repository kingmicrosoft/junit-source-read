import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Chai Wenrun on 2017/6/26 0026.
 */
public class Test extends TestCase{

    private Compute compute;

    @Override
    protected void setUp() throws Exception {
    compute = new Compute();
    }


    public void testAdd(){
        Assert.assertEquals(3,compute.add(1,2));
    }


}
