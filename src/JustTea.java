public class JustTea implements Tea {

    @Override
    public int getCost() {
        return Cost.TEA.get();
    }

    @Override
    public String getName() {
        return "Чай c: ";
    }
}
