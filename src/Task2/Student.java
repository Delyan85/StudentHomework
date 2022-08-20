package Task2;

public class Student {

    String name;
    String subject;
    double grade;
    int yearInCollage;
    int age;
    boolean isDegree;
    double money;

    Student() {
        this.grade = 4.0;
        this.yearInCollage = 1;
        this.isDegree = false;
        this.money = 0;
        this.age = 36;
    }

    Student(int ageParam, String nameParam, String subjectParam) {
        this();
        this.name = nameParam;
        this.age = ageParam;
        this.subject = subjectParam;
    }

    void upYear() {
        if (isDegree) {
            System.out.println("The student has already graduated");
            return;
        }
        yearInCollage++;
        if (yearInCollage == 4) {
            isDegree = true;
        }
    }

    double sumDoubleNumbers(double numOne, double numTwo) {
        double sum = numOne + numTwo;
        return sum;
    }

    double receiveSchollarship(double min, double amount) {
        if (min <= grade && age < 30) {
            this.money = this.money + amount;
        }
        return this.money;
    }

}
