package main.auction.bid.strategies;

// Bid if top bid is even
public class BidIfEven implements BidStrategy {
    @Override
    public double bid(double topBid) {
        int topBidFloored = (int)Math.floor(topBid);
        boolean topBidIsEven = (topBidFloored % 2 == 0);

        if (topBidIsEven)
            return 1;

        return 0;
    }
}
