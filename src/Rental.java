import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Rental {

    private Car car;

    private Customer customer;

    private Calendar start;

    private Calendar end;

    public Rental(Car car, Customer customer, Calendar start, Calendar end) {
        this.car = car;
        this.customer = customer;
        this.start = start;
        this.end = end;
    }
    

    public String toString() {
        return this.car.getCarInfo() + " has been rented to " + this.customer.getCustomerInfo() + ". The rental period will start on " + this.start.getTime() + " and end on " + this.end.getTime();
    }

}
