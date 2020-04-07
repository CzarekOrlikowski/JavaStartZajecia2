public class Bar {
    public static void main(String[] args) {
        Component component1 = new Component();
        component1.componentName = "Wódka";
        component1.componentQuantity = 50;

        Component component2 = new Component();
        component2.componentName = "Sok";
        component2.componentQuantity = 50;

        Component component3 = new Component();
        component3.componentName = "Woda";
        component3.componentQuantity = 50;

        Drink drink1 = new Drink();
        drink1.drinkName = "Java";
        drink1.drinkPrice = 10;
        drink1.drinkAlcohol = true;
        drink1.drinkComponent1 = component1;
        drink1.drinkComponent2 = component2;
        drink1.drinkComponent3 = component3;

        System.out.println("Informacje o drinku");
        System.out.printf("Nazwa: %s\n", drink1.drinkName);
        System.out.printf("Cena: %s\n", drink1.drinkPrice);
        System.out.printf("Składniki: %s\n", component1.componentName + ", " + component2.componentName + ", " + component3.componentName);
        System.out.printf("Czy zawiera alkohol: %s\n", drink1.drinkAlcohol);
        System.out.printf("Wielkość: %s" + " ml", component1.componentQuantity + component2.componentQuantity + component3.componentQuantity);
    }
}
