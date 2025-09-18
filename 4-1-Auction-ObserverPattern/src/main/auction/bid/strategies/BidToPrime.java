// Ryan Buck
package main.auction.bid.strategies;

// Bid to the closest prime number
public class BidToPrime implements BidStrategy {
    @Override
    public double bid(double topBid) {
        int closestPrime = findClosestPrime(topBid);

        boolean topBidIsPrime = closestPrime == topBid;

        if (topBidIsPrime)
            // top bid is already a prime number
            return 0;

        // bid to the prime number
        return closestPrime - topBid;
    }

    // Finds the closest prime number that exceeds the given num
    private int findClosestPrime(double num) {
        // Start at the closest odd number that exceeds num
        int candidate = (int)(Math.round(num / 2) * 2) + 1;

        while (!isPrime(candidate))
            candidate += 2;

        return candidate;
    }

    // This function assumes the number is not even
    // This is because findClosestPrime filters all the evens out
    private boolean isPrime(int num) {
        for (int i = 3; i < Math.sqrt(num); i += 2)
            if (num % i == 0)
                return false;

        return true;
    }
}
