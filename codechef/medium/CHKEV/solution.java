import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int arr[]=new int[(r-l)+1];
		for(int i=l;i<=r;i++){
		    arr[i-l]=i;
		}
		int even=0;
		for(int j=0;j<arr.length;j++){
		    if(arr[j]%2==0){
		        even=1;
		        break;
		    }
		}
		if(even==1){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}

	}
}
