import java.util.Scanner;
class name
{
        public static void main(String[] args)
    {
         Scanner input=new Scanner(System.in);
         int n=input.nextInt();
	 int sum=0;
         int a1=0,a2=1,a3;
         for(int i=2;i<=n;i++)
    	 {
          	a3=a1+a2;
	  	if(a3%2==0)
	  	{
			sum=sum+a3;
	  	}	      
  	  	a1=a2;
          	a2=a3;
   	  }
	  System.out.print(sum);
    }
}
         