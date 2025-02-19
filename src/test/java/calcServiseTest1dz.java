import org.example.dz1.calcServise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class calcServiseTest1dz {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.CSV")
    public void testIsRegisterTrue(int expected, int amount, boolean isRegister) {
        calcServise servise = new calcServise();

        int actual = servise.bonusServis(amount, isRegister);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testIsRegisterFolse() {
        calcServise servise = new calcServise();

        int expected = 10;
        int actual = servise.bonusServis(1_000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitBonus() {
        calcServise servise = new calcServise();
        int expected = 500;
        int actual = servise.bonusServis(50_000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitBonusTrue() {
        calcServise servise = new calcServise();
        int expected = 500;
        int actual = servise.bonusServis(20_000, true);
        Assertions.assertEquals(expected, actual);
    }

}