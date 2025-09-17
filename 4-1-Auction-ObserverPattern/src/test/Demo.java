package test;

import main.auction.Auctioneer;
import main.auction.Item;
import main.auction.bid.BidLogger;
import main.auction.bid.Bidder;
import main.auction.bid.strategies.*;

import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        List<Bidder> bidders = List.of(
            new Bidder(new BidCent()),
            new Bidder(new BidIfEven()),
            new Bidder(new BidIfOdd()),
            new Bidder(new BidToFibonacci()),
            new Bidder(new BidToPrime()),
            new Bidder(new BidToRound())
        );
        BidLogger logger = new BidLogger();

        Item item = new Item(762.36, "Used Honda Civic 2005");
        Auctioneer auctioneer = new Auctioneer(item, 12);

        // Subscribe bidders to the auction
        for (Bidder bidder : bidders) {
            auctioneer.addSubscriber(bidder);
        }
        auctioneer.addSubscriber(logger);
        auctioneer.notifySubscribers();

        // Start auction
        System.out.println("Auction begins!");
        System.out.printf("Item: %s\nPrice: %.2f\n\n", item.name, item.value);
        Random rand = new Random();

        // Pick a random bidder until there are no bids remaining.
        while (auctioneer.getRemainingBids() > 0) {
            int bidderIndex = rand.nextInt(bidders.size());
            Bidder bidder = bidders.get(bidderIndex);
            double bidAmount = bidder.bid();
            if (bidAmount > 0) {
                auctioneer.addBid(bidder, bidAmount);
                System.out.printf("Bidder %d bid %.2f\n", bidderIndex, bidAmount);
                System.out.printf("Current price is now %.2f\n", auctioneer.getHighestBid());
                System.out.printf("%d bid(s) remaining\n\n", auctioneer.getRemainingBids());
            }
        }

        System.out.println("Auction complete!");
        System.out.printf("Sold to bidder %d for %.2f",
                bidders.indexOf(auctioneer.getHighestBidder()),
                auctioneer.getHighestBid());

        // Unsubscribe bidders from the auction
        for (Bidder bidder : bidders) {
            auctioneer.removeSubscriber(bidder);
        }
        auctioneer.removeSubscriber(logger);
    }
}
