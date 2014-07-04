
public class recursion0 {


	    public static int factorial(int x){
		
		if ( x == 0)
		    {
			return 1;
		    }
		return x*factorial(x-1);
	    }
	    
	    public static int sumSeries(int size,int bottom){
		if( size == bottom ){
		    return 0;
		}
		return size + sumSeries(size-1,bottom);

	    }

	    public static String search(String x){
	       
		if( x.length() == 0 ){
		    return "End reached without success";
		}
		
		if(x.substring(0,1).equals("s")){
		    System.out.println(x.substring(0,1));
		    return "win";
		}
		else{
		    return search(x.substring(1,x.length()));
		}
		    
	    }
	    

	    public static void main(String[] arguments){
		System.out.println(factorial(4));
		System.out.println(sumSeries(2,0));
		System.out.println(search("ssssssss"));



	    }




}

