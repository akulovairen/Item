import java.time.LocalDate;
import java.util.Date;

public class Item {
    public String name;
    public double price;
    public int quantity;
    public LocalDate date;

    public Item(String name, double price, int quantity, LocalDate date) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }
}
