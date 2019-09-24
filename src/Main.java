public class Main {

    public static void main(String[] args) {
        while (true) {
            Tea tea = new TeaProcessor().getTea();
            System.out.println("Ваш чай:\n" + tea.getName() + "\nСтоимостью: " + tea.getCost());
        }
    }
}
