package OOP.quadraticEquation;

import org.junit.jupiter.api.Test;

class QuadraticEquationTest {

    @Test
    void getResult() {
        QuadraticEquation ob = new QuadraticEquation(0,-5,3);
        System.out.println(ob.getResult());

    }
}