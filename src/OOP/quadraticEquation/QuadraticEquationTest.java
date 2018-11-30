package OOP.quadraticEquation;

import org.junit.jupiter.api.Test;

class QuadraticEquationTest {

    @Test
    void getResult() {
        QuadraticEquation ob = new QuadraticEquation(1,3,1);
        System.out.println(ob.getResult());

    }
}