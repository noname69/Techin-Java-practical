import java.util.ArrayList;
import java.util.List;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if(isEmpty()) return null;

        Person shortest = persons.get(0);

        for (Person p : persons) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
            }
        }

        return shortest;
    }

    public Person take() {
        if(isEmpty()) return null;
        Person shortest = shortest();
        persons.remove(shortest);
        return shortest;
    }
}
