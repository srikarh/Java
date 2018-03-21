package irs;
import java.util.*;

public class TaxCalculator {
	Hashtable<String,ArrayList<TaxBucket>> buckets;
	//ArrayList<TaxBucket> buckets;
	
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator();
		calc.CalculateTax();
	}
	
	public TaxCalculator() {
		buckets = new Hashtable<String, ArrayList<TaxBucket>>();
		
		
		ArrayList<TaxBucket> indBuckets = new ArrayList<TaxBucket>();
		indBuckets.add(new TaxBucket(0, 9525, 0, 10));
		indBuckets.add(new TaxBucket(9526, 38700, 952.50, 12));
		indBuckets.add(new TaxBucket(38701, 82500, 4453.50, 22));
		indBuckets.add(new TaxBucket(82501, 157500, 14089.50, 24));
		indBuckets.add(new TaxBucket(157501, 200000, 32089.50, 32));
		indBuckets.add(new TaxBucket(200001, 500000, 45689.50, 35));
		indBuckets.add(new TaxBucket(500001, 0, 150689.50, 37));
		
		buckets.put("Individual", indBuckets);
		
		
		ArrayList<TaxBucket> marBuckets = new ArrayList<TaxBucket>();
		marBuckets.add(new TaxBucket(0, 19050, 0, 10));
		marBuckets.add(new TaxBucket(19051, 77400, 1905, 12));
		marBuckets.add(new TaxBucket(77401, 165000, 8907, 22));
		marBuckets.add(new TaxBucket(165001, 315000, 28179, 24));
		marBuckets.add(new TaxBucket(315001, 400000, 64179, 32));
		marBuckets.add(new TaxBucket(400000, 600000, 91379, 35));
		marBuckets.add(new TaxBucket(600001, 0, 161379, 37));
	
		buckets.put("Married", marBuckets);
		
		}
	
	public void CalculateTax() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		double amount = reader.nextDouble();
		reader.nextLine();
		System.out.println("Type 'Married or 'Single': ");
		String position = reader.nextLine();
		reader.close();
		int i = 0;
		
		ArrayList<TaxBucket> holder;
		
		if (position.equals("Single")) {
			holder = buckets.get("Individual");
		}
		else {
			holder = buckets.get("Married");
		}
		
		double maxAllowed = holder.get(holder.size() - 1).lowAmt;
		
			TaxBucket bucket = holder.get(i);
			
			if (amount >= maxAllowed) {
				bucket = holder.get(holder.size() - 1);
			}
			else {
				while (!(bucket.lowAmt <= amount && amount <= bucket.highAmt)) {
					i++;
					bucket = holder.get(i);
				}
			}
			double tax = bucket.minTaxAmt + (amount - (bucket.lowAmt - 1)) * (bucket.taxRate/100);
			System.out.println(tax);
		
	}
}
