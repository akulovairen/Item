import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class logic {

    public static void main(String[] args) {
        Random random = new Random();

        List<Item> items = getItemList(random);
        double sumItems = items
                .stream()
                .filter(item -> item.getDate().isAfter(LocalDate.now().plusDays(10)))
                .mapToDouble(Item::getPrice)
                .sum();

        System.out.println(sumItems);

    }

    private static List<Item> getItemList(Random random) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i<100;i++) {
            Item item = new Item("Товар-" + i, 1+ random.nextInt(1001), 1+ random.nextInt(10), getRandomDate(random));
            items.add(item);
        }
        return items;
    }

    private static LocalDate getRandomDate(Random random) {
        int minDay= (int) LocalDate.of(2021,11,1).toEpochDay();
        int maxDay= (int) LocalDate.of(2022,1,1).toEpochDay();
        long randomDay=minDay + random.nextInt(maxDay-minDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return randomDate;
    }
}
