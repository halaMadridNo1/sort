package BuilderPattern;

/**
 * Created by ${User} on 2018/9/16
 */
public abstract class ColdDrink implements Item {



    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
