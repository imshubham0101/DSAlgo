package leetcode;

public class Gas_Station_134 {

	public static void main(String[] args) {
		
		int[] gas = {5,8,2,8};
				
		int[] cost = {6,5,6,6};
				
		System.out.println(canCompleteCircuit(gas,cost));

	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {
		int maxDifference = Integer.MIN_VALUE;
		int startingPoint = 0 ;
		for (int i = 0; i < cost.length; i++) {
			//Math.max(maxDifference,gas[i]-cost[i]);
			if(maxDifference < gas[i]-cost[i]) {
				maxDifference = gas[i] - cost[i] ;
				startingPoint = i ;
			}
		}
		int totalGas = gas[startingPoint];
		int j = startingPoint ;
		int endPoint = (startingPoint == 0)?gas.length-1:startingPoint-1;
		while(j != endPoint ) {
			int nextStation = (j+1)%gas.length ;
			
			totalGas = totalGas-  cost[j]+gas[nextStation];
			j++ ;
			j %= gas.length;
		}
		
		totalGas -= cost[j];
		
		if(totalGas >= 0) {
			return (j+1)%gas.length;
		}else 
			return -1;
	}

}
