import com.André.demo.Student;
import com.sun.security.jgss.GSSUtil;

public class Main {
    // Instansiering - skapandet av ett objekt från en klass
    // Konstruktor - en metod med samma namn som klassen
    // Static - enbart en referens
    // punkt (.) = går in i datan

    // Package - strukturerar upp projektet med olika filer såsom klassen

    public static void main(String[] args) {
        // instantiate object
        Student benny = new Student("Benny ",15,true);
        Student frida = new Student("Frida ",22, false);


        System.out.println(benny.name + benny.age);
        if (benny.isTired){
            System.out.println("Dang, i'm tired bruh");
        }
        System.out.println(frida.name + frida.age);

        if (frida.isTired){
            System.out.println("Dang, I'm tired bruh");
        } else {
            System.out.println("Dang, I'm not tired bruh");
        }



        int sum = 0;
        int sum2 = 0;

        sum = addition(15,15); // this return
        System.out.println(sum);

        //sum2 = addition2(15,15); // this does not return

        addition2(15, 15);

        /* How to create a method
         *  #1 visibility modifier, public, protected, no mod, private
         *  #2 static, exclude if not needed
         *  #3 datatype to return, send data. if nothing == void
         *  #4 name - camelcase (addTwoNumbers) - followed by () {}*/



    }

    // Return - kan arbeta vidare / skicka vidare
    static int addition( int x, int y) {
        return x+y;

    }

    // void - kan ej arbetas vidare / visas bara upp
    public static void addition2(int x, int y) {
        System.out.println(x + y);

    }




}