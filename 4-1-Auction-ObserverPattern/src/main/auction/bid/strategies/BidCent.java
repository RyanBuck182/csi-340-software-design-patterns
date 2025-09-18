// Ryan Buck
package main.auction.bid.strategies;

// Always bid one cent.
public class BidCent implements BidStrategy {
    @Override
    public double bid(double topBid) {
        return 0.01;
    }
}
