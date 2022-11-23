class Cinema {

    int hallNo;
    int totalNumberofSeats;
    int numberofTicketsSold = 0;
    static int totalNumberofTicketsSold = 0;

    Cinema(){

    }

    Cinema(int hallNo, int totalNumberofSeats){
        this.hallNo = hallNo;
        this.totalNumberofSeats = totalNumberofSeats;
    }


    public void sellTickets(){
        this.numberofTicketsSold += 1;
        totalNumberofTicketsSold += 1;
    }

    public void ticketCancellation(){
        this.numberofTicketsSold -= 1;
        totalNumberofTicketsSold -= 1;
    }

    public int learnEmptySeat(){
        return this.totalNumberofSeats - this.numberofTicketsSold;
    }

    public int getTheTotalNumberofTicketsSold(){
        return totalNumberofTicketsSold;
    }

}


public class App {
    public static void main(String[] args){
        Cinema a = new Cinema(1, 30);
        System.out.println("Cinema A");
        System.out.println("Empty Seat : " + a.learnEmptySeat());
        a.sellTickets();
        a.sellTickets();
        a.sellTickets();
        System.out.println("Number of Tickets Sold : " + a.numberofTicketsSold);
        a.ticketCancellation();
        System.out.println("Ticket cancelled!");
        System.out.println("Number of Tickets Sold : " + a.numberofTicketsSold);
        System.out.println("Empty Seat : " + a.learnEmptySeat()); 
        System.out.println("Total Number of Tickets Sold : " + a.getTheTotalNumberofTicketsSold());
        Cinema b = new Cinema(2, 40);
        System.out.println("\nCinema B");
        System.out.println("Empty Seat : " + b.learnEmptySeat());
        b.sellTickets();
        b.sellTickets();
        b.sellTickets();
        b.sellTickets();
        System.out.println("Number of Tickets Sold : " + b.numberofTicketsSold);
        b.ticketCancellation();
        System.out.println("Ticket cancelled!");
        System.out.println("Number of Tickets Sold : " + b.numberofTicketsSold);
        System.out.println("Empty Seat : " + b.learnEmptySeat());
        System.out.println("Total Number of Tickets Sold : " + b.getTheTotalNumberofTicketsSold()); 
        Cinema c = new Cinema(3, 50);
        System.out.println("\nCinema C");
        System.out.println("Empty Seat : " + c.learnEmptySeat());
        c.sellTickets();
        c.sellTickets();
        c.sellTickets();
        c.sellTickets();
        c.sellTickets();
        System.out.println("Number of Tickets Sold : " + c.numberofTicketsSold);
        c.ticketCancellation();
        System.out.println("Ticket cancelled!");
        System.out.println("Number of Tickets Sold : " + c.numberofTicketsSold);
        System.out.println("Empty Seat : " + c.learnEmptySeat());
        System.out.println("Total Number of Tickets Sold : " + c.getTheTotalNumberofTicketsSold());
    }
}
