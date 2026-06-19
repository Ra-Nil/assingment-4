class Ticket {
    private String ticketNumber;
    private double price;

    public Ticket(String ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public void generateTicket() {
        System.out.println("Ticket No: " + ticketNumber + ", Price: " + price);
    }
}

class BusTicket extends Ticket {
    private int seatNumber;

    public BusTicket(String ticketNumber, double price, int seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    public void generateTicket() {
        System.out.println("Bus Ticket | No: " + getTicketNumber() + ", Price: " + getPrice() + ", Seat: " + seatNumber);
    }
}

class TrainTicket extends Ticket {
    private String coachType;

    public TrainTicket(String ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override
    public void generateTicket() {
        System.out.println("Train Ticket | No: " + getTicketNumber() + ", Price: " + getPrice() + ", Coach: " + coachType);
    }
}

class FlightTicket extends Ticket {
    private String boardingGate;

    public FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    public void generateTicket() {
        System.out.println("Flight Ticket | No: " + getTicketNumber() + ", Price: " + getPrice() + ", Gate: " + boardingGate);
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] tickets = {
            new BusTicket("B101", 500, 12),
            new TrainTicket("T202", 1200, "Sleeper"),
            new FlightTicket("F303", 8000, "G5")
        };

        for (Ticket ticket : tickets) {
            ticket.generateTicket();
        }
    }
}
