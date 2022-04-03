package decorator;

public class Execute {
    public static void main(String[] args) {
        IMilkTea sugarMilkTea = new Sugar(
                                        new Pudding(
                                            new MilkTea()));
        System.out.println(sugarMilkTea.cost());
    }
}
