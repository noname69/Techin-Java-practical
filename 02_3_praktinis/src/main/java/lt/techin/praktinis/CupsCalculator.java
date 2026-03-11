package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int fullBoxes;
        int restOfCups;

        fullBoxes = numberOfCups / 3;
        restOfCups = numberOfCups % 3;

        System.out.println("Dėžių: " + fullBoxes);
        System.out.println("Liko puodelių: " + restOfCups);
    }
}
