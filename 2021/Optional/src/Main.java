import java.nio.charset.IllegalCharsetNameException;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Optional<Object> o = Optional.ofNullable("yep");
//        Optional<String> o2 = Optional.empty();
////        System.out.println(o.isPresent());
//        System.out.println(o.isEmpty());
//        System.out.println(o2.isEmpty());
//
////        System.out.println(o2.isPresent());
//        String result=o2.orElse("kanan");
//        System.out.println(result);
//        String s="";
//        System.out.println(s.isEmpty());
//        Car c=new Car();
//        BWM b=new BWM();
        String c="";
        String b=null;
        System.out.println(Objects.equals(c,b));
        System.out.println(c.equals(b));


    }

    public static void foo() {
//        throw new IllegalStateException("foo is called");
        throw new IllegalArgumentException("foo is called 2");
    }
}
