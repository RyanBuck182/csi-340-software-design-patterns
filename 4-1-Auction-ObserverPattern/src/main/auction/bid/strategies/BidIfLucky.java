package main.auction.bid.strategies;

// Bid if top bid contains the digit 7
public class BidIfLucky implements BidStrategy {
    @Override
    public double bid(double topBid) {
        boolean topBidContainsSeven = Double.toString(topBid).contains("7");

        if (topBidContainsSeven)
            return 7;

        return 0;
    }
}
