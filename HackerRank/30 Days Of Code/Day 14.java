Difference(int[] array)
    {
        elements=array;
        
    }
public  void computeDifference()
{
    for(int i=0;i<elements.length;i++)
    {
        for(int j=0;j<elements.length;j++)
        {
        int k=Math.abs(elements[i]-elements[j]);
        maximumDifference=Math.max(maximumDifference,k);
        }
    }
}