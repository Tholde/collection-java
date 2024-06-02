import Crud.CrudMap;
import Personne.Personne;
import java.util.HashMap;
import java.util.Scanner;

public class MainMap {
    static HashMap<Integer, Personne> list = new HashMap<>();
    static CrudMap data = new CrudMap();

    static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    static void createPerson() {
        try {
            Personne pers = new Personne();
            System.out.print("Enter Person Id: ");
            pers.setPersCode(scan.nextInt());
            System.out.print("Enter Person Name: ");
            pers.setName(scan.next());
            System.out.print("Enter Person Age: ");
            pers.setAge(scan.nextInt());
            data.createPerson(list, pers);
            System.out.println(STR."Person\{pers.getPersCode()} created successfully!");
        } catch (Exception e) {
            System.out.println("=> Input error");
        }
    }

    static void readOnePerson() {
        if (list.isEmpty()) {
            System.out.println("=> go to create about");
        } else {
            try {
                System.out.print("Enter Person Id: ");
                int id = scan.nextInt();
                data.readOnePerson(list, id);
            } catch (Exception e) {
                System.out.println("=> Input error");
            }
        }
    }

    static void updatePerson() {
        if (list.isEmpty()) {
            System.out.println("=> go to create about");
        } else {
            try {
                Personne pers = new Personne();
                System.out.print("Enter Person Id: ");
                int id = scan.nextInt();
                System.out.print("Enter Person Name: ");
                pers.setName(scan.next());
                System.out.print("Enter Person Age: ");
                pers.setAge(scan.nextInt());
                data.updatePerson(list, id, pers);
            } catch (Exception e) {
                System.out.println("=> Input error");
            }
        }
    }

    static void deletePerson() {
        if (list.isEmpty()) {
            System.out.println("=> go to create about");
        } else {
            try {
                System.out.print("Enter Person Id: ");
                int id = scan.nextInt();
                data.deletePerson(list, id);
            } catch (Exception e) {
                System.out.println("=> Input error");
            }
        }
    }
}
