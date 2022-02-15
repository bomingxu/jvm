/**
 * @author xuboming
 * @date 2022/2/13 10:45 下午
 */
public class T005_ClassLoadByHand {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = T005_ClassLoadByHand.class.getClassLoader().loadClass("T001_ClassLoadLevel");
        System.out.println(clazz.getName());

        //通过classLoad加在资源文件
//        T005_ClassLoadByHand.class.getClassLoader().getResourceAsStream("");

    }
}
