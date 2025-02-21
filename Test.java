import java.util.Scanner;
class calculatrice{
    public int addition (int a,int b){
        return a+b;
    }
    public int soustraction (int a,int b){
        return a-b;
    }
    public int multiplication (int a,int b){
        return a*b;
    }
    public int division (int a,int b){
        try{} 
        catch{}

        return a/b;
    }
}
public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculatrice calculatrice = new calculatrice();

        System.out.println("Bienvenue dans la calculatrice Java!");
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        double resultat;
    }
}