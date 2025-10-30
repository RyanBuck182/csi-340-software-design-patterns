// Ryan Buck
import icecream.DairyQueen;
import icecream.IceCream;

public class LetsEat {
    public static void main(String[] args) {
        DairyQueen dq = new DairyQueen();
        IceCream chocolate = dq.orderCone("Chocolate");
        IceCream strawberry = dq.orderCone("Strawberry");
        chocolate.eat();
        strawberry.eat();
    }
}
