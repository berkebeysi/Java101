package StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3,int p1,int p2,int p3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.c1.project=p1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.c2.project=p2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.project=p3;
        }
    }

    void isPass() {
        System.out.println("==============");
        double a = 0.8 * this.c1.note + 0.2 * this.c1.project;
        double b = 0.8 * this.c2.note + 0.2 * this.c2.project;
        double c = 0.8 * this.c3.note + 0.2 * this.c3.project;
        this.avarage = (a + b + c) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + " Notu : " + c1.note);
        System.out.println(c2.name + " Notu : " + c2.note);
        System.out.println(c3.name + " Notu : " + c3.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
