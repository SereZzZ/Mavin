import org.example.dz2.SqrtService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest2dz {
    @Test
    public void sqrt() {
        SqrtService service = new SqrtService();
        int expected = 5;
        int actual = service.calcSqrt(25);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrt2() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(27);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrt3() {
        SqrtService service = new SqrtService();
        int expected = 10;
        int actual = service.calcSqrt(100);
        Assertions.assertEquals(expected, actual);
    }
}
