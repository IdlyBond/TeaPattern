public class Milk extends TeaDecorator{

    public Milk(Tea tea) {
        super(tea);
    }

    @Override
    public int getCost() {
        return super.getCost() + Cost.MILK.get();
    }

    @Override
    public String getName() {
        return super.getName() + "Молоко ";
    }
}
