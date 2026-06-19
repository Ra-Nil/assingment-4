class Seat {
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void bookSeat() {
        System.out.println("Seat " + seatNumber + " booked.");
    }
}

class RegularSeat extends Seat {
    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Regular Seat " + getSeatNumber() + " booked successfully.");
    }
}

class PremiumSeat extends Seat {
    private double luxuryTax;

    public PremiumSeat(String seatNumber, double luxuryTax) {
        super(seatNumber);
        this.luxuryTax = luxuryTax;
    }

    @Override
    public void bookSeat() {
        System.out.println("Premium Seat " + getSeatNumber() + " booked with snacks and luxury tax: " + luxuryTax);
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat[] seats = {
            new RegularSeat("A1"),
            new PremiumSeat("P1", 500)
        };

        for (Seat seat : seats) {
            seat.bookSeat();
        }
    }
}