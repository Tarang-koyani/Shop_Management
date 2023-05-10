import java.util.*;
import javax.lang.model.util.ElementScanner14;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;

class vehicles {
    String colour;
    String company;
    int price;
    int quantity;

    vehicles() {
        this.colour = null;
        this.company = null;
        this.price = 0;
        this.quantity = 0;
    }

    vehicles(String colour, String company, int price, int quantity) {
        this.colour = colour;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
    }
}

class car extends vehicles {
    Scanner sc = new Scanner(System.in);

    int engine_cc;
    String fuel_type;

    car() {
        super();
        this.engine_cc = 0;
        this.fuel_type = null;
    }

    car(String company, String colour, String fuel_type, int price, int quantity, int engine_cc) {
        super(colour, company, price, quantity);
        this.engine_cc = engine_cc;
        this.fuel_type = fuel_type;
    }

    car getter() {
        System.out.println("Enter the company name           :");
        String company = sc.nextLine();
        System.out.println("Enter the colour of car          :");
        String colour = sc.nextLine();
        System.out.println("Enter the type of car fuel_type  :");
        String fuel_type = sc.nextLine();
        System.out.println("Enter the capacity of car engine :");
        int engine_cc = sc.nextInt();
        System.out.println("Enter the quantity of car        :");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of car           :");
        int price = sc.nextInt();

        return new car(company, colour, fuel_type, price, quantity, engine_cc);
    }

    void info_display() {
        System.out.println("car name            : " + company);
        System.out.println("car colour          : " + colour);
        System.out.println("car fuel type       : " + fuel_type);
        System.out.println("car price           : " + price);
        System.out.println("car quantity        : " + quantity);
        System.out.println("car engine capacity : " + engine_cc);
    }
}

class bike extends vehicles {
    Scanner sc = new Scanner(System.in);

    bike() {
        super();
    }

    bike(String company, String colour, int price, int quantity) {
        super(colour, company, price, quantity);
    }

    bike getter() {
        System.out.println("Enter the name of bike     :");
        String company = sc.nextLine();
        System.out.println("Enter the colour of bike   :");
        String colour = sc.nextLine();
        System.out.println("Enter the quantity of bike :");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of bike    :");
        int price = sc.nextInt();

        return new bike(company, colour, price, quantity);
    }

    void info_display() {
        System.out.println("Bike name     : " + company);
        System.out.println("Bike colour   : " + colour);
        System.out.println("Bike price    : " + price);
        System.out.println("Bike quantity : " + quantity);
    }
}

class cycle extends vehicles {
    Scanner sc = new Scanner(System.in);

    cycle() {
        super();
    }

    cycle(String company, String colour, int price, int quantity) {
        super(colour, company, price, quantity);
    }

    cycle getter() {
        System.out.println("Enter the name of comapany  :");
        String company = sc.nextLine();
        System.out.println("Enter the colour of cycle   :");
        String colour = sc.nextLine();
        System.out.println("Enter the quantity of cycle :");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of cycle    :");
        int price = sc.nextInt();

        return new cycle(company, colour, price, quantity);
    }

    void info_display() {
        System.out.println("cycle name     : " + company);
        System.out.println("cycle colour   : " + colour);
        System.out.println("cycle price    : " + price);
        System.out.println("cycle quantity : " + quantity);
    }
}

class bill {
    String customer_name;
    String sell_vehicle;
    String sell_date;
    int quantity_vehicle;
    int price_vehicle;

    bill() {
        this.customer_name = null;
        this.sell_vehicle = null;
        this.sell_date = null;
        this.quantity_vehicle = 0;
        this.price_vehicle = 0;
    }

    bill(String name, String vehicle, String date, int quantity, int price) {
        this.customer_name = name;
        this.sell_vehicle = vehicle;
        this.sell_date = date;
        this.quantity_vehicle = quantity;
        this.price_vehicle = price;
    }

    bill getter(String name, String date, String vehicle, int quantity, int price) {
        bill b = new bill(name, vehicle, date, quantity, price);
        return b;
    }
}

