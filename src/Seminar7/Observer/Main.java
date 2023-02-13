package Seminar7.Observer;

public class Main {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();

        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);

        Student petrov = new Student("Petrov");
        Junior sidorov = new Junior("Sidorov");
        Master ivanov = new Master("Ivanov");

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);

        for (int i = 0; i < 2; i++) {
            google.needEmployee();
            System.out.println("================================================================================");
            geekBrains.needEmployee();
            System.out.println("================================================================================");
            System.out.println();
        }
    }
}
