public class Frequency {
	public static void main(String[] args) {
		//declaring variables to store values and frequencies.
		int oneCount = 0, twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0;
		int values[];
		values = new int[20];
		
		//storing values
		values[0] = 1;
		values[1] = 2;
		values[2] = 5;
		values[3] = 4;
		values[4] = 3;
		values[5] = 5;
		values[6] = 2;
		values[7] = 1;
		values[8] = 3;
		values[9] = 3;
		values[10] = 1;
		values[11] = 4;
		values[12] = 3;
		values[13] = 2;
		values[14] = 5;
		values[15] = 3;
		values[16] = 4;
		values[17] = 5;
		values[18] = 3;
		values[19] = 1;
		
		//Calculating the frequencies
		for(int i = 0; i < 20; i++) {
			switch (values[i]) {
				case 1:
					oneCount++;
					break;
				case 2:
					twoCount++;
					break;
				case 3:
					threeCount++;
					break;
				case 4:
					fourCount++;
					break;
				case 5:
					fiveCount++;
					break;
				default:
					break;
			}
		}
		
		//Displaying the frequencies of each value
		System.out.println("The frequency of 1 is " + oneCount);
		System.out.println("The frequency of 2 is " + twoCount);
		System.out.println("The frequency of 3 is " + threeCount);
		System.out.println("The frequency of 4 is " + fourCount);
		System.out.println("The frequency of 5 is " + fiveCount);
	}
}