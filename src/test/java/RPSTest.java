import org.junit.Assert;
import org.junit.Test;

public class RPSTest {

    @Test
    public void TestForDefaultGestureRock(){
        RPS rps = new RPS();
        int returnedValue = rps.solution('R',"RSPRS");
        Assert.assertEquals(6,returnedValue);
    }


    @Test
    public void TestForDefaultGestureRock_2(){
        RPS rps = new RPS();
        int returnedValue = rps.solution('R',"SRR");
        Assert.assertEquals(4,returnedValue);
    }

    @Test
    public void TestForDefaultGesturePaper(){
        RPS rps = new RPS();
        int returnedValue = rps.solution('P',"PRPRRPP");
        Assert.assertEquals(10,returnedValue);
    }

    @Test
    public void TestForDefaultGestureScissors(){
        RPS rps = new RPS();
        int returnedValue = rps.solution('S',"PPPPRRSSSSS");
        Assert.assertEquals(13,returnedValue);
    }
}
