


public class recursion2
{

    public static int factorial(int x){

	if(x == 0)
	    return 1;
	return x*factorial(x-1);
    }


    public static void main(String[] arguments){

	Interesting y = new Interesting();
	System.out.println(factorial(y.most));
    }


}
