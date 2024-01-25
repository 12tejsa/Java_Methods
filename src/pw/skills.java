package pw;

public class skills {
    public String str_1 = "I am a public member";

    void printfrontClass(){
        System.out.println("within class 01"+str_1);

    }
    public static void main(String[] args) {

        skills obj = new skills();
        obj.printfrontClass();
        System.out.println("within class 1"+obj.str_1);
        skills1 obj2 = new skills1();
        obj2.printfromoutsideclass();


    }
}

class skills1{
    void printfromoutsideclass(){
        skills obj = new skills();
        System.out.println("Within package,outside class: "+obj.str_1);
    }

}