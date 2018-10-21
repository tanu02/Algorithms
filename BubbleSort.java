
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		sort(arr);
		printArray(arr);
	}

	public static void sort(int[] arr){

		 for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){

				if(arr[j + 1] < arr[j]){
					swap(arr, j, j+1);
				}				
			}
		}
	}

	public static void swap(int[] arr, int i, int j){

		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void printArray(int[] arr){
		for(int val: arr){
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
