#include <stdio.h>
int main() {
    int arr[]={5,8,5,7,8,10,5};
    int size=sizeof(arr)/sizeof(arr[0]);
    int freq[size];
    for(int i=0;i<size;i++){
        freq[i]=-1;
    }
    for(int i=0;i<size;i++){
        int count=1;
        for(int j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
                count++;
                freq[j]=0;
            }
        }
        if(freq[i]!=0){
            freq[i]=count;
        }
    }
    printf("Element\tFrequency\n");
    for(int i=0;i<size;i++){
        if(freq[i]!=0){
            printf("%d\t%d\n",arr[i],freq[i]);
        }
    }
    return 0;
    git

}