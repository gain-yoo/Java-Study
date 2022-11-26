package StSbDiff;

public class StMem {
    public static void main(String[] args){
        String st = new String("Hi");
        System.out.println(st+" "+System.identityHashCode(st));
        st += " ";
        System.out.println(st+" "+System.identityHashCode(st));
        st += "ST!";
        System.out.println(st+" "+System.identityHashCode(st));
    }
}
