public class MethodsFunctionsCallingOneAnother {


    public static void main(String[] args) {

        // here you call the whole program!!!
        // no matter how comes the codes and methods bellow! just the questing how you call them here! - 1by1 :)
        // good if methods comes after each other as you are calling them /easier to find/
        // which are connected coming next to / after each other
        // if you call a method you don't need to put it in a variable!
        // just 1 output!!! more input is ok!
        // 1 method is responsible for 1 thing! (printing or giving back a value) - so 1 output or 1 print!!!!
        // but not both it can make trouble! can double print or input ... etc.!


        System.out.println("------0------");

        greetingGyongyi1();
        greetingCsaba1();

        System.out.println("------1------");

        greetingCsaba1();
        greetingGyongyi1();

        System.out.println("------2------");
        // 3 printing line!!!
        greetingGyongyi2(greetingCsaba2());
        greetingCsaba2();

        System.out.println("------3------");

        String text = "Hello X";
        // this one does not prints the text!!!
        greetingGyongyi2(text);
        greetingCsaba2();

        System.out.println("------4------");
        // calling same methods, but have only print line in 1 method :)
        // greetingGyongyi3(); // it has no print, so its an exception! error!! if you call separate
        greetingGyongyi3(greetingCsaba3());

        System.out.println("------5------");
        // last step how it looks nice! one give return statement! the other prints it out :)
        // the print function call the string (the text) the one which was the output of the 2 methods :)
        printGreeting(greetingGyongyi4());
        printGreeting(greetingCsaba4());

        System.out.println("------5------");
        System.out.println(greetingGyongyi5());
        System.out.println(greetingCsaba5());
    }


    public static void greetingGyongyi1() {
        System.out.println("Hello Gyöngyi 1");
    }


    public static void greetingCsaba1() {
        System.out.println("Hello Csaba 1");
    }


    // this one needs a String input!!!
    // in method is input value that can be anther function output!! ... (so be careful with it!)
    // this one give back a text that is a string! and also prints!
    // this one can have a string as an input greetCsaba2 has a string output
    // let's call one by one!

    public static String greetingGyongyi2(String string) {
        String textGyonygi = "Hello Gyöngyi 2";
        System.out.println(textGyonygi);
        return textGyonygi;
    }


    // this one give back a text that is a string! and also prints!
    // so this one give back a string text, and also prints!

    public static String greetingCsaba2() {
        String textCsaba = "Hello Csaba 2";
        System.out.println(textCsaba);
        return textCsaba;
    }


    public static String greetingGyongyi3(String string) {
        String textCsaba = "Hello Csaba 3";
        String textGyonygi = "Hello Gyöngyi 3";
        System.out.println(textCsaba);
        System.out.println(textGyonygi);
        return textGyonygi;
    }


    // this one give back a text that is a string! and also prints!
    // so this one give back a string text, and also prints!

    public static String greetingCsaba3() {
        String textCsaba = "Hello Csaba 3";
        return textCsaba;
    }


    // these are giving back String in return statement!!!
    public static String greetingGyongyi4() {
        String textGyongyi = "Hello Gyöngyi 4";
        return textGyongyi;
    }


    public static String greetingCsaba4() {
        String textCsaba = "Hello Csaba 4";
        return textCsaba;
    }


    // this one has no return, prints only!!! (prints the other two method) one-by-one!
    // intput is String string - so a string goes into, and prints the one, which goes into :)
    public static void printGreeting(String string) {
        System.out.println(string);
    }

    public static String greetingGyongyi5() {
        String textGyongyi = "Hello Gyöngyi 5";
        return textGyongyi;
    }


    public static String greetingCsaba5() {
        String textCsaba = "Hello Csaba 5";
        return textCsaba;
    }
}
