import java.io.File;

public class FirstJavaFile {

    public static void main(String[] args) {

        loopExamples();


        int age = 8;


        /*if (true) {
            String name = "Muhammad";
            System.out.println(name);
        } else {
        }*/

    }

    public static void printFunctionForMySelf() {
        //System.out.println(age);
    }

    public static void loopExamples() {
        String[] names = {"Asma", "Mohammed", "Alameen", "Said", "Abdullah"};
        for (int i = 0; i < 5; ++i) {

            System.out.println("Hi"+ " " + names[i]);
        }

        int i = 0 ;
        while (i < names.length ){

            System.out.println("Hi"+" " + names[i]);
            i++;

        }
    }

    /*
     * int i = 0
     * check condition -> i < 51
     * run code inside brackets
     * increament -> i++
     *
     * check condition -> 50 < 51
     * run code inside brackets
     * increament -> i++
     *
     * */
}
