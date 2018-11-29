package OOP.random;

public class Random {
    private int seed;
    private int variable;
    public Random(int seed){
        this.seed = seed;
    }
    public void getVariable(){
        java.util.Random rd = new java.util.Random(seed);
        for (int i=1; i<=50; i++){
            variable = rd.nextInt(100);
            System.out.print(variable + "\t");
        }
    }
}
