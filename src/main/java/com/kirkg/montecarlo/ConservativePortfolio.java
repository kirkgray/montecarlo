package com.kirkg.montecarlo;

/**
 * Created by kirkg on 12/3/14.
 */
public class ConservativePortfolio extends Portfolio {

    public static final double CONSERVATIVE_RETURN_PCT = .06189;
    public static final double CONSERVATIVE_RISK = .063438;

    /**
     * Run one simulation over a given number of years
     *
     * @param principal
     * @param years
     * @return
     */
    public double runSim( double principal, int years, double yearlyInflationPct  ) {

        return Simulator.runSim( principal, years, CONSERVATIVE_RETURN_PCT, CONSERVATIVE_RISK, yearlyInflationPct );
    }

}
