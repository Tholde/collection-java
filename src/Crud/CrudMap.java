package Crud;

import Personne.Personne;

import java.util.*;

public class CrudMap {
    public void createPerson(HashMap<Integer, Personne> map, Personne pers) {
        map.put(pers.getPersCode(), pers);
    }

    public HashMap<Integer, Personne> sortedPersonne(HashMap<Integer, Personne> map) {
        List<Integer> sorted = new ArrayList<>();
        for (Map.Entry<Integer, Personne> entry : map.entrySet()) {
            sorted.add(entry.getKey());
        }
        Collections.sort(sorted);
        HashMap<Integer, Personne> sortedPers = new HashMap<>();
        for (Integer personId : sorted) {
            Personne person = map.get(personId);
            sortedPers.put(personId, person);
        }

        return sortedPers;
    }

    public void readPerson(HashMap<Integer, Personne> map) {
        if (map.isEmpty()) {
            System.out.println("There are not person in the map!");
        } else {
            HashMap<Integer, Personne> sortedPers = sortedPersonne(map);

            System.out.println("-------------------------");
            for (Personne pers : sortedPers.values()) {
                System.out.println(pers.toString());
                System.out.println("-------------------------");
            }
        }
    }

    public void readOnePerson(HashMap<Integer, Personne> map, int id) {
        Personne pers = findPersonReturnPerson(id, map);
        if (pers == null) {
            System.out.println(STR."\{id} not found.");
        } else {
            System.out.println("--------------------------");
            System.out.println(pers.toString());
            System.out.println("--------------------------");
        }
    }

    public void updatePerson(HashMap<Integer, Personne> map, int code, Personne pers) {
        if (map.containsKey(code)) {
            Personne personneToUpdate = map.get(code);
            personneToUpdate.setName(pers.getName());
            personneToUpdate.setAge(pers.getAge());
            map.put(code, personneToUpdate);
            System.out.println(STR."\{code} updated successfully");
        } else {
            System.out.println(STR."\{code} not found.");
        }
    }

    public void deletePerson(HashMap<Integer, Personne> map, int code) {
        if (map.containsKey(code)) {
            map.remove(code);
            System.out.println(STR."\{code} deleted successfully");
        } else {
            System.out.println(STR."\{code} not found.");
        }
    }

    public Personne findPersonReturnPerson(int id, HashMap<Integer, Personne> map) {
        return map.getOrDefault(id, null);
    }
}
