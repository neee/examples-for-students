import java.time.LocalDate;

public class Driver {
    String name;
    String surname;
    LocalDate birthday;
    DriverLicense driverLicense;

    public Driver() {
    }

    public Driver(String name, String surname, LocalDate birthday, DriverLicense driverLicense) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.driverLicense = driverLicense;
    }

    public String toString() {
        return "name:" + name + " surname:" + surname + " birthday:" +
                birthday.toString() + "\ndriverLicense:" + driverLicense.toString();
    }
}
