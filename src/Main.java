import exception.IdentifierValueException;
import exception.StringMinLength;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IdentifierValueException, StringMinLength {
        Product p1 = new Product(1, "Ceai cu mango", 20, "Ajuta la somn");
        Product p2 = new Product(2, "Cafea", 30, "Ajuta sa nu mai ai somn");
        Product p3 = new Product(3, "Cola fara zahar", 10, "Nu ajuta deloc");
        Product p4 = new Product(4, "Energizant", 5, "toxic, dar bun");

        User u1 = new User(1,"alin234", "Alin andrei");
        User u2 = new User(2,"Paul123", "Paul Pop");

        Order o1 = new Order(1l, "Cluj", u1);
        Order o2 = new Order(2l, "Iasi", u2);



        List<Product> listOfProducts=new ArrayList<Product>();
        listOfProducts.add(p1);
        listOfProducts.add(p2);
        listOfProducts.add(p3);
        listOfProducts.add(p4);

        Cart c1 = new Cart(o1, listOfProducts);

        System.out.println("Pretul final al cosului c1 este: " + c1.toPay(listOfProducts));


    }
}
