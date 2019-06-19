//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2751 : 수 정렬하기 2
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//병합 정렬 또는 힙 정렬로 

package level.level9;
import java.util.Scanner;

public class Lv9_2_2751 {
	private static void mergeSort(int[] arr, int startIndex, int endIndex){
		if(endIndex - startIndex <= 0) return;
		int mid = (startIndex + endIndex) / 2;
		
		mergeSort(arr, startIndex, mid);
		mergeSort(arr, mid+1, endIndex);
		
		merge(arr, startIndex, mid, endIndex);
	}
	private static void merge(int[] arr, int startIndex, int middleIndex, int endIndex){
		int length = endIndex - startIndex+1;
		int[] save = new int[length];
		int leftIndex = startIndex;
		int rightIndex = middleIndex + 1;
		int index = 0;
		
		while(leftIndex <= middleIndex && rightIndex <= endIndex){
			if(arr[leftIndex] < arr[rightIndex]){
				save[index] = arr[leftIndex];
				leftIndex++;
			} else if(arr[leftIndex] > arr[rightIndex]){
				save[index] = arr[rightIndex];
				rightIndex++;
			} 
			index++;
		}
		
		while(leftIndex <= middleIndex){
			save[index++] = arr[leftIndex++];
		}
		while(rightIndex <= endIndex){
			save[index++] = arr[rightIndex++];
		}
		
		index=0;
		for(int i=startIndex;i<=endIndex;i++){
			arr[i] = save[index++];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] sortArr = new int[input];
		int length = sortArr.length;
		
		for(int i=0; i<sortArr.length; i++){
			sortArr[i] = sc.nextInt();
		}
		
		mergeSort(sortArr,0,length-1); // array, start, end
		
		for(int i=0; i<sortArr.length;i++){
			System.out.println(sortArr[i]);
		}
		sc.close();
	}
}
