public class Jasmine extends TeaDecorator{

    public Jasmine(Tea tea) {
        super(tea);
    }

    @Override
    public int getCost() {
        return super.getCost() + Cost.JASMINE.get();
    }

    @Override
    public String getName() {
        return super.getName() + "Жасмин ";
    }
}
