package BoxingMatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (this.dodge >= 0 && this.dodge <= 100) {
            this.dodge = dodge;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar Vurdu.");
        if (foe.isDodge()) {
            System.out.println("------------");
            System.out.println(foe.name + " gelen hasarı blokladı");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
