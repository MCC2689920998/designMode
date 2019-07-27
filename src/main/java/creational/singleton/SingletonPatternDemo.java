package creational.singleton;

/**
 * @Author MCC
 * @Create 2019/7/27 15:25
 */
public class SingletonPatternDemo {

    /**
     * 一般情况下，不建议使用第1种{@link LazySingleObject#getInstance1()}
     * 和第2种{@link LazySingleObject#getInstance2()}懒汉方式，
     * 建议使用第3种{@link HungrySingleObject#getInstance3()}饿汉方式。
     * 只有在要明确实现 lazy loading 效果时，才会使用第5种{@link LazySingleObject#getInstance5()}登记方式。
     * 如果涉及到反序列化创建对象时，可以尝试使用第6种{@link EnumSingleton#getInstance6()}枚举方式。
     * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式{@link LazySingleObject#getInstance4()}
     *
     * @param args
     */
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //显示消息
        object.showMessage();
    }
}
