import java.util.ArrayList;
import java.util.Arrays;
public class main2 {
    public static void main(String[] args) {
        // create an array with the known values
        Integer[] intsArray = {1, 2, 3, 4, 5};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);
        Car car1 = new Car("a", 1);
        Car car2 = new Car("b", 2);
        Car car3 = new Car("c", 3);
        Car[] cars = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
    }
}
