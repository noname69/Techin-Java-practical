public class CustomTacoBox implements TacoBox {
    private int remindTacos;
    public CustomTacoBox(int tacos) {
        this.remindTacos = tacos;
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
