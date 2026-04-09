package mentor.lesson3;
;

public enum Meat {
    READ_MEAT(20),  POULTRY(15), SEAFOOD(25);

    private int weight;

    Meat(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

