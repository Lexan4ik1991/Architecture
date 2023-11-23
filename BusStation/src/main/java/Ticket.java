import java.util.Date;

public class Ticket {
    private int id;
    private int departureZone;
    private int arrivalZone;
    private Date departureTime;
    private Date arrivalTime;
    private int buyerId;
    private boolean isUsed;

    private int price;

    private String place;

    public Ticket(int id, int departureZone, int arrivalZone, Date departureTime, Date arrivalTime,
                  int buyerId, boolean isUsed, int price, String place) {
        this.id = id;
        this.departureZone = departureZone;
        this.arrivalZone = arrivalZone;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.buyerId = buyerId;
        this.isUsed = isUsed;
        this.price = price;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", departureZone=" + departureZone +
                ", arrivalZone=" + arrivalZone +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", buyerId=" + buyerId +
                ", isUsed=" + isUsed +
                ", price=" + price +
                ", place='" + place + '\'' +
                '}';
    }
}

