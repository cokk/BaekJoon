package sort.sorting;

import java.util.Arrays;

public class mergeSortLab {
	static void mergeSort(int[] a, int start, int end){
		if(start == end) return;
		int middle = (start+end)/2;
		mergeSort(a, start, middle);
		mergeSort(a, middle+1, end);
		merge(a, start, middle, end);
	}
	
	static void merge(int[] a, int start, int middle, int end){
		int length = end - start + 1;
		int[] temp = new int[length];
		
		int i=0;
		int index1 = start;
		int index2 = middle + 1;
		
		while(index1 <= middle && index2 <= end){
			if(a[index1] < a[index2])
				temp[i++] = a[index1++];
			else
				temp[i++] = a[index2++];
		}
		
		while(index1 <= middle)
			temp[i++] = a[index1++];
		while(index2 <= end)
			temp[i++] = a[index2++];
		
		for(i=0; i<temp.length; ++i)
			a[start+i] = temp[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,5,6,0,8,4,1,2,9,3}; // 0~9
		
		mergeSort(a,0, a.length-1);
		System.out.println(Arrays.toString(a));
		
	}

}
