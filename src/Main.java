import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("банан",60, 3);
        Product bread = new Product("хлеб",5, 1);
        Product egg = new Product("яйцо",59, 5);
        Product milk = new Product("молоко",45, 5);
        Product apple = new Product("яблоко",23, 6);
        Product carrot = new Product("морковь",11, 1);
        Product chiken = new Product("цыпленок",44, 6);
        Product candy = new Product("конфета",31, 8);
        Product butter = new Product("масло",40, 5);

        Set<Product> bucketSet = new HashSet<>();
        bucketSet.add(new Product("банан", 60, 3));
        bucketSet.add(new Product("хлеб", 5, 1));
        bucketSet.add(new Product("яйцо", 59, 5));
        bucketSet.add(new Product("молоко", 45, 5));
        bucketSet.add(new Product("яблоко", 23, 6));
        bucketSet.add(new Product("морковь", 11, 1));
        bucketSet.add(new Product("цыпленок", 44, 6));
        bucketSet.add(new Product("конфета", 31, 8));
        bucketSet.add(new Product("масло", 40, 5));
        System.out.println();

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
