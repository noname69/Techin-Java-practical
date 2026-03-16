package online.nonamelab;


public class Main {
    static void main() {
        Employee em1 = new Employee(1, "Pavel", "Stefanovic", 1000);

        System.out.println(em1.toString());

        Account a1 = new Account("0000", "account 1", 1000);
        Account a2 = new Account("0001", "account 2");

        System.out.println(a2.getName());
        System.out.println(a2.getBalance());
        a1.transferTo(a2, 1000);
        System.out.println(a2.getBalance());
        System.out.println(a1.debit(1000));

        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}

