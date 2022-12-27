import transport.Car;
import transport.Mechanic;

import java.util.*;

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

        Set<Car> carSet = new HashSet<>();

        carSet.add(new Car("Х5", "BMW", 2013,"Германия"));
        carSet.add(new Car("R1", "Volvo", 2012,"Германия"));
        carSet.add(new Car("R1", "Volvo", 2012,"Германия"));
        carSet.add(new Car("Max4", "Nissan", 2011,"Германия"));
        System.out.println(Arrays.toString(carSet.toArray()));
        Set<Mechanic> mechanics = new HashSet<>();
        mechanics.add(new Mechanic("Валентин Павлович", "Электрик", "Volvo"));
        mechanics.add(new Mechanic("Григорий Петрович", "Сборщик", "BMW"));

        Map<String, String> map = new HashMap<>();
        for (Mechanic mechanic : mechanics) {
            map.put(mechanic.getName(), mechanic.getCar());
        }
        System.out.println(map);

    }
}
