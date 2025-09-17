package main.auction.bid.strategies;

// Bid if integer part of top bid is odd
public class BidIfOdd implements BidStrategy {
    @Override
    public double bid(double topBid) {
        int topBidFloored = (int)Math.floor(topBid);
        boolean topBidIsOdd = (topBidFloored % 2 == 1);

        if (topBidIsOdd)
            return 1;

        return 0;
    }
}
