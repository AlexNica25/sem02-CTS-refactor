import exception.IdentifierValueException;
import exception.StringMinLength;

public class Product {

    private int id;
    private String name; //length > 5

    public double getPrice() {
        return price;
    }

    private double price; // >= 0
    private String description;

    public Product(int id, String name, double price, String description) throws StringMinLength, IdentifierValueException {

        if(id < 1) {
            throw new IdentifierValueException("Id-ul trebuie sa inceapa pe la 1");
        } else {
            this.id = id;
        }


        if (name.length() < 5) {
            throw new StringMinLength("String-ul e prea mic!");
        } else {
            this.name = name;
        }

        if (price <= 0) {
            throw new ArithmeticException("Pretul nu poate fi negativ");
        } else {
            this.price = price;
        }


        if (description.length() < 5) {
            throw new StringMinLength("String-ul e prea mic!");
        } else {
            this.description = description;
        }

    }

    public float applyPercentageDiscount(float discountPercentage) {
        return (float) (price - price % discountPercentage);
    }

    public double applyAmountDiscount(double discountAmount) {
        double finalPrice = price - discountAmount;
        if (finalPrice < 0) {
            throw new ArithmeticException("Pretul nu poate fi negativ!");
        } else {
            return finalPrice;
        }
    }

    public double increasePricePercentage(double pricePercentage) {
        double finalPrice =  (price - price % pricePercentage);
        if (finalPrice < 0) {
            throw new ArithmeticException("Pretul nu poate fi negativ!");
        } else {
            return finalPrice;
        }
    }

    public double increasePriceAmount(double priceAmount) {
        return price + priceAmount;
    }

    public boolean equals(Product p) {

        if(p.id != this.id || p.name != this.name || p.price != this.price || p.description != description) {
            return false;
        }
        else {
            return true;
        }
    }


}
