// Ryan Buck
package icecream;

public class DairyQueen extends IceCreamShop {

    public IceCream getIceCream(String type) {
        return switch (type) {
            case "Chocolate" -> new Chocolate();
            case "Strawberry" -> new Strawberry();
            case "Vanilla" -> new Vanilla();
            default -> null;
        };
    }

}
