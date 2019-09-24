public class Cinnamon extends TeaDecorator{

    public Cinnamon(Tea tea) {
        super(tea);
    }

    @Override
    public int getCost() {
        return super.getCost() + Cost.CINNAMON.get();
    }

    @Override
    public String getName() {
        return super.getName() + "Корица ";
    }
}
