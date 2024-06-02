package Crud;

import Personne.Personne;

import java.util.ArrayList;
import java.util.HashSet;

public class CrudSet {
    public HashSet<Personne> createListPerson(HashSet<Personne> persList, Personne pers) {
        persList.add(pers);
        return persList;
    }

    public void readPerson(HashSet<Personne> list) {
        if (list.isEmpty()) {
            System.out.println("There are not a person in list!");
        } else {
            System.out.println("-------------------------");
            for (Personne pers : list) {
                System.out.println(pers.toString());
                System.out.println("-------------------------");
            }
        }
    }

    public void readOnePerson(HashSet<Personne> list, int id){
        Personne pers = findPersonReturnPerson(id,list);
        if (pers == null) {
            System.out.println("There are not a person in list!");
        } else {
            System.out.println("--------------------------");
            System.out.println(pers.toString());
            System.out.println("--------------------------");
        }
    }

    public void updatePerson(HashSet<Personne> list, int code, Personne pers) {
        Personne per = findPersonId(code, list);
        if (pers == null) {
            System.out.println(STR."\{code} not found!");
            return;
        }else {
            per.setName(pers.getName());
            per.setAge(pers.getAge());
        }
        System.out.println(STR."\{code} updated successfully");
    }

    public void deletePerson(HashSet<Personne> list, int code) {
        Personne per = findPersonId(code, list);
        if (per == null) {
            System.out.println(STR."\{code} not found!");
        }else {
            list.remove(per);
            System.out.println(STR."\{code} deleted successfully");
        }
    }

    public Personne findPersonId(int id, HashSet<Personne> list) {
        for (Personne pers : list) {
            if (pers.getPersCode() == id) {
                return pers;
            }
        }
        return null;
    }

    public Personne findPersonReturnPerson(int id, HashSet<Personne> list) {
        for (Personne pers : list) {
            if (pers.getPersCode() == id) {
                return pers;
            }
        }
        return null;
    }
}
