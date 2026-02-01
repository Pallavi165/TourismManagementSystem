package main;

import dto.DestinationDTO;
import dto.TouristDTO;
import java.util.Scanner;
import service.TourismService;

public class TourismApp {

    public static void main(String[] args) {

        TourismService service = new TourismService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Tourism Management System ---");
            System.out.println("1. Add Destination");
            System.out.println("2. View Destinations");
            System.out.println("3. Add Tourist");
            System.out.println("4. View Tourists");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    DestinationDTO d = new DestinationDTO();
                    System.out.print("Destination Name: ");
                    d.setName(sc.nextLine());
                    System.out.print("Location: ");
                    d.setLocation(sc.nextLine());
                    System.out.println(service.addDestination(d)
                            ? "Destination Added"
                            : "Failed");
                    break;

                case 2:
                    service.viewDestinations().forEach(dest ->
                        System.out.println(dest.getDestId() + " "
                                + dest.getName() + " "
                                + dest.getLocation()));
                    break;

                case 3:
                    TouristDTO t = new TouristDTO();
                    System.out.print("Tourist Name: ");
                    t.setName(sc.nextLine());
                    System.out.print("Phone: ");
                    t.setPhone(sc.nextLine());
                    System.out.println(service.addTourist(t)
                            ? "Tourist Added"
                            : "Failed");
                    break;

                case 4:
                    service.viewTourists().forEach(tour ->
                        System.out.println(tour.getTouristId() + " "
                                + tour.getName() + " "
                                + tour.getPhone()));
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                    sc.close();
            }
        }
    }
}
