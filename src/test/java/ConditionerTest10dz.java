import dz10.Conditioner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest10dz {

    Conditioner con = new Conditioner();

    @Test
    public void shouldSetTemperature(){
        con.setCurrentTemperature(15);

        int expected = 15;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxTemperature() {
        con.setTuMaxTemp();

        int expected = 30;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetTemperatureAboveMax(){
        con.setCurrentTemperature(50);

        int expected = 0;
        int actual = con.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }
}
