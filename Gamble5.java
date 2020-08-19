import java.util.Random;

public class Gamble5
{
	public static void main(String[] args) 
	{
		int totalWinInMonth=0;
		int totalLossInMonth=0;
		Random random=new Random();
		int day=1;
		while(day<=30) {
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
				totalWinInMonth=totalWinInMonth+(initialAmount-100);
			}
			if(initialAmount<100)
			{
				totalLossInMonth=totalLossInMonth+(100-initialAmount);
			}
			day++;
		}
		System.out.println("total loss in a month is  "+totalLossInMonth+" Stacks");
		System.out.println("total won in a month is  "+totalWinInMonth+" Stacks");
		if(totalLossInMonth>totalWinInMonth)
		{
			System.out.println("overall loss in a month is "+(totalLossInMonth-totalWinInMonth+" Stacks"));
		}

		else
			System.out.println("overall profit in a month is "+(totalWinInMonth-totalLossInMonth+" stacks"));


	}
}
