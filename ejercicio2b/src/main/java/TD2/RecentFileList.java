package TD2;

import java.util.Scanner;

public class RecentFileList{
	
	public int[] recentFileList(){
	
		
	int[] num = RecentFileTest.getNum();
	
	
		
		Scanner scanner = new Scanner(System.in);

		int file = scanner.nextInt();
		

		
		for (int i = 0; i <= 14; i++) {
			if (num[i] == file) {
				
				int[] listAux = new int[i];
				for (int j = 0; j <= num[i] - 1; j++) {
					listAux[j] = num[j];
				}
				num[0] = num[i];
				for (int j = 1; j <= num[i]; j++) {
					num[j] = listAux[j - 1];
				}
				
			} else if (file>14){
				int[] listAux = new int[15];
				
				for (int j = 0; j <= 13; j++) {
					listAux[j] = num[j];
				}
				for (int j = 1; j <= 14; j++) {
					
					num[j] = listAux[j - 1];
				
			
				}
				num[0]=file;
				break;
			}
	
		}

		return num;
  }

	

}

	
