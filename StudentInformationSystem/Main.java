package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Berke Hoca", "TRH", "4");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "5");
        Teacher t3 = new Teacher("Mesut Hoca", "MAT", "6");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course matematik = new Course("Matematik", "103", "MAT");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        matematik.addTeacher(t3);

        Student s1 = new Student("Ali", "4", "4", tarih, fizik, matematik);
        s1.addBulkExamNote(100,50,20,20,15,30);
        s1.isPass();

        Student s2 = new Student("Mehmet", "5", "4", tarih, fizik, matematik);
        s2.addBulkExamNote(35,53,30,100,100,100);
        s2.isPass();

        Student s3 = new Student("Cevdet", "6", "4", tarih, fizik, matematik);
        s3.addBulkExamNote(50,50,50,100,100,100);
        s3.isPass();
    }
}
