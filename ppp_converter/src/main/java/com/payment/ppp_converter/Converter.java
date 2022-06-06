package com.payment.ppp_converter;

public class Converter {
    public static double getInrFromUsd(double amount_in_usd){
        return amount_in_usd*22d;
    }

    public static double getUsdFromINR(double amount_in_inr){
        return  amount_in_inr/22d;
    }

}
