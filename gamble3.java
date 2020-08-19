import java.util.Random;
class Gamble3
{
	
        
        public static void ResignOfDay()
  {     
        Random random=new Random(); 
        int initialAmount=100;
        while(initialAmount<150 && initialAmount > 50)
         {
	   int result=random.nextInt(2);
	   if(result==0)
	   initialAmount--;
	   else
	   initialAmount++;
         }
        System.out.println("initialAmount");
  }
}
