
public class Concatenacion {

    public static void main(String args[]) {
        var alumno = "Lizeth";
        var titulo = "Informático";
        
        var concat = titulo + "" + alumno;
        System.out.println("concat = " + concat);
        
        //Var enteras
        var valor1= 1;
        var valor2= 5;
        System.out.println(valor1 + valor2);
        System.out.println(valor1+valor2+alumno);
        System.out.println(alumno+valor1+valor2);
    }
}
