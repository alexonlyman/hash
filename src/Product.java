import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Product {
    private String name;
    private Integer price;
    private Integer count;



    public Product(String name, int price, int count){
        setName(name);
        setCount(count);
        setPrice(price);


    }


    public String getName(){
         return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public int getPrice() {
        if (this.price == null || this.price == 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        return price;
    }

    public void setPrice(int price) {
        if (price <=0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.price = price;
    }

    public int getCount() {
        if (this.count == null || this.count == 0) {
            System.out.println("Заполните карточку товара полностью");
        }
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
