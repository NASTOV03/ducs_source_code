#include<iostream>
using namespace std;

int main()
{
int i,j,k,t=0;
 
cout<<"Enter number of elements you want to enter  "  ;
cin>>k;
int a[k];
	for(int h=0;h<k;h++)
	{
		cout<<"Enter element "<<h+1<<"\t";
        cin>>a[h];
		
	}
 
int n=sizeof(a)/sizeof(a[0]);
cout<<endl<<"\nlength of array ="<<n<<endl;
for(j=1;j<n;j++)
{   
 	int key=a[j];
 	i=j-1;
 	while(i>=0 && a[i]>key )
 	{
 		
 		a[i+1]=a[i];
 		i--;
 		t++;
	}
	 a[i+1]=key;
}
 
 cout<<"\nSORTED ARRAY IS : ";
 for(j=0;j<n;j++)
 {
 	cout<<a[j]<<" ";
 	
 }
 cout<<"\n\nNO OF COMPARISIONS IS = "<<t<<"\n\n\n\n\n";

}
