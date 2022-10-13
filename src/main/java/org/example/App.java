package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CarRepository repository = new CarRepository();

        repository.addCar(new Car(
                "Tesla",
                "S",
                2019,
                "Red",
                30000,
                "KA9999AA"
        ));
        repository.addCar(new Car(
                "Ford",
                "Model1",
                2016,
                "Black",
                19000,
                "KA0000AA"
        ));
        repository.addCar(new Car(
                "Shevrolet",
                "Camaro 12",
                2018,
                "White",
                24000,
                "KA9999AA"
        ));

        System.out.println(repository.findByManufacturer("Tesla"));
        System.out.println(repository.findByHigherPriceThan(23000));
        System.out.println(repository.findByYearsUsageMoreThan(3));
    }
}
