import java.io.*;

/**
 * @author xuboming
 * @date 2022/2/14 5:33 下午
 */
public class T006_CustomClassLoad extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        File f = new File("/Users/xuboming/Desktop/workspace/jvm/classload/target/classes",name.concat(".class"));

        try {
            FileInputStream fis = new FileInputStream(f);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b = 0;
            while((b=fis.read()) != -1){
                baos.write(b);
            }
            byte[] bytes = baos.toByteArray();
            baos.close();
            fis.close();
            return super.defineClass(name,bytes,0,bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        T006_CustomClassLoad load = new T006_CustomClassLoad();
        Class clazz = load.findClass("Hello");
        Class clazz1 = load.loadClass("Hello");

        System.out.println(clazz == clazz1);
        System.out.println(clazz.newInstance());
        Hello o = (Hello) clazz.newInstance();

        System.out.println(o);
    }

}
