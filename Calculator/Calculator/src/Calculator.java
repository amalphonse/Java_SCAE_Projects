
//Implement the following functions
/*convertFeetsToMeters(double[] values), 
 * convertUSDToEUR(double[] values), 
 * calculateSumOfInt(long from, long to), 
 * getNumOfCharacters(String str).
 * */
 
public class Calculator {
	public double[] ConvertFeetToMeters(double[] values){
		double[] new_values = {};
		
		
		return new_values;
	}
	
	public int getMax(int[] values){
		int max = values[0];
		int i;
		for(i = 1; i < values.length; i++){
			if(values[i] > max)
				max = values[i];
		}
		return max;
	}
	public int getMin(int[] values){
		int min = Integer.MAX_VALUE;
		int i = 0;
		while(i < values.length){
			if(values[i] < min)
				min = values[i];
			i++;
		}		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
