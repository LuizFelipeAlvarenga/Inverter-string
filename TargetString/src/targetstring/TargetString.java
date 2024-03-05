package targetstring;

import java.util.Scanner;

public class TargetString {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Inverter inverter = new Inverter();
        
        System.out.println("Digite uma palavra: ");
            String palavra = tcl.nextLine();
        
        String inv = inverter.inverter(palavra);
        System.out.println("palava invertida: " + inv);
    }
    
}
