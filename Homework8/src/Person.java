class Company {
    String name;

    public String getcName() {
        return name;
    }

    public void setcName(String name) {
        this.name = name;
    }

}

class Person extends Company {
    String name;
    double balance;

    public static void main(String[] args) {

        Person a = new Person();
        a.setName("Aram");
        a.setBalance(175.6);
        a.setcName("A");

        Person b = new Person();
        b.setName("Babken");
        b.setBalance(505.4);
        b.setcName("A");


        Person c = new Person();
        c.setName("Carl");
        c.setBalance(665.7);
        c.setcName("A");


        Person d = new Person();
        d.setName("David");
        d.setBalance(455.4);
        d.setcName("B");


        Person e = new Person();
        e.setName("Erik");
        e.setBalance(515.64);
        e.setcName("B");


        Person f = new Person();
        f.setName("Felo");
        f.setBalance(151.1);
        f.setcName("B");


        //d.sendMoney(a,56.5);
        //b.sendMoney(d,56.2);


        Person[] A = {a, b, c};
        Person[] B = {d, e, f};

        for (int i = 0; i < 3; i++) {
            System.out.println("person = " + A[i].getName() + "  balace = " + A[i].getBalance() + "  Company = " + A[i].getcName());
            System.out.println("person = " + B[i].getName() + "  balace = " + B[i].getBalance() + "  Company = " + B[i].getcName());

        }

        Person richA = new Person();
        Person richB = new Person();
        for (int i = 0; i < 2; i++) {
            if (A[i].getBalance() >= A[i + 1].getBalance()) {
                richA = A[i];
            } else richA = A[i + 1];
            if (B[i].getBalance() >= B[i + 1].getBalance()) {
                richB = B[i];
            } else richB = B[i + 1];
        }
        if (richA.getBalance() >= richB.getBalance()) {
            System.out.println("Rich is " + richA.getName());
        } else System.out.println("Rich is " + richB.getName());


        System.out.println("Most valuable company is <" + getMostValuable(A, B) + ">");
    }


    public static String getMostValuable(Person[] array, Person[] array1) {
        double sum = 0, sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + array[i].getBalance();
            sum1 = sum1 + array1[i].getBalance();
        }
        if (sum >= sum1) {
            return array[0].getcName();
        } else
            return array1[0].getcName();
    }

    void sendMoney(Person otherPerson, double amount) {
        this.setBalance(this.getBalance() - amount);
        otherPerson.setBalance(otherPerson.getBalance() + amount);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}