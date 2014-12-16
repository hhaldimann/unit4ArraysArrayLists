
public class ArrayMethods
{
    private int[] values;
    private int currentSize;
    public ArrayMethods()
    {
        values = new int[10];
        currentSize = 0;
    }
    public void fillElements(int numberOfElements, int maxValue)
    {
        for( int i = 0; i < numberOfElements; i++)
        {
            values[i] = (int)(Math.random()*maxValue);
            currentSize++;
        }
    }
    public void swapFirstAndLast(int index0, int index9)
    {
        int temp = values[index0];
        values[index0] = values[index9];
        values[index9] = temp;
    }
    public void shiftElementsRight(int[] arr)
    {
        int last = arr.length - 1;
        int temp = arr[last];
        
        for( int i = last; i > 0; i-- )
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public void replaceZeroesWithEvens(int index)
    {
        for( int i = 0; i < values.length; i++)
        {
            index = values[i];
            if( index % 2 = 0 )
            {
                values[i] = 0;
            }
        }
    }
    public void removeMiddleElement(int index, int index2)
    {
        if( values.length % 2 = 0 )
        {
            values[index] = values[(values.length + 1) / 2];
            currentSize--;
            values[index] = values[(values.length - 1) / 2];
            currentSize--;
        }
        else
        {
            values[index2] = values[(values.length + 1) / 2];
            currentSize--;
        }
    }
    public void replaceWithLargestNeighbor(int[] arr)
    {
        int prevValue = arr[0];
        for(int i = 1 ; i < arr.length - 1; i++)
        {
            if(prevValue > arr[i+1])
            {
                arr[i] = prevValue;
            }
            else
            {
                arr[i] = arr[i+1];
                
            }
            prevValue = temp;
        }
    }
}
