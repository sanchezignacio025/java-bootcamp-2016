package TD2;


import org.junit.BeforeClass;
import org.junit.Test;

public class RecentFileTest {
	
	static int[] num = null;
	
	@Test
    public void showEmptyList1() {

		
		int[] num = null;
		if (num == null) {
			System.out.println("The list of files is empty");
		}

	}

	@BeforeClass
	public static void initList() {

		num = new int[15];
		for (Integer i = 0; i <= 14; i++) {
			num[i]= i;
		}
	}

   

	@Test
    public void showFillList() {
		
		for (int i = 0; i <= 14; i++)  {
			System.out.println("the number of files is : " + num[i]);
			
		}
	}

	
	@Test 
    public void showListSortedByMostRecentFile(){
		
		RecentFileList recentFileList = new RecentFileList();
		recentFileList.recentFileList();
		
		int index = 0;
		 for (int i = 0; i <= 14; i++)   {
			System.out.println("number : " + num[i]);
			index++;
		}
		
		
	}
	

	public static int[] getNum() {
		return num;
	}

	public static void setNum(int[] num) {
		RecentFileTest.num = num;
	}
   }

