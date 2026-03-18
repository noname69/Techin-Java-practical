
public class HealthStation {

    private int counting;

    public int weigh(Person person) {
        counting += 1;
        return person.getWeight();

    }

    public void feed(Person person) {

        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return counting;
    }

}
