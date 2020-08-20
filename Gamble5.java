import java.util.Arrays;
import java.util.Random;

public class Gamble5 
{
	public static void main(String[] args) 
	{

		Get30DaysReport();

	}
	public static void Get30DaysReport() {
		int totalWinInMonth=0;
		int totalLossInMonth=0;
		Random random=new Random();
		int day=1;
		int arr[]=new int[30];
		int InitialWin=0;
		while(day<=30) {
			int initialAmount=100;

			while(initialAmount<150 && initialAmount > 50)
			{
				int result=random.nextInt(2);
				if(result==0) {
					initialAmount--;
					InitialWin=InitialWin-1;
					arr[day-1]=InitialWin;


				}
				else {
					initialAmount++;
					InitialWin=InitialWin+1;
					arr[day-1]=InitialWin;


				}
			}
			if(initialAmount>100)
			{
				totalWinInMonth=totalWinInMonth+(initialAmount-100);
				System.out.println("in day "+day+" he won 50 rs");
			}
			if(initialAmount<100)
			{
				totalLossInMonth=totalLossInMonth+(100-initialAmount);
				System.out.println("in day "+day+" he lost 50 rs");
			}
			day++;
		}
		System.out.println("total loss in a month is Rs "+totalLossInMonth);
		System.out.println("total won in a month is Rs "+totalWinInMonth);
		if(totalLossInMonth>totalWinInMonth)
		{
			System.out.println("overall loss in a month is "+(totalLossInMonth-totalWinInMonth));
		}

		else
			System.out.println("overall profit in a month is "+(totalWinInMonth-totalLossInMonth));

		GetLuckyAndUnluckytDay(arr);

	}

	public static void GetLuckyAndUnluckytDay(int arr[])
	{

		int LuckyDay=0;
		int UnluckyDay=0;
		int High=arr[0];
		int Low =arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(High<arr[i])
			{
				High=arr[i];
				LuckyDay=i+1;
			}
			if(Low>arr[i])
			{
				Low=arr[i];
				UnluckyDay=i+1;
			}


		}
		System.out.println("lucky day is day "+LuckyDay+" he won "+High);
		System.out.println("Unlucky day is day"+UnluckyDay+" he lost "+Low);

	}

}

