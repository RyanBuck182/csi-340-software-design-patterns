// This file was taken from the assignment
// My only contribution was implementing the Subscriber interface

package main.auction.bid;

import main.Subscriber;

import java.io.*;

public class BidLogger implements Subscriber {
    private String fileName;

    public BidLogger() {
        this.fileName = "AuctionLogFile.txt";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void writeData(String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(data);
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(double topBid) {
        writeData("Bid: " + topBid);
    }
}
