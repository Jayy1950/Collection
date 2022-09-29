import java.util.*;
public class FourthProgram {


    public static void main(String args[]) {
        Employe e1 = new Employe(20, "Shuman", "trainee");
        Employe e2 = new Employe(28, "Radhe", "manager");
        Employe e3 = new Employe(27, "Ashish", "director");
        Employe e4 = new Employe(38, "Akash", "CEO");

        Map<Employe, Integer> map = new LinkedHashMap<>();

        map.put(e1, 150);
        map.put(e2, 2000);
        map.put(e3, 3882);
        map.put(e4, 1855232);
        for (Employe key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

}
