import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products;

    public  int totalCost() {
        int sum = 0;
        for (Product product : products) {
            sum = product.getCount() * product.getPrice();
        }
        return sum;
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
