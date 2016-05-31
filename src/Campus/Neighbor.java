package Campus;

/**
 * Created by 1 on 31.05.2016.
 */
public class Neighbor extends Student {
    private int karma;
    public Neighbor(){
        super();
    }
    public Neighbor(String name, int room, int money){
        super(name,room,money);
    }
    public void toLend(Student student, int number){
        karma++;
        money-=number;
        student.addMoney(number);
    }
    public int getKarma(){
        return  karma;
    }
}

