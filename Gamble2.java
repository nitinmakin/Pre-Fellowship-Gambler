import java.util.Random;
class Gamble2
{
public static void WinOrLoss()
{
 Random random=new Random();
 int result=random.nextInt(2);

 if (result==0)
  System.out.println("win");

 else
 System.out.println("loss");
}
}
