import java.util.Scanner;

public class NombreApellidosEdad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre=sc.nextLine();

        System.out.println("Dime tu apellido");
        String apellido=sc.nextLine();

        System.out.println("¿En que año naciste?");
        int agnoDeNacimiento=sc.nextInt();
        
        int edad=2020-agnoDeNacimiento;

        System.out.println("Hola "+ nombre+" "+apellido+", tienes "+edad+" años");


    }
}
