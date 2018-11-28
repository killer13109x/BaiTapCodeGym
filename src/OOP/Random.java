package OOP;

public class Random {
    private final int SEED = 1000;
    private int variable;
    public Random(){
        java.util.Random rd = new java.util.Random();
        variable = rd.nextInt(SEED);
    }
    public int getVariable(){
        return variable;
    }

}
