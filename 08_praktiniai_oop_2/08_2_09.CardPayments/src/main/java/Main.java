
public class Main {

    public static void main(String[] args) {
//        PaymentCard petesCard = new PaymentCard(7);
//
//        System.out.println("money " + petesCard.balance());
//        boolean wasSuccess = petesCard.takeMoney(8);
//        System.out.println("successfully withdraw: " + wasSuccess);
//        System.out.println("money " + petesCard.balance());
//
//        wasSuccess = petesCard.takeMoney(4);
//        System.out.println("successfully withdraw: " + wasSuccess);
//        System.out.println("money " + petesCard.balance());


        PaymentTerminal unicafeExactum = new PaymentTerminal();

//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remain change " + change);

        PaymentCard annesCard = new PaymentCard(7);

//        boolean wasSuccess = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccess);
//        wasSuccess = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccess);
//        wasSuccess = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("there was enough money: " + wasSuccess);
        unicafeExactum.addMoneyToCard(annesCard, 10);
        unicafeExactum.addMoneyToCard(annesCard, 1000);
        System.out.println(annesCard.balance());
//
//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remain change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remain change " + change);
//
        System.out.println(unicafeExactum);
    }
}

