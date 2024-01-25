import pw.skills;
public class ousidepwskills {
    public static void main(String[] args) {
        skills obj = new skills();
        System.out.println("outside pws kilss "+ obj.str_1);
        skill2 obj3 = new skill2();
        obj3.printfromchleclass();
    }
}

//child class // parent
 class skill2 extends skills{
    void printfromchleclass(){
        skill2 obj3 = new skill2();
        System.out.println("chile class  print  "+obj3.str_1);
    }

}