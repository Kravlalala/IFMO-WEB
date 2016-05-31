package Campus;

/**
 * Created by 1 on 31.05.2016.
 */

public class Student extends People {

    protected int bamboleo;

    public Student() {
        super();
    }

    public Student(String name, int room, int money) {
        super(name, room, money);
    }

    public void decMood(int fatique_dec, int bamboleo_inc) {
        fatigue -= fatique_dec;
        bamboleo_inc += bamboleo_inc;
    }

    public void goShopping() {
        money -= 100;
        cigarettes += 20;
        fatigue += 15;
    }

    public void goSmoking() {
        cigarettes--;
        bamboleo -= 20;
    }

    public void goStudying() {
        fatigue += 30;
        bamboleo += 30;
    }

    public int payToCommandant(int money) {
        this.money -= money;
        bamboleo += 10;
        return money;
    }

    public int giveCigarettes() {
        int number = cigarettes;
        cigarettes = 0;
        return number;
    }

    public void goSleep() {
        fatigue -= 100;
        bamboleo -= 80;
    }

    public int getBamboleo() {
        return bamboleo;
    }
}


