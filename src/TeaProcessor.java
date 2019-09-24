

public class TeaProcessor {

    public Tea getTea(){
        Tea tea = new JustTea();
        System.out.println("1) Чай с бергамотом\n" +
                "2) Чай с жасмином\n" +
                "3) Чай с молоком\n" +
                "4) Чай с ягодами\n" +
                "5) Чай с жасмином и мятой\n" +
                "6) Чай с корицей\n" +
                "7) Чай с молоком и ягодами\n");
        switch (Printer.getIndex(0, 7)){
            case 1:
                return new Bergamot(tea);
            case 2:
                return new Jasmine(tea);
            case 3:
                return new Milk(tea);
            case 4:
                return new Berry(tea);
            case 5:
                return new Mint(new Jasmine(tea));
            case 6:
                return new Cinnamon(tea);
            case 7:
                return new Berry(new Milk(tea));
        }
        return new Mint(new Jasmine(new Cinnamon(new Bergamot(new Berry(new Milk(tea))))));
    }

}
