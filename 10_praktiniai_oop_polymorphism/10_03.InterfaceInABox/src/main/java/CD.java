public class CD implements Packable {
    private final String artist;
    private final String name;
    private final int pubYear;
    private final double weigth;

    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weigth = 0.1;
    }

    @Override
    public double weight() {
        return weigth;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + pubYear + ")";
    }
}
