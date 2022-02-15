/**
 * @author xuboming
 * @date 2022/2/13 10:45 下午
 */
public class T003_ClassLoadScope {

    public static void main(String[] args) {
        String bootPath = System.getProperty("sun.boot.class.path");
        System.out.println(bootPath.replaceAll(":",System.lineSeparator()));

        System.out.println("--------------------------------");
        String extPath = System.getProperty("java.ext.dirs");
        System.out.println(extPath.replaceAll(":",System.lineSeparator()));

        System.out.println("--------------------------------");
        String appPath = System.getProperty("java.class.path");
        System.out.println(appPath.replaceAll(":",System.lineSeparator()));
    }
}
