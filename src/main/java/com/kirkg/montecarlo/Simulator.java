package com.kirkg.montecarlo;

/**
 * Created by kirkg on 12/3/14.
 */
public class Simulator {

    public static RandomGaussian randomGaussian = new RandomGaussian();

    public static double runSim( double principal, int years, double expReturn, double riskVar, double expInflation ) {

        Double val;

        if( years == 0 ) {
            return principal;
        }
        else {
            years--;

            double preInfValue = principal * randomGaussian.getRandomDouble(expReturn, riskVar);
            double postInfValue = adjustForInflation(preInfValue, expInflation);

            val = runSim(postInfValue, years, expReturn, riskVar, expInflation);

            return val;
        }
    }

    public static double adjustForInflation( double prin, double inflationPct ) {

        return prin / (1 + inflationPct);
    }
}
