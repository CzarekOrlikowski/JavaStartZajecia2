import java.sql.SQLOutput;

public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.name = "Czekolada";
        product1.producer = "Wedel";
        product1.price = 2.5;
        product1.availability = true;

        Product product2 = new Product();
        product2.name = "Chleb";
        product2.producer = "Familijna";
        product2.price = 3.5;
        product2.availability = true;

        Product product3 = new Product();
        product3.name = "Wino";
        product3.producer = "Żywiec";
        product3.price = 5.5;
        product3.availability = false;

        System.out.println("Produkt: " + product1.name);
        System.out.println("Producent: " + product1.producer);
        System.out.println("Cena: " + product1.price + "zł");
        System.out.println("Dostępność: " + product1.availability + "\n");

        System.out.println("Produkt: " + product2.name);
        System.out.println("Producent: " + product2.producer);
        System.out.println("Cena: " + product2.price + "zł");
        System.out.println("Dostępność: " + product2.availability + "\n");

        System.out.println("Produkt: " + product3.name);
        System.out.println("Producent: " + product3.producer);
        System.out.println("Cena: " + product3.price + "zł");
        System.out.println("Dostępność: " + product3.availability + "\n");

        System.out.println("nazwa: " + product1.name
                + ", cena: " + product1.price
                + "zł, producent: " + product1.producer
                + ", dostępność: " + product1.availability);

        System.out.println("nazwa: " + product2.name
                + ", cena: " + product2.price
                + "zł, producent: " + product2.producer
                + ", dostępność: " + product2.availability);

        System.out.println("nazwa: " + product3.name
                + ", cena: " + product3.price
                + "zł, producent: " + product3.producer
                + ", dostępność: " + product3.availability);
    }
}
