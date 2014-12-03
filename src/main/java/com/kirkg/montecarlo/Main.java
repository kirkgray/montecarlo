package com.kirkg.montecarlo;

/**
 * Created by kirkg on 12/3/14.
 */
public class Main {

    public static double initialInvestment = 100000;
    public static double yearlyInflationPct = .035;
    public static Integer simulationCount =  10000;
    public static Integer timelineYears = 20;

    public static void main( String[] args ) {

        ConservativePortfolio cp = new ConservativePortfolio();
        double[] consResults = cp.runMonteCarlo( simulationCount, initialInvestment, timelineYears, yearlyInflationPct );

        Statistics.displaySummary( consResults, "Results for 10,000 count sim for Conservative Portfolio, using 3.5% inflation, $100,000 initial investment");

        AggressivePortfolio ap = new AggressivePortfolio();
        double[] aggrResults = ap.runMonteCarlo( simulationCount, initialInvestment, timelineYears, yearlyInflationPct );

        Statistics.displaySummary( aggrResults, "Results for 10,000 count sim for Aggressive Portfolio, using 3.5% inflation, $100,000 initial investment");

    }

}
