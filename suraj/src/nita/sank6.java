package nita;

public class sank6 {
	public static void main(String[] args) {
		 String str = "HelloJavalannkkkk";
		 
	        char[] ch = str.toCharArray();
	        int count;
	        int i=0,j=0;
	        for(i=0;i<ch.length;i++)
	        {
	            count = 1 ;
	            for( j = i+1;j<ch.length;j++)
	            {
	                if(ch[i] == ch[j]  && ch[i]!=' ')                                        
	                {
	                    count++;
	                    ch[j]='0';
	                
	                }
	            }
	            if(count>1 && ch[i]!='0')   
	            {
	                System.out.println(ch[i] + " Occured " + count + " time");
	            }


	        }



		
	}

}
