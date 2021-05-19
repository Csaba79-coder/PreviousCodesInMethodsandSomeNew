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
}