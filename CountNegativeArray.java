public class CountNegativeArray
{
	
	public static void main(String[] args) 
  {
		int i = 0, count = 0;
		int[] count_NegArr = {-43, 25, -41, 1, -4, -3, 22, -16, -13, -94, 5, 18, -6};
		
		while(i < count_NegArr.length) 
		{
			if(count_NegArr[i] < 0) {
				count++;
			}
			i++;
		}
		System.out.println("\nThe Total  Negative Array Items = " + count);
	}
}