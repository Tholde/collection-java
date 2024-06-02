import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        principalMenu();
    }

    static void principalMenu(){
        while (true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("******************************");
                System.out.println("**** WELCOME TO MENU PAGE ****");
                System.out.println("******************************");
                System.out.println("Choose one collection type: **");
                System.out.println("** 1-Use List               **");
                System.out.println("** 2-Use Set                **");
                System.out.println("** 3-Use Map                **");
                System.out.println("** 4-Exit                   **");
                System.out.println("******************************");
                System.out.print("Your choice : ");
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        menuList();
                        break;
                    case 2:
                        menuSet();
                        break;
                    case 3:
                        menuMap();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("=> Invalid Choice !");
                }
            } catch (Exception e) {
                System.out.println("=> Input Error");
            }
        }
    }
    static void menuList(){
        while (true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("******************************");
                System.out.println("**** WELCOME TO MENU PAGE ****");
                System.out.println("******************************");
                System.out.println("** 1-Create Person          **");
                System.out.println("** 2-Read All Person        **");
                System.out.println("** 3-Read One Person        **");
                System.out.println("** 4-Update Person          **");
                System.out.println("** 5-Delete Person          **");
                System.out.println("** 6-Back to menu           **");
                System.out.println("******************************");
                System.out.print("Your choice : ");
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        MainList.createPerson();
                        break;
                    case 2:
                        MainList.data.readPerson(MainList.list);
                        break;
                    case 3:
                        MainList.readOnePerson();
                        break;
                    case 4:
                        MainList.updatePerson();
                        break;
                    case 5:
                        MainList.deletePerson();
                        break;
                    case 6:
                        principalMenu();
                        break;
                    default:
                        System.out.println("=> Invalid Choice !");
                }
            } catch (Exception e) {
                System.out.println("=> Input Error");
            }
        }
    }
    static void menuSet(){
        while (true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("******************************");
                System.out.println("**** WELCOME TO MENU PAGE ****");
                System.out.println("******************************");
                System.out.println("** 1-Create Person          **");
                System.out.println("** 2-Read All Person        **");
                System.out.println("** 3-Read One Person        **");
                System.out.println("** 4-Update Person          **");
                System.out.println("** 5-Delete Person          **");
                System.out.println("** 6-Back to menu           **");
                System.out.println("******************************");
                System.out.print("Your choice : ");
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        MainSet.createPerson();
                        break;
                    case 2:
                        MainSet.data.readPerson(MainSet.list);
                        break;
                    case 3:
                        MainSet.readOnePerson();
                        break;
                    case 4:
                        MainSet.updatePerson();
                        break;
                    case 5:
                        MainSet.deletePerson();
                        break;
                    case 6:
                        principalMenu();
                        break;
                    default:
                        System.out.println("=> Invalid Choice !");
                }
            } catch (Exception e) {
                System.out.println("=> Input Error");
            }
        }
    }
    static void menuMap(){
        while (true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("******************************");
                System.out.println("**** WELCOME TO MENU PAGE ****");
                System.out.println("******************************");
                System.out.println("** 1-Create Person          **");
                System.out.println("** 2-Read All Person        **");
                System.out.println("** 3-Read One Person        **");
                System.out.println("** 4-Update Person          **");
                System.out.println("** 5-Delete Person          **");
                System.out.println("** 6-Back to menu           **");
                System.out.println("******************************");
                System.out.print("Your choice : ");
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        MainMap.createPerson();
                        break;
                    case 2:
                        MainMap.data.readPerson(MainMap.list);
                        break;
                    case 3:
                        MainMap.readOnePerson();
                        break;
                    case 4:
                        MainMap.updatePerson();
                        break;
                    case 5:
                        MainMap.deletePerson();
                        break;
                    case 6:
                        principalMenu();
                        break;
                    default:
                        System.out.println("=> Invalid Choice !");
                }
            } catch (Exception e) {
                System.out.println("=> Input Error");
            }
        }
    }
}