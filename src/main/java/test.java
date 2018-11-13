import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangyongjun
 * @date 2018/4/21
 */
public class test {

    public static void main(String[] args) {
        /*OnClickListener onClickListener = a -> System.out.println(a);

        List<String> stringList = new ArrayList<>();
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String a = iterator.next();
            System.out.println(a);
        }*/
        /*Integer a = Integer.valueOf(0);
        System.out.println(a);*/
        List<Byte> byteList = Arrays.asList((byte)1,(byte)2,(byte)3,(byte)4);
        Byte a = 1;
        System.out.println(byteList.contains(a));
    }
}
