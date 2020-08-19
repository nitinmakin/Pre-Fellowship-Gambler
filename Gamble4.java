import java.util.Random;

public class Gamble4
{
	public static void get20DaysReport(String[] args) 
	{
		int totalWin20Days=0;
		int totalLoss20Days=0;
		Random random=new Random();
		int day=1;
		while(day<=20) {
			int initialAmount=100;

			while(initialAmount<150 && initialAmount > 50)
			{
				int result=random.nextInt(2);
				if(result==0)
					initialAmount--;
				else
					initialAmount++;
			}
			if(initialAmount>100)
			{
				totalWin20Days=totalWin20Days+(initialAmount-100);
			}
			if(initialAmount<100)
			{
				totalLoss20Days=totalLoss20Days+(100-initialAmount);
			}
			day++;
		}
		System.out.println("total loss in 20 days is  "+totalLoss20Days+" Stacks");
		System.out.println("total won in 20 days is  "+totalWin20Days+" Stacks");
		if(totalLoss20Days>totalWin20Days)
		{
			System.out.println("overall loss in 20 days is "+(totalLoss20Days-totalWin20Days+" Stacks"));
		}

		else
			System.out.println("overall profit in 20 days is "+(totalWin20Days-totalLoss20Days+" stacks"));


      }
}
