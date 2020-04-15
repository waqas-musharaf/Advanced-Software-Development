import Objects.BookingTable;
import Objects.RoomTable;
import Objects.TermTable;
import Interfaces.ClerkGUI;
import Interfaces.ManagerGUI;

public class LaunchObserver {
    public static void main(String args[]){

        RoomTable roomTable = new RoomTable();
        BookingTable bookingTable = new BookingTable();
        TermTable termTable = new TermTable();

        ClerkGUI clerkGUI1 = new ClerkGUI(roomTable, bookingTable, termTable);
        //Interfaces.ClerkGUI clerkGUI2 = new Interfaces.ClerkGUI(roomTable, bookingTable, termTable);
        //Interfaces.ClerkGUI clerkGUI3 = new Interfaces.ClerkGUI(roomTable, bookingTable, termTable);
        ManagerGUI managerGUI = new ManagerGUI(roomTable, bookingTable, termTable);

        Thread ct1 = new Thread(clerkGUI1);
        //Thread ct2 = new Thread(clerkGUI2);
        //Thread ct3 = new Thread(clerkGUI3);
        Thread mt1 = new Thread(managerGUI);

        ct1.start();
        //ct2.start();
        //ct3.start();
        mt1.start();
    }
}