class Shop_management {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<car> car_link = new ArrayList<>();
        ArrayList<bike> bike_link = new ArrayList<>();
        ArrayList<cycle> cycle_link = new ArrayList<>();
        ArrayList<bill> car_bill = new ArrayList<>();
        ArrayList<bill> bike_bill = new ArrayList<>();
        ArrayList<bill> cycle_bill = new ArrayList<>();

        // System.out.println("\033[H\033[2J");

        car a1 = new car("Jaguar", "blue ", "diesel", 7200000, 5, 6500);
        car a2 = new car("BMW", "black", "diesel", 5300000, 7, 5800);
        car a3 = new car("Audi", "white", "diesel", 4500000, 6, 5000);
        car_link.add(a1);
        car_link.add(a2);
        car_link.add(a3);

        bike b1 = new bike("hero-honda", "blue", 75000, 4);
        bike b2 = new bike("Dream-yuga", "black", 85000, 4);
        bike b3 = new bike("passion", "white", 70000, 8);
        bike_link.add(b1);
        bike_link.add(b2);
        bike_link.add(b3);

        cycle c1 = new cycle("TATA_with_gear", "blue", 7000, 4);
        cycle c2 = new cycle("HERO_without_gear", "black", 5500, 4);
        cycle c3 = new cycle("JUICE_with_disk_break", "white", 8500, 9);
        cycle_link.add(c1);
        cycle_link.add(c2);
        cycle_link.add(c3);

        int x = 1;

