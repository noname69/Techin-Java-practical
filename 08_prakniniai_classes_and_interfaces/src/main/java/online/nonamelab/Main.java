package online.nonamelab;


public class Main {
    static void main() {
        Employee em1 = new Employee(1, "Pavel", "St", 1000);
        Employee em2 = new Employee(2, "Jonas", "Jonaitis", 1000);

        System.out.println();
        System.out.println("EMPLOYEE CLASS");
        System.out.println("_".repeat(50));
        System.out.println("Before");
        System.out.println("_".repeat(50));

        System.out.println(em1);
        System.out.println(em2);

//        em1.setSalary(2000);
//        em2.setSalary(10);

        em1.raiseSalary(100);
        em2.raiseSalary(100);

        System.out.println("_".repeat(50));
        System.out.println("After");
        System.out.println("_".repeat(50));

        System.out.println(em1);
        System.out.println(em2);

        System.out.println();
        System.out.println("ACCOUNT CLASS");

        Account a1 = new Account("0000", "account 1", 1000);
        Account a2 = new Account("0001", "account 2");

        System.out.println("_".repeat(50));
        System.out.println("Before");
        System.out.println("_".repeat(50));

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.getName() + " Put to acount: " + a1.credit(1000));

        System.out.println(a2.getName() + " Balance:" + a2.getBalance());
        System.out.println(a1.getName() + " transfering to " + a2.getName());
        a1.transferTo(a2, 1000);

        System.out.println(a2.getName() + " Balance: " + a2.getBalance());
        System.out.println(a1.debit(1000));

        System.out.println("After");
        System.out.println("_".repeat(50));
        System.out.println("_".repeat(50));

        System.out.println(a1);
        System.out.println(a2);

        Rectangle r = new Rectangle(10,20);

        System.out.println(r);

        Time t = new Time(23,59,59);
        System.out.println(t);
        t.nextSecond();
//        System.out.println(newTime);


    }
}

