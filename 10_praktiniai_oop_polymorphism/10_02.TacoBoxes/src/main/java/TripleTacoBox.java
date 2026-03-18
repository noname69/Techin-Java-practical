public class TripleTacoBox implements TacoBox {
    private int remindTacos;

    public TripleTacoBox() {
        this.remindTacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return remindTacos;
    }

    @Override
    public void eat() {
        if(remindTacos != 0) {
            remindTacos--;
        }
    }
}
