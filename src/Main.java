import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Lista list = new Lista();
        String dato = "";
        Scanner sc = new Scanner (System.in);
        while (!dato.equalsIgnoreCase("fin")){
            dato = sc.nextLine();
            if (!dato.equalsIgnoreCase("fin"))
                list.insertar(dato);
            }
            list.visualizar();
        }
    }
