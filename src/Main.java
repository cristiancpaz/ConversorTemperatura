import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         *Conversor de temperaturas
         * POO: Herança
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite temperatura celsius: ");
        double tempC = sc.nextDouble();

        sc.close();
        CelsiusKelvin ck = new CelsiusKelvin();
        System.out.println("ck: "+ ck);
        double tempK = ck.converter(tempC);
        System.out.println("tempK= "+ tempK+ "k");
        KelvinCelsius kc = new KelvinCelsius();
        System.out.println("kc: "+kc);
        tempC = kc.converter(tempK);
        System.out.println("tempC= "+tempC+ "C");



    }
}