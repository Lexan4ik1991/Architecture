import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private int id;
    private long cardNumber;
    private List<Integer> zones;
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;

        zones = new ArrayList<>();
        zones.add(0);
        zones.add(1);
    }
    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

}

