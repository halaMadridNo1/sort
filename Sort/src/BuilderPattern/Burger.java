package BuilderPattern;

/**
 * 创建抽象类提供默认功能
 * Created by ${User} on 2018/9/16
 */
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
