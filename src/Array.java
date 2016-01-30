
public class Array
{
	public static void main(String args[])
	{
	int [] studentids = {1,10,20,30,30,30,30,1};
    int value =0;
    int count =0;
	for(int i=0; i<=studentids.length-1; i++)
	{
		int tempValue = studentids[i];
		int tempCount = 0;
		for(int j=0; j<= studentids.length-1;j++)
		{
			if(tempValue == studentids[j])
			{
				tempCount++;
				if(tempCount>count)
				{
					value = tempValue;
					count = tempCount;
				}
			}
		}
		
	}

	
	System.out.println("Most frequently occuring value is "+ value+", and its count is "+ count);
	
	}
}