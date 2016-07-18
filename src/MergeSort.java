/**
 * Created by binay on 7/18/16.
 */
public class MergeSort {

    public int[] MergeSort(int[] a)
    {
       if(a.length==1)
           return a;


        int mid=a.length/2;
        int[] l=new int[mid];
        int[] u=new int[a.length-mid];



        for(int i=0;i<mid;i++)
        {
            l[i]=a[i];
        }
        int j=0;
        for(int i=mid;i<a.length;i++)
        {
            u[j]=a[i];
            j++;
        }

        int[] a1=MergeSort(l);

        int[] a2=MergeSort(u);

        return merge(a1,a2);
    }

    public int[] merge(int[] a1,int[] a2)
    {
        int a1counter=0;
        int a2counter=0;
        int[] a=new int[a1.length+a2.length];

        for(int i=0;i<a.length;i++)
        {
            if((a1counter<a1.length && a2counter<a2.length))
            {
                if(a1[a1counter]<a2[a2counter]) {
                    a[i] = a1[a1counter];
                    a1counter++;
                }
                else
                {
                    a[i]=a2[a2counter];
                    a2counter++;
                }
            }
            else
            {
                if(a1counter==a1.length)
                {
                    a[i]=a2[a2counter];
                    a2counter++;
                }
                else if(a2counter==a2.length)
                {
                    a[i] = a1[a1counter];
                    a1counter++;
                }
            }
        }
        return a;
    }

}
