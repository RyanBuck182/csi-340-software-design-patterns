// Ryan Buck
package main.auction.bid.strategies;

// Make the top bid a round number
public class BidToRound implements BidStrategy {
    @Override
    public double bid(double topBid) {
        int topBidFloored = (int)Math.floor(topBid);
        boolean topBidIsNotRound = topBidFloored != topBid;

        if (topBidIsNotRound) {
            // bid the amount to make top bid a round number
            return topBidFloored + 1 - topBid;
        }

        // if top bid is a round number already, don't bid
        return 0;
    }
}
