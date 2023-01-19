package pattern;

public class bhav {

	public static void main(String[] args) {
      int n=5;
      for(int row=0;row<n;row++)
      {
    	  for(int col=0;col<n;col++)
    	  {
    		  if(row==0||row==n/2||row==n-1||col==0||col==n-1)
    		  {
    			  System.out.print("* ");
    		  }
    		  else
    			  System.out.print("  ");
    	  }
    	  for(int col=0;col<n;col++)
    	  {
    		  if(col==0||col==n-1||row==n/2)
    		  {
    			  System.out.print("* ");
    		  }
    		  else
    			  System.out.print("  ");
    	  }
    		  for(int col=0;col<n;col++)
        	  {
        		  if(col==0|| col==n-1|| row==0||row==n/2)
        		  {
        			  System.out.print("* ");
        		  }
        		  else
        			  System.out.print("  ");
        	  }
        		  for(int col=0;col<n;col++)
            	  {
            		  if(col==0&&row<=n/2||col==n-1&&row<=n/2||row==3&&col==1||row==3&&col==3||row==4&&col==2)
            		  {
            			  System.out.print("* ");
            		  }
            		  else
            			  System.out.print("  ");
            	  }
        		  for(int col=0;col<n;col++)
            	  {
            		  if(col+row==n-1||row==0&&col==0||row==1&&col==1)
            		  {
            			  System.out.print("* ");
            		  }
            		  else
            			  System.out.print("  ");
            	  }
        		  for(int col=0;col<n;col++)
            	  {
            		  if(col==0|| col==n-1|| row==0||row==n/2)
            		  {
            			  System.out.print("* ");
            		  }
            		  else
            			  System.out.print("  ");
    	  }
    	  System.out.println();
      }

	}

}
