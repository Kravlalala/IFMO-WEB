package Campus;

/**
 * Created by 1 on 31.05.2016.
 */

public class Commandant extends People {

    protected int authority;

    public Commandant() {
        super();
    }

    public Commandant(String name, int room, int money, int authority) {
        super(name, room, money);
        this.authority = authority;
    }

    public void MakeRebuke(Student student) {
        student.decMood(30, 20);
        authority += 30;
        fatigue += 20;
    }

    public void WithdrawCigarettes(Student student) {
        authority += 30;
        fatigue += 50;
        cigarettes += student.giveCigarettes();

    }

    public void PaymentRequire(Student student, int number) {
        authority += 50;
        fatigue += 30;
        money = student.payToCommandant(number);
    }

    public int getAuthority() {
        return authority;
    }
}


