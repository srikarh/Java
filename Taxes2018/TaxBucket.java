package irs;

public class TaxBucket {
double lowAmt;
double highAmt;
double minTaxAmt;
double taxRate;

public TaxBucket(double lowAmt, double highAmt, double minTaxAmt, double taxRate) {
	this.lowAmt = lowAmt;
	this.highAmt = highAmt;
	this.minTaxAmt = minTaxAmt;
	this.taxRate = taxRate;
}
}
