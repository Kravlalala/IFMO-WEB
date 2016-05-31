package Campus;

/**
 * Created by 1 on 31.05.2016.
 */
public class People {
    protected String name;
    protected int money;
    protected int fatigue;
    protected int room_number;
    protected int cigarettes;

    public People() {
        name = " ";
        money = 0;
        fatigue = 0;
        room_number = 0;
        cigarettes = 0;
    }

    public People(String name, int room, int money) {
        this.name = name;
        room_number = room_number;
        this.money = money;
    }

    public void addMoney(int number) {
        fatigue += 100;
        money += number;
    }

    public String getName() {
        return name;
    }

    public int getCigarettes() {
        return cigarettes;
    }

    public int getMoney() {
        return money;
    }

    public int getRoom() {
        return room_number;
    }

    public int getFatigue() {
        return fatigue;
    }

}

