import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products;

    public static int totalCost(Product count, Product price) {
        int totalcost;
        totalcost = count.getCount() * price.getPrice();
        return totalcost;
    }

    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("такой продукт уже есть");
        }
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }
}
