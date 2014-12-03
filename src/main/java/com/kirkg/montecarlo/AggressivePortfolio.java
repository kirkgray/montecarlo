package com.kirkg.montecarlo;

import com.sun.tools.internal.ws.processor.model.Port;

/**
 * Created by kirkg on 12/3/14.
 */
public class AggressivePortfolio extends Portfolio {

    private static final double AGGRESSIVE_RETURN_PCT = .094324;
    private static final double AGGRESSIVE_RISK = .15675;

    /**
     * invoke recursive function that runs sims for x years
     *
     * @param principal
     * @param years
     * @return
     */
    public double runSim( double principal, int years, double yearlyInflationPct  ) {

        return Simulator.runSim(principal, years, AGGRESSIVE_RETURN_PCT, AGGRESSIVE_RISK, yearlyInflationPct);
    }
}
