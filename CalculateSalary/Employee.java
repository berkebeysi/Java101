package CalculateSalary;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary(){
        int year=2021;
        if(year-this.hireYear<10){
            return this.salary*0.05;
        }
        else if(year-this.hireYear>9&&year-this.hireYear<20){
            return this.salary*0.10;
        }
        else{
            return this.salary*0.15;
        }
    }

    void toString2(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+(raiseSalary()));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş : "+(this.salary+bonus()+raiseSalary()-tax()));
    }
}
