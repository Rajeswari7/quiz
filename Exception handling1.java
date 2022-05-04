package com.jap.averageofintegers;


public class AverageAge
{
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData)
    {
		double avg=0;
		double sum=0;
		int n;
		int len=ageRawData.length;
		try{
			for(int i=0;i<len;i++){
			n=Integer.parseInt(ageRawData[i]);
			sum=sum+n;

		}
		avg=sum/len;
		}catch(Exception e){
			return e.toString();
		}
		
		String res=String.valueOf(avg);
		
       return res;
    }


}
