package Task2;

public class StudentDemo {
    public static void main(String[] args) {
        Student Delyan = new Student(36, "Delyan", "Automation");
        System.out.println(Delyan.sumDoubleNumbers(1.5, 2.5));
        System.out.println(Delyan.yearInCollage);
        Delyan.upYear();
        System.out.println(Delyan.yearInCollage);
        System.out.println(Delyan.isDegree);
        Delyan.upYear();
        System.out.println(Delyan.yearInCollage);
        System.out.println(Delyan.isDegree);
        Delyan.upYear();
        System.out.println(Delyan.yearInCollage);
        System.out.println(Delyan.isDegree);

        Delyan.receiveSchollarship(4, 150);
        System.out.println(Delyan.money);

    }
}
