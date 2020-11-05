package miniProject2;

/**
 * controller
 */

import java.util.Scanner;

public class InputCollector {

//  public static String getUserInput (String prompt);


  public static void main(String[] args) {
    boolean again = true;
    ContactList cl = new ContactList();


    while (again) {

      System.out.println("+===  Contact  App  ===+");
      System.out.println("| 1. List all Contacts |");
      System.out.println("| 2. add new Contact   |");
      System.out.println("| 3. Remove Contact    |");
      System.out.println("| 4. Update Contact    |");
      System.out.println("| 5. Quit              |");
      System.out.println("+======================+");

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your option:");
      String code = scanner.nextLine();

      switch (code) {
        case "1":
          int count = 0;
          for (Contact contact : cl.list) {
            System.out.print(count + ". ");
            System.out.println(contact);
            count += 1;
          }
          break;

        case "2":
          Contact c = new Contact();
          System.out.println("Enter name:");
          Scanner scanName = new Scanner(System.in);
          String name = scanner.nextLine();
          c.setName(name);
          System.out.println("Enter mobile:");
          String mobile = scanner.nextLine();
          c.setMobile(mobile);
          System.out.println("Enter work:");
          String work = scanner.nextLine();
          c.setWork(work);
          System.out.println("Enter home:");
          String home = scanner.nextLine();
          c.setHome(home);
          System.out.println("Enter city:");
          String city = scanner.nextLine();
          c.setCity(city);
          cl.list.add(c);
          System.out.println("Successfully added a new contact!");

          for (Contact contact : cl.list) {
            System.out.println(contact);
          }
          break;

        case "3":
          count = 0;
          for (Contact contact : cl.list) {
            System.out.print(count + ". ");
            System.out.println(contact);
            count += 1;
          }
          System.out.println("Enter the index of the contact remove:");
          Scanner scanRemove = new Scanner(System.in);
          String remove = scanner.nextLine();
          int num = Integer.parseInt(remove);
          cl.list.remove(num);
          break;

        case "4":
          count = 0;
          for (Contact contact : cl.list) {
            System.out.print(count + ". ");
            System.out.println(contact);
            count += 1;
          }
          System.out.println("Enter the index of the contact update:");
          Scanner scanUpdate = new Scanner(System.in);
          String update = scanner.nextLine();
          int select = Integer.parseInt(update);

          c = new Contact();
          System.out.println("Enter name:");
          scanName = new Scanner(System.in);
          name = scanner.nextLine();
          c.setName(name);
          System.out.println("Enter mobile:");
          mobile = scanner.nextLine();
          c.setMobile(mobile);
          System.out.println("Enter work:");
          work = scanner.nextLine();
          c.setWork(work);
          System.out.println("Enter home:");
          home = scanner.nextLine();
          c.setHome(home);
          System.out.println("Enter city:");
          city = scanner.nextLine();
          c.setCity(city);
          cl.list.set(select,c);
          System.out.println("Successfully added a new contact!");

          for (Contact contact : cl.list) {
            System.out.println(contact);
          }
          break;






        case "5":
          again = false;
          break;
        default:
          System.out.println("Invalid Input. Enter number between 1 and 5.");
      }

    }
  }


}
