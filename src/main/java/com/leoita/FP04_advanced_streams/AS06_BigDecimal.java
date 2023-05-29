package com.leoita.FP04_advanced_streams;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class AS06_BigDecimal {
    public static void main(String[] args) {

        //Using DoubleStream
        System.out.println("#############DoubleStream#############");
        System.out.println("double max value: " + Double.MAX_VALUE);
        double oneThirdDouble = 1d / 3;
        System.out.println("PI value using Double: " + oneThirdDouble);

        //Using BigDecimal
        System.out.println("#############BigDecimal#############");
        /* MathContext.DECIMAL32, MathContext.DECIMAL64, MathContext.DECIMAL128 have all rounding mode of HALF_EVEN*/
        BigDecimal oneThirdBigDecimal7digits = BigDecimal.ONE.divide(BigDecimal.valueOf(3L), MathContext.DECIMAL32);
        System.out.println("PI value using BigDecimal and precision MathContext.DECIMAL32: " + oneThirdBigDecimal7digits);
        BigDecimal oneThirdBigDecimal16digits = BigDecimal.ONE.divide(BigDecimal.valueOf(3L), MathContext.DECIMAL64);
        System.out.println("PI value using BigDecimal and precision MathContext.DECIMAL64: " + oneThirdBigDecimal16digits);
        BigDecimal oneThirdBigDecimal34digits = BigDecimal.ONE.divide(BigDecimal.valueOf(3L), MathContext.DECIMAL128);
        System.out.println("PI value using BigDecimal and precision MathContext.DECIMAL128: " + oneThirdBigDecimal34digits);
        int requiredDigits = 4;
        BigDecimal oneThirdBigDecimalSelectDigits = BigDecimal.ONE.divide(BigDecimal.valueOf(3L), new MathContext(requiredDigits, RoundingMode.HALF_UP));
        System.out.println("PI value using BigDecimal and precision of 4 digits: " + oneThirdBigDecimalSelectDigits);

    }
}
