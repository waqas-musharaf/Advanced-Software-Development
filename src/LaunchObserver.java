public class LaunchObserver {
    public static void main(String args[]){

        RoomTable roomTable = new RoomTable();
        BookingTable bookingTable = new BookingTable();

        ClerkGUI clerkGUI1 = new ClerkGUI(roomTable, bookingTable);
        //ClerkGUI clerkGUI2 = new ClerkGUI(roomTable, bookingTable);
        //ClerkGUI clerkGUI3 = new ClerkGUI(roomTable, bookingTable);
        ManagerGUI managerGUI = new ManagerGUI(roomTable, bookingTable);

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
