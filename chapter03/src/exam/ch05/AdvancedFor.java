package exam.ch05;

public class AdvancedFor {
	public static void main(String[] args) {
		int[] scores =  {93,56,88,94,77};
		int sum = 0;
		for(int score : scores)
			sum+=score;
		
		
		System.out.println("score 총합 : "+sum);
		
		
		int sc [][] = {{1,2,3},{6,5,4},{7,8,9},{11,2,33}};
		
		for(int i = 0 ; i < sc.length; i++) {
			for(int j = 0 ; j <sc[i].length; j++) {
				System.out.printf("%d ",sc[i][j]);
			}
			System.out.println();
		}
		
		for(int ii[] : sc) {
			for(int jj : ii) {
				System.out.printf("%d ", jj);
			}
		}
	}
}
