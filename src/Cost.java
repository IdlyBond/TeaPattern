public enum  Cost {
    MILK(2),
    BERRY(4),
    TEA(2),
    BERGAMOT(4),
    JASMINE(1),
    MINT(3),
    CINNAMON(5),
    ;

    private int cost;

    Cost(int cost) {
        this.cost = cost;
    }

    public int get() {
        return cost;
    }
}
