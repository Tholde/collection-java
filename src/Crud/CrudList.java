package Crud;

import Personne.Personne;

import java.util.ArrayList;

public class CrudList {
    public ArrayList<Personne> createListPerson(ArrayList<Personne> persList, Personne pers) {
        persList.add(pers);
        return persList;
    }

    public void readPerson(ArrayList<Personne> list) {
        if (list.isEmpty()) {
            System.out.println("There are not person in list!");
        } else {
            System.out.println("-------------------------");
            for (Personne pers : list) {
                System.out.println(pers.toString());
                System.out.println("-------------------------");
            }
        }
    }

    public void readOnePerson(ArrayList<Personne> list, int id){
        Personne pers = findPersonReturnPerson(id,list);
        if (pers == null) {
            System.out.println("They have not a person in list!");
        } else {
            System.out.println("--------------------------");
            System.out.println(pers.toString());
            System.out.println("--------------------------");
        }
    }

    public void updatePerson(ArrayList<Personne> list, int code, Personne pers) {
        int id = findByPersonId(code, list);
        list.get(id).setName(pers.getName());
        list.get(id).setAge(pers.getAge());
        System.out.println(STR."\{code} updated successfully");
    }

    public void deletePerson(ArrayList<Personne> list, int code) {
        int id = findByPersonId(code, list);
        list.remove(id);
        System.out.println(STR."\{code} deleted successfully");
    }

    public int findByPersonId(int id, ArrayList<Personne> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersCode() == id)
                return i;
        }
        return 0;
    }

    public Personne findPersonReturnPerson(int id, ArrayList<Personne> list) {
        for (Personne pers : list) {
            if (pers.getPersCode() == id) {
                return pers;
            }
        }
        return null;
    }
}
