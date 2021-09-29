import model.Fiction;
import model.NonFiction;

public class UseBook {
    public static void main(String[] args) {

        Fiction fiction1=new Fiction("seda");
        NonFiction nonFiction1=new NonFiction("math");
        System.out.println(fiction1.toString());
        System.out.println(nonFiction1.toString());
    }

}
