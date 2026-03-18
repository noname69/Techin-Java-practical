
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(euros + addition.euros(), cents + addition.cents());
    }

    public Money minus(Money decreaser) {
        int eu = euros - decreaser.euros();
        int ct = cents - decreaser.cents();

        if (ct < 0) {
            eu--;
            ct += 100;
        }

        if (eu < 0) {
            return new Money(0, 0);
        }

        return new Money(eu, ct);
    }

    public boolean lessThan(Money compared) {
        if (this.euros != compared.euros()) {
            return this.euros < compared.euros();
        }
        return this.cents < compared.cents();
    }

}
