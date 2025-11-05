// Ryan Buck
/*
* Validate Master card number
*/
package creditcard;

public class MasterCard extends CreditCard {
    // constructor
    public MasterCard(String num, int expMonth, int expYear) {
        super(num, expMonth, expYear);
    }

    @Override
    public boolean isNumOfDigitsValid() {
        if (cardNum.length() == 16) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isValidPrefix() {
        String prefix = cardNum.substring(0, 1);
        String nextChar = cardNum.substring(1, 2);
        String validChars = "12345";
        // 51-55
        if ((prefix.equals("5")) && (validChars.indexOf(nextChar) >= 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAccountInGoodStand() {

        // Make necessary Master CARD API calls to
        System.out.println("This MasterCard is in good standing");

        return true;
    }
}
