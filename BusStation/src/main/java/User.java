import java.util.List;
import java.util.Objects;

public class User {
    private int id;
    private String name;

    private List<Ticket> tickets;
    private int hashPassword;
    private long cardNumber;

    public User(int id, String name, List<Ticket> tickets, int hashPassword, long cardNumber) {
        this.id = id;
        this.name = name;
        this.tickets = tickets;
        this.hashPassword = hashPassword;
        this.cardNumber = cardNumber;

    }
    public String getUserName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
    public int hashCode() {
        return Objects.hash(id, name, hashPassword, cardNumber);
    }


    public int getHashPassword() {
        return hashPassword;
    }

    public String getName() {
        return name;
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tickets=" + tickets +
                ", hashPassword=" + hashPassword +
                ", cardNumber=" + cardNumber +
                '}';
    }
}

