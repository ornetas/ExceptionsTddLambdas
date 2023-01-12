package lt.ornetas.dalyba;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntDividerTest {

    @Test
    public void testDivision() throws ArgumentIsZeroException {

        String pirmasSkaicius = "8";
        String antrasSkaicius = "2";
        int excpectedResult = 4;
        int actualResult;
        String[] skaiciai = {pirmasSkaicius, antrasSkaicius};
        actualResult = IntDivider.divide(skaiciai);
        Assert.assertEquals(excpectedResult,actualResult);

    }
    @Test
    public void testDivision02(){

        String excpected = "Ornetas";
        String actual;

        actual = "Mano vardas yra Ornetas";

        String resultInfo = String.format(
                "Excpected: %s; Actual: %s",
                excpected,
                actual
        );
        Assert.assertTrue(resultInfo,actual.contains(excpected));


    }

}