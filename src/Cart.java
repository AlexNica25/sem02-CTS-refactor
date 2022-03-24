import java.util.List;

public class Cart {
    private Order order;
    private List<Product> products;
    private double cartPrice;

    public Cart(Order order, List<Product> products) {
        this.order = order;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

    public Order getOrder() {
        return order;
    }

    public List<Product> getProducts() {
        return products;
    }



    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cart{");
        sb.append("order=").append(order);
        sb.append(", products=").append(products);
        sb.append(", cartPrice=").append(cartPrice);
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }

    public double toPay(List<Product> productList) {
        double priceFinal = 0;
        for (Product p : productList) {
            priceFinal += p.getPrice();
        }
        return priceFinal;
    }
}
