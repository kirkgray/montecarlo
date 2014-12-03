package com.kirkg.montecarlo;

/**
 * Created by kirkg on 12/3/14.
 */
public abstract class Portfolio {

    protected double yearlyInflationPct;

    public Portfolio() {
        this.yearlyInflationPct = yearlyInflationPct;
    }

    public double[] runMonteCarlo( int numOfRuns, double initialInvestment, int timelineYears, double yearlyInflationPct ) {

        double[] results = new double[numOfRuns];

        for( int i = 0; i < numOfRuns; i++ )
            results[i] = runSim( initialInvestment, timelineYears, yearlyInflationPct );

        return results;
    }

    public abstract double runSim( double principal, int years, double yearlyInflationPct  );
}
