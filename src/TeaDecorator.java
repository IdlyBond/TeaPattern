public class TeaDecorator implements Tea{

    private Tea tea;

    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public int getCost() {
        return tea.getCost();
    }

    @Override
    public String getName() {
        return tea.getName();
    }
}
