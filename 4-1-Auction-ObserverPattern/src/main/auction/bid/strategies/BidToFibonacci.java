package main.auction.bid.strategies;

// Bid to the closest fibonacci number
public class BidToFibonacci implements BidStrategy {
    @Override
    public double bid(double topBid) {
        int closestFibonacci = findClosestFibonacci(topBid);

        boolean topBidIsFibonacci = closestFibonacci == topBid;

        if (topBidIsFibonacci)
            // top bid is already a fibonacci number
            return 0;

        // bid to the fibonacci number
        return closestFibonacci - topBid;
    }

    // Finds the closest fibonacci number that exceeds the given num
    private int findClosestFibonacci(double num) {
        int fib1 = 0;
        int fib2 = 1;

        while (fib2 < num) {
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
        }

        return fib2;
    }
}
