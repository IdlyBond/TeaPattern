public class Berry extends TeaDecorator{

    public Berry(Tea tea) {
        super(tea);
    }

    @Override
    public int getCost() {
        return super.getCost() + Cost.BERRY.get();
    }

    @Override
    public String getName() {
        return super.getName() + "Ягоды ";
    }
}
