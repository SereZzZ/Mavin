import dz10.Conditioner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest10dz {

    Conditioner con = new Conditioner(30, 10);

    @Test
    public void shouldSetTemperature() {
        con.setCurrentTemperature(15);

        Assertions.assertEquals(15, con.getCurrentTemperature());
    }

    @Test
    public void shouldSetToMaxTemperature() {
        con.setTuMaxTemp();

        Assertions.assertEquals(30, con.getCurrentTemperature());

    }

    @Test
    public void shouldNotSetTemperatureAboveMax() {
        con.setCurrentTemperature(50);

        Assertions.assertEquals(30, con.getCurrentTemperature());
    }

    @Test
    public void Temp50p() {
        con.setCurrentTemperature(25);
        con.increaseTemp50p();

        Assertions.assertEquals(30, con.getMaxTemperature());
    }

    @Test
    public void minus50p() {
        con.setCurrentTemperature(10);
        con.minusTemp50p();

        int expected = 10;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upTo1gradusNeg() {
        con.setCurrentTemperature(30);
        con.up1g();

        int expected = 30;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upTo1gradus() {
        con.setCurrentTemperature(20);
        con.up1g();

        int expected = 21;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upTo1gradus1() {
        con.setCurrentTemperature(-4);
        con.up1g();

        int expected = 11;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

}
