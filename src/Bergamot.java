public class Bergamot extends TeaDecorator{

    public Bergamot(Tea tea) {
        super(tea);
    }

    @Override
    public int getCost() {
        return super.getCost() + Cost.BERGAMOT.get();
    }

    @Override
    public String getName() {
        return super.getName() + "Бергамут ";
    }
}
