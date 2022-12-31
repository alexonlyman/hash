import java.util.Objects;

public class Recipe {
    private String name;
    private ProductList productList;
    private ProductList totalCost;

    public Recipe(String name, ProductList productList, ProductList totalCost) {
        this.name = name;
        setProductList(productList);
        setTotalCost(totalCost);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public ProductList getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(ProductList totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(getName(), recipe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
