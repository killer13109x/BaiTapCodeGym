package OOP.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTest {

    @Test
    void getVariable() {
        Random rd = new Random(1000);
        rd.getVariable();
    }
}