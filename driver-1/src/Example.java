import java.time.LocalDate;

public class Example {
    public static void main(String[] args) {
        //Пример создания написанных объектов

        //Так как объект driver зависит от driverLicense создадим первым driverLicense
        DriverLicense driverLicense = new DriverLicense("A,B",
                LocalDate.of(2018, 11, 01),
                LocalDate.of(2028, 11, 01));

        //Обращаю внимание что в конструтор driver мы передаем созданный строкой выше объект driverLicense
        Driver driver = new Driver("John", "Wayne", LocalDate.of(1980, 1, 30), driverLicense);

        //Выведем что получилось
        System.out.println(driver.toString());
    }
}
