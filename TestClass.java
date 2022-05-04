import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // PrintWriter wr = new PrintWriter(System.out);
     //   int T = Integer.parseInt(br.readLine().trim());
      //  for(int t_i=0; t_i<T; t_i++)
      //  {
           // int n = Integer.parseInt(br.readLine().trim());
		    Scanner sc = new Scanner(System.in);
		   int gg=sc.nextInt();
		   
            for(int i=0; i<gg; i++){
            int out= solve(i);}
			//if(out>0)
           // System.out.println(out); }
           // System.out.println("");
        // }

      //   wr.close();
      //   br.close();
    }
    static int solve(int n){
        if(palin(n))
     {
        int binary[]= new int[35];
        int id=0,count=0,h=n;
          while(h>0)
          {
              binary[id++]=h%2;
              h=h/2;
          }
         

         for(int j=0,k=id-1;j<id;j++,k--){
              if(binary[j]==binary[k]) count++;
         }

         if(count==id){ 
            System.out.println(n);
             count=0;
         }else
         count=0;
	  return(n);
     }
    else
	 return(0);
    
    }
  static boolean palin(int p)
    {  
	if(p/10==0) return true;
	     
     int arr[]= new int[35];
     int l=0,count=0;

     while(p>0)
     { arr[l++]=p%10;
     p=p/10;
     }

      for(int j=0,k=l-1;j<l;j++,k--){
              if(arr[j]==arr[k]) count++;
         }

         if(count==l){
            return true;
         }else
         return false;

        



    }
}