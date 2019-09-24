public class Mint extends TeaDecorator{

    public Mint(Tea tea) {
        super(tea);
    }

    @Override
    public int getCost() {
        return super.getCost() + Cost.MINT.get();
    }

    @Override
    public String getName() {
        return super.getName() + "Мята ";
    }
}
