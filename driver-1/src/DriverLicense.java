import java.time.LocalDate;

public class DriverLicense {
    String category;
    LocalDate issued;
    LocalDate expiredAt;

    public DriverLicense(String category, LocalDate issued, LocalDate expiredAt) {
        this.category = category;
        this.issued = issued;
        this.expiredAt = expiredAt;
    }

    public String toString() {
        return "category:" + category + " issued:" + issued.toString() + " expiredAt:" + expiredAt.toString();
    }
}
