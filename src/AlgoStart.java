/**
 * Created by binay on 7/18/16.
 */
public class AlgoStart {

    public static void main(String[] args)
    {
        int[] array={56,32,1,78,63,23,90,2};
       int[] sortedArray= new MergeSort().MergeSort(array);

        System.out.println("Initial array is:");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println("\nSorted array is:");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(sortedArray[i]+" ");
        }
    }
}

