#include <iostream>

using namespace std;
//MERGE SORT 
int t;

// A function to merge the two half into a sorted data.
void Merge(int *a, int low, int high, int mid)
{
    // We have low to mid and mid+1 to high already sorted.
    int i, j, k, temp[high-low+1];
    i = low;
    k = 0;
    j = mid + 1;

    // Merge the two parts into temp[].
    while (i <= mid && j <= high)
    {    t++;
        if (a[i] < a[j])
        {
            temp[k] = a[i];
            k++;
            i++;
            
        }
        else
        {
            temp[k] = a[j];
            k++;
            j++;
        
        }
      
    }

    // Insert all the remaining values from i to mid into temp[].
    while (i <= mid)
    {
        temp[k] = a[i];
        k++;
        i++;
    }

    // Insert all the remaining values from j to high into temp[].
    while (j <= high)
    {
        temp[k] = a[j];
        k++;
        j++;
    }

    // Assign sorted data stored in temp[] to a[].
    for (i = low; i <= high; i++)
    {
        a[i] = temp[i-low];
    }
}

// A function to split array into two parts.
void MergeSort(int *a, int low, int high)
{
    int mid;
    t++;
    if (low < high)
    {
        mid=(low+high)/2;
        // Split the data into two half.
        MergeSort(a, low, mid);
        MergeSort(a, mid+1, high);

        // Merge them to get sorted output.
        Merge(a, low, high, mid);
    }
}

int main()
{
	for(int p=0;p<100;p++)
	{
		t=0;
	
    int  i,k;
    do{

	 k = rand();
}while(k<30 || k>1000);
    
	int a[k];
	for(int h=0;h<k;h++)
	{
		a[h]=rand();
		
	}
	cout<<endl;
	cout<<"LENGTH OF ARRAY IS = "<<k;

    MergeSort(a, 0, k-1);

    // Printing the sorted data.
    cout<<"\n\nSorted Data \n";
    for (i = 0; i < k; i++)
        {
		cout<<a[i]<<"  ";
}
cout<<"\n\n NO. OF COMPARISONS IS = "<<t;
cout<<"\n\n\n\n\n";
}
    return 0;
}
