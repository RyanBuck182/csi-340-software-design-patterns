package main.auction.bid;

import main.Subscriber;
import main.auction.bid.strategies.BidStrategy;

public class Bidder implements Subscriber {
    protected BidStrategy bidStrategy;
    protected double topBid;

    public Bidder(BidStrategy bidStrategy) {
        this.bidStrategy = bidStrategy;
    }

    public void setBidStrategy(BidStrategy bidStrategy) {
        this.bidStrategy = bidStrategy;
    }

    public double bid() {
        return this.bidStrategy.bid(topBid);
    }

    public void update(double topBid) {
        this.topBid = topBid;
    }
}
