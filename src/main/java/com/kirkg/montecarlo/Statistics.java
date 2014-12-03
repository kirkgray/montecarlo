package com.kirkg.montecarlo;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * Created by kirkg on 12/3/14.
 */
public class Statistics {

    public static void displaySummary( double[] dataIn, String description ) {

        DescriptiveStatistics aggressiveDescriptiveStats = new DescriptiveStatistics( dataIn );

        System.out.println( "Results for " + description + "\n---------" );
        System.out.println( "10th %: " + aggressiveDescriptiveStats.getPercentile( 10.0 ) );
        System.out.println( "Median: " + aggressiveDescriptiveStats.getPercentile( 50.0 ) );
        System.out.println( "90th %: " + aggressiveDescriptiveStats.getPercentile( 90.0 ) );
        System.out.println( "-----------\n\n" );
    }
}