        label: {
            while (x != 4) {
                label2: {
                    // System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t----------------------------------------");
                    System.out.println("\t\t\t|    WELCOME TO BHARAT LTD. COMPANY    |");
                    System.out.println("\t\t\t----------------------------------------\n\n");
                    System.out.println("1.car \n2.Bike \n3.Cycle  \n4.Exit\n");
                    System.out.println("======================\n");
                    System.out.println("Enter the choice :");
                    x = sc.nextInt();

                    if (x == 4) {
                        break label;
                    }

                    if (x == 1) {
                        int c = 1;

                        while (c != 7) {
                            System.out.println("\n================================");
                            System.out.println("\npress 1 : Add");
                            System.out.println("press 2 : show all car");
                            System.out.println("press 3 : Information of  car");
                            System.out.println("press 4 : show stock");
                            System.out.println("press 5 : Generate the bill");
                            System.out.println("press 6 : history of selling");
                            System.out.println("press 7 : Home\n");
                            System.out.println("================================");
                            System.out.println("\nEnter  your choice :");
                            c = sc.nextInt();
                            // System.out.println("\033[H\033[2J");
                            if (c == 7) {
                                break label2;
                            }

                            switch (c) {
                                case 1: {
                                    car new_car = new car();
                                    new_car = new_car.getter();
                                    int count = 0;
                                    for (car Car : car_link) {
                                        if (new_car.company.equalsIgnoreCase(Car.company)) {
                                            count = 1;
                                            break;
                                        }
                                    }
                                    if (count == 1) {
                                        System.out.println("\nThis car is exist !!");

                                    } else {
                                        car_link.add(new_car);
                                    }
                                    break;
                                }

                                case 2: {
                                    int index = 1;
                                    for (car Car : car_link) {
                                        System.out.println(index + ") : " + Car.company);
                                        index++;
                                    }
                                    System.out.println();
                                    break;
                                }

                                case 3: {
                                    String car_name;
                                    System.out.println("Enter the name of car : ");
                                    car_name = sc.next();

                                    int check = 0;
                                    for (car Car : car_link) {
                                        if (car_name.equalsIgnoreCase(Car.company)) {
                                            Car.info_display();
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("*********************************************");
                                        System.out.println("         Sorry,car does not exist!!!");
                                        System.out.println("*********************************************");
                                    }
                                    break;
                                }

                                case 4: {
                                    System.out.println("-------------------------");
                                    System.out.println("\tCar_Name vs Quantity");
                                    System.out.println("-------------------------\n");

                                    for (car Car : car_link) {
                                        System.out.println(
                                                "-> We have " + Car.quantity + " cars of " + Car.company + " company.");
                                        // System.out.println("------------------------------\n");
                                        System.out.println();
                                    }
                                    break;
                                }

                                case 5: {
                                    String car_name;
                                    int quantity;
                                    String customer_name;
                                    String date;

                                    System.out.println("Enter the name of customer : ");
                                    customer_name = sc.next();
                                    System.out.println("Enter the name of car      : ");
                                    car_name = sc.next();
                                    System.out.println("Enter the quantity of car  : ");
                                    quantity = sc.nextInt();
                                    DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                                    Calendar obj = Calendar.getInstance();
                                    date = formatter.format(obj.getTime());

                                    int check = 0;
                                    int count = 0;
                                    for (car Car : car_link) {
                                        if (Car.company.equalsIgnoreCase(car_name)) {

                                            if (Car.quantity - quantity <= 0) {
                                                System.out.println("we have only " + Car.quantity + " " + Car.company);
                                                count = 1;
                                                break;
                                            }

                                            Car.quantity = Car.quantity - quantity;
                                            System.out.println("\n\tCustomer name   : " + customer_name);
                                            System.out.println("\tDate of sell    : " + date);
                                            System.out.println("\tName of car     : " + Car.company);
                                            System.out.println("\tQuantity of car : " + quantity);

                                            System.out.println("\n\t---------------------------");
                                            System.out.println("\t  Total amount  : " + Car.price * quantity);
                                            System.out.println("\t---------------------------\n");

                                            bill b = new bill();
                                            b = b.getter(customer_name, date, Car.company, Car.quantity,
                                                    Car.price * quantity);
                                            car_bill.add(b);
                                            check = 1;

                                            break;
                                        }
                                    }
                                    if (check == 0 && count == 0) {
                                        System.out.println("********************************************");
                                        System.out.println("       please enter valid car name!!!");
                                        System.out.println("********************************************");
                                    }
                                    break;
                                }

                                case 6: {
                                    System.out.println("\n\t**********   History   **********\n");
                                    int count = 0;
                                    for (bill Bill : car_bill) {
                                        count += Bill.price_vehicle;
                                        System.out.println("\t--> Customer name   : " + Bill.customer_name);
                                        System.out.println("\t    Car             : " + Bill.sell_vehicle);
                                        System.out.println("\t    Date of sell    : " + Bill.sell_date);

                                        System.out.println("\n\n\t    --------------------------");
                                        System.out.println("\t    Total amount    : " + Bill.price_vehicle);
                                        System.out.println("\t    --------------------------\n");
                                    }
                                    System.out.println("\n=================================");
                                    System.out.println("--->  Total selling : " + count);
                                    System.out.println("=================================\n");
                                    break;
                                }
                            }
                        }
                    } else if (x == 2) {
                        int c = 1;

                        while (c != 7) {
                            System.out.println("================================");
                            System.out.println("\npress 1 : Add");
                            System.out.println("press 2 : show all bike");
                            System.out.println("press 3 : Information of  bike");
                            System.out.println("press 4 : show stock");
                            System.out.println("press 5 : Generate the bill");
                            System.out.println("press 6 : history of selling");
                            System.out.println("press 7 : Home\n");
                            System.out.println("================================");
                            System.out.println("\nEnter your choice :");
                            c = sc.nextInt();
                            // System.out.println("\033[H\033[2J");
                            switch (c) {
                                case 1: {
                                    bike new_bike = new bike();
                                    new_bike = new_bike.getter();
                                    int count = 0;
                                    for (bike Bike : bike_link) {
                                        if (new_bike.company.equalsIgnoreCase(Bike.company)) {

                                            count = 1;
                                            break;
                                        }
                                    }
                                    if (count == 1) {
                                        System.out.println("\nThis Bike is exist !!");
                                    } else {
                                        bike_link.add(new_bike);
                                    }
                                    break;
                                }

                                case 2: {
                                    int index = 1;
                                    for (bike Bike : bike_link) {
                                        System.out.println(index + ") : " + Bike.company);
                                        index++;
                                    }
                                    break;
                                }

                                case 3: {
                                    String bike_name;
                                    System.out.println("Enter the name of Bike : ");
                                    bike_name = sc.next();

                                    int check = 0;
                                    for (bike Bike : bike_link) {
                                        if (bike_name.equalsIgnoreCase(Bike.company)) {
                                            Bike.info_display();
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("**************************");
                                        System.out.println("  Bike does not exist!!!");
                                        System.out.println("**************************");
                                    }
                                    break;
                                }

                                case 4: {
                                    System.out.println("---------------------------");
                                    System.out.println("   Bike_Name vs Quantity");
                                    System.out.println("---------------------------\n");
                                    for (bike Bike : bike_link) {
                                        System.out.println("-> We have " + Bike.quantity + " bikes of " + Bike.company
                                                + " company.");
                                        System.out.println();
                                    }
                                    break;
                                }

                                case 5: {
                                    String bike_name;
                                    int quantity;
                                    String date;
                                    String customer_name;

                                    System.out.println("\nEnter the name of customer : ");
                                    customer_name = sc.next();
                                    System.out.println("Enter the name bike        : ");
                                    bike_name = sc.next();
                                    System.out.println("Enter the quantity bike    : ");
                                    quantity = sc.nextInt();
                                    DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                                    Calendar obj = Calendar.getInstance();
                                    date = formatter.format(obj.getTime());

                                    int check = 0;
                                    int count = 0;
                                    for (bike Bike : bike_link) {
                                        if (Bike.company.equalsIgnoreCase(bike_name)) {

                                            if (Bike.quantity - quantity <= 0) {
                                                System.out
                                                        .println("we have only " + Bike.quantity + " " + Bike.company);
                                                count = 1;
                                                break;
                                            }

                                            Bike.quantity = Bike.quantity - quantity;
                                            System.out.println("\n\tCustomer name   : " + customer_name);
                                            System.out.println("\tDate of sell    : " + date);
                                            System.out.println("\tName of car     : " + Bike.company);
                                            System.out.println("\tQuantity of bike : " + quantity);

                                            System.out.println("\n\t---------------------------");
                                            System.out.println("\t  Total amount  : " + Bike.price * quantity);
                                            System.out.println("\t---------------------------\n");

                                            bill b = new bill();
                                            b = b.getter(customer_name, date, Bike.company, Bike.quantity,
                                                    Bike.price * quantity);
                                            bike_bill.add(b);
                                            check = 1;

                                            break;
                                        }
                                    }
                                    if (check == 0 && count == 0) {
                                        System.out.println("********************************************");
                                        System.out.println("       please enter valid bike name!!!");
                                        System.out.println("********************************************");
                                    }

                                    break;
                                }

                                case 6: {
                                    System.out.println("*******   History   *******");
                                    int count = 0;
                                    for (bill Bill : bike_bill) {
                                        count += Bill.price_vehicle;
                                        System.out.println("\tCustomer name   : " + Bill.customer_name);
                                        System.out.println("\tBike            : " + Bill.sell_vehicle);
                                        System.out.println("\tDate of sell    : " + Bill.sell_date);
                                        System.out.println("\tQuantity        : " + Bill.quantity_vehicle);

                                        System.out.println("\n\n\t--------------------------");
                                        System.out.println("\tTotal amount    : " + Bill.price_vehicle);
                                        System.out.println("\t--------------------------\n");
                                        System.out.println();
                                    }
                                    System.out.println("\n=================================");
                                    System.out.println("-----> Total selling :" + count);
                                    System.out.println("=================================\n");
                                    break;
                                }
                            }
                        }
                    }

                    else if (x == 3) {
                        int c = 1;

                        while (c != 7) {
                            System.out.println("================================");
                            System.out.println("\npress 1 :Add");
                            System.out.println("press 2 :show all bicycle");
                            System.out.println("press 3 :Information of  bicycle");
                            System.out.println("press 4 :show stock");
                            System.out.println("press 5 :Generate the bill");
                            System.out.println("press 6 :history of selling");
                            System.out.println("press 7 :Home\n");
                            System.out.println("================================");
                            System.out.println("\nEnter your choice :");
                            c = sc.nextInt();
                            // System.out.println("\033[H\033[2J");
                            switch (c) {
                                case 1: {
                                    cycle new_cycle = new cycle();
                                    new_cycle = new_cycle.getter();
                                    int count = 0;
                                    for (cycle Cycle : cycle_link) {
                                        if (new_cycle.company.equalsIgnoreCase(Cycle.company)) {
                                            count = 1;
                                            break;
                                        }
                                    }
                                    if (count == 1) {
                                        System.out.println("\nThis cycle is exist !!");

                                    } else {
                                        cycle_link.add(new_cycle);
                                    }
                                    break;
                                }

                                case 2: {
                                    int index = 1;
                                    for (cycle Cycle : cycle_link) {
                                        System.out.println(index + ") : " + Cycle.company);
                                        index++;
                                    }
                                    break;
                                }

                                case 3: {
                                    String bicycle_name;
                                    System.out.println("Enter the name of Bicycle : ");
                                    bicycle_name = sc.next();
                                    int check = 0;
                                    for (cycle Cycle : cycle_link) {
                                        if (bicycle_name.equalsIgnoreCase(Cycle.company)) {
                                            Cycle.info_display();
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("***********************************");
                                        System.out.println("     Bicycle does not exist!!!");
                                        System.out.println("***********************************");
                                    }
                                    break;
                                }

                                case 4: {
                                    System.out.println("------------------------------");
                                    System.out.println("\tBicycle_Name vs Quantity");
                                    System.out.println("------------------------------\n");
                                    for (cycle Cycle : cycle_link) {
                                        System.out.println("-> We have " + Cycle.quantity + " bicycles of "
                                                + Cycle.company + " company.");
                                        System.out.println(
                                                "-----------------------------------------------------------------------------\n");
                                    }
                                    break;
                                }

                                case 5: {
                                    String cycle_name;
                                    int quantity;
                                    String customer_name;
                                    String date;

                                    System.out.println("Enter the name of customer  : ");
                                    customer_name = sc.next();
                                    System.out.println("Enter the name of cycle     : ");
                                    cycle_name = sc.next();
                                    System.out.println("Enter the quantity of cycle : ");
                                    quantity = sc.nextInt();
                                    DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                                    Calendar obj = Calendar.getInstance();
                                    date = formatter.format(obj.getTime());

                                    int check = 0;
                                    int count = 0;
                                    for (cycle Cycle : cycle_link) {
                                        if (Cycle.company.equalsIgnoreCase(cycle_name)) {

                                            if (Cycle.quantity - quantity <= 0) {
                                                System.out.println(
                                                        "we have only " + Cycle.quantity + " " + Cycle.company);
                                                count = 1;
                                                break;
                                            }

                                            Cycle.quantity = Cycle.quantity - quantity;
                                            System.out.println("\n\tCustomer name   : " + customer_name);
                                            System.out.println("\tDate of sell    : " + date);
                                            System.out.println("\tName of cycle     : " + Cycle.company);
                                            System.out.println("\tQuantity of cycle : " + quantity);

                                            System.out.println("\n\t---------------------------");
                                            System.out.println("\t  Total amount  : " + Cycle.price * quantity);
                                            System.out.println("\t---------------------------\n");

                                            bill b = new bill();
                                            b = b.getter(customer_name, date, Cycle.company, Cycle.quantity,
                                                    Cycle.price * quantity);
                                            cycle_bill.add(b);
                                            check = 1;

                                            break;
                                        }
                                    }
                                    if (check == 0 && count == 0) {
                                        System.out.println("********************************************");
                                        System.out.println("       please enter valid cycle name!!!");
                                        System.out.println("********************************************");
                                    }
                                    break;
                                }

                                case 6: {
                                    System.out.println("*******  History  *******");
                                    int count = 0;
                                    for (bill Bill : cycle_bill) {
                                        count += Bill.price_vehicle;
                                        System.out.println("\tCustomer name   : " + Bill.customer_name);
                                        System.out.println("\tCycle           : " + Bill.sell_vehicle);
                                        System.out.println("\tDate of sell    : " + Bill.sell_date);
                                        System.out.println("\n\t--------------------------");
                                        System.out.println("\tTotal amout     : " + Bill.price_vehicle + "\n");
                                        System.out.println("\t--------------------------\n");
                                    }
                                    System.out.println("\n=================================");
                                    System.out.println("-----> Total selling : " + count);
                                    System.out.println("=================================\n");
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("**************************************");
                        System.out.println("   Please,Enter the valid choice!!!");
                        System.out.println("**************************************");
                    }
                }
            }
        }

        System.out.println("\t\t\t===============================================");
        System.out.println("\t\t\t      ::::::: Thanks for visiting :::::::");
        System.out.println("\t\t\t===============================================");
        sc.close();
    }
}