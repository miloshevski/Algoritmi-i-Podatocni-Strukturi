package ZadaciOdKurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ShakerSort {
    static void swap(int [] a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
	static void print(int []a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
	static void shakerSort(int a[], int n)
	{	
        if(n==1){
            print(a,n);
            print(a,n);
        }
        int l=n;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=n-1;j>i;j--){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                    flag=true;
                }
            }
            print(a,l);
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    flag=true;
                }
            }
            print(a,l);
            if(!flag){
                break;
            }
        }
	}

	public static void main(String[] args) throws IOException{
		int i;
		BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in)); 
		String s = stdin.readLine();
		int n = Integer.parseInt(s);
		
		s = stdin.readLine();
		String [] pom = s.split(" ");
		int [] a = new int[n];
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(pom[i]);
		shakerSort(a,n);
	}
}