/**
 * Created by 1 on 31.05.2016.
 */

import Campus.People;
import Campus.Commandant;
import Campus.Neighbor;
import Campus.Student;

public class CampusMain {
    public static void main(String args[]) {
        Commandant commandant = new Commandant("Nat", 211, 1000, 100);
        Student student = new Student("Ilya", 201, 3500);
        Neighbor VTshnik = new Neighbor("Mikhailov", 201, 4500);
        commandant.PaymentRequire(student, 3400);
        System.out.println("Authority= " + commandant.getAuthority());
        System.out.println("Student money= " + student.getMoney());
        System.out.println("Com money= " + commandant.getMoney());
        student.goShopping();
        VTshnik.toLend(student, 300);
        System.out.println("Neighbor money= " + VTshnik.getMoney());
        System.out.println("Student money= " + student.getMoney());
        System.out.println("Student Cigarettes= " + student.getCigarettes());
        System.out.println("Neighbour's Karma= " + VTshnik.getKarma());
        student.goSmoking();
        commandant.WithdrawCigarettes(student);
        System.out.println("Authority= " + commandant.getAuthority());
        System.out.println("Com's cigarettes= " + commandant.getCigarettes());
        System.out.println("Student's fatigue= " + student.getFatigue());
        System.out.println("Student's bamboleo= " + student.getBamboleo());
        System.out.println("Student's cigarettes= " + student.getCigarettes());
    }

}


