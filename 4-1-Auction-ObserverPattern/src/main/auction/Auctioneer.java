package main.auction;

import main.Publisher;
import main.Subscriber;
import main.auction.bid.Bidder;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer implements Publisher {
    protected Item item;
    protected int remainingBids;
    protected double highestBid;
    protected Bidder highestBidder;
    protected List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public Auctioneer(Item item, int bidLimit) {
        this.item = item;
        this.highestBid = item.value;
        this.remainingBids = bidLimit;
    }

    public Item getItem() {
        return item;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public int getRemainingBids() {
        return remainingBids;
    }

    public void addBid(Bidder bidder, double bidAmount) {
        boolean isValidBidAmount = bidAmount > 0;
        boolean hasBidsLeft = remainingBids > 0;
        boolean isHighestBidder = highestBidder == bidder;

        if (isValidBidAmount && hasBidsLeft && !isHighestBidder) {
            this.highestBidder = bidder;
            this.highestBid += bidAmount;
            this.remainingBids--;
            notifySubscribers();
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(highestBid);
        }
    }
}
