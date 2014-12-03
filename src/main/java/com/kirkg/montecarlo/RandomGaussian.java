package com.kirkg.montecarlo;

import java.util.Random;

/**
 * Created by kirkg on 12/3/14.
 *
 * Adapted from http://www.javapractices.com/topic/TopicAction.do?Id=62
 */
public final class RandomGaussian {

    public static void main(String... aArgs){
        RandomGaussian gaussian = new RandomGaussian();
        double MEAN = 100.0f;
        double VARIANCE = 5.0f;
        for (int idx = 1; idx <= 10; ++idx){
            log("Generated : " + gaussian.getGaussian(MEAN, VARIANCE));
        }
    }

    private Random fRandom = new Random();

    public double getRandomDouble( double mean, double var ) {

        return (1 + getGaussian( mean, var ) );
    }

    private double getGaussian(double aMean, double aVariance){
        return aMean + fRandom.nextGaussian() * aVariance;
    }

    private static void log(Object aMsg){
        System.out.println(String.valueOf(aMsg));
    }
}
