import java.util.*;
public class NumberList {
    public static void main(String[] args){
        ArrayList<Float> ls=new ArrayList();
        Scanner sc= new Scanner(System.in);
        Float a;
        Float sum=0.0f;
        for(int i=0;i<5;i++) {
            System.out.print("Enter the Element : ");
            a = sc.nextFloat();
            ls.add(a);
        }
        for(Float f :ls){
            sum=sum+f;

        }
        System.out.println(" sum of the numbers in List : "+sum);
    }
}