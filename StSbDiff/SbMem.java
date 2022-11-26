package StSbDiff;

public class SbMem {
        public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb+" "+System.identityHashCode(sb));
        sb.append(" ");
        System.out.println(sb+" "+System.identityHashCode(sb));
        sb.append("SB!");
        System.out.println(sb+" "+System.identityHashCode(sb));
    }
}
