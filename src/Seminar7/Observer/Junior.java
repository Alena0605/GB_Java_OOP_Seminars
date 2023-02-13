package Seminar7.Observer;

public class Junior implements Observer {
    String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (nameCompany.equals("Google") && salary > 40) {
            System.out.printf("Junior %s: I would like to work with you! (company, salary) = %s, %d\n",
                    name, nameCompany, salary);
        } else {
            System.out.printf("Junior %s: I got another offer. (company, salary) = %s, %d\n",
                    name, nameCompany, salary);
        }
    }
}
