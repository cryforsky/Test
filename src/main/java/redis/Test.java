package redis;

/**
 * @author zhangyongjun
 * @date 2018/5/14
 */

public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 50; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.start();
        }
    }
}
