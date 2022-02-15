/**
 * @author xuboming
 * @date 2022/2/13 10:45 下午
 */
public class T004_ParentAndChild {

    public static void main(String[] args) {
        System.out.println(T004_ParentAndChild.class.getClassLoader());
        System.out.println(T004_ParentAndChild.class.getClassLoader().getClass().getClassLoader());
        System.out.println(T004_ParentAndChild.class.getClassLoader().getParent());
        System.out.println(T004_ParentAndChild.class.getClassLoader().getParent().getClass().getClassLoader());
        System.out.println(T004_ParentAndChild.class.getClassLoader().getParent().getParent());




    }
}
