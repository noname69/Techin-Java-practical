import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> members;

    public Herd() {
        this.members = new ArrayList<>();
    }

    public void addToHerd(Movable moveble) {
        members.add(moveble);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member: members) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder positions = new StringBuilder();

        for(Movable member: members) {
            positions.append(member.toString()).append("\n");
        }
        
        return positions.toString();
    }
}
