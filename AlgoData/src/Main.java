import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = Helper.getBigArray();
		
		
		
		// Test BubbleSort:
		int[] bubble = Arrays.copyOf(array, array.length);
		long beginTime = System.currentTimeMillis();
		Sort.bubbleSort(bubble);
		long bubbleTime = (System.currentTimeMillis() - beginTime);
		
		
		
		// Test MergeSort:
		int[] merge = Arrays.copyOf(array, array.length);
		beginTime = System.currentTimeMillis();
		Sort.mergeSort(merge);
		long mergeTime = (System.currentTimeMillis() - beginTime);
		
		
		
		//Test SelectionSort
		int[] selec = Arrays.copyOf(array, array.length);
		beginTime = System.currentTimeMillis();
		Sort.selectionSort(selec);
		long selecTime = (System.currentTimeMillis() - beginTime);
		
		
		
		//Test InsertSort
		int[] insert = Arrays.copyOf(array, array.length);
		beginTime = System.currentTimeMillis();
		Sort.insertionSort(insert);
		long insertTime = (System.currentTimeMillis() - beginTime);
		
		//Times: 
		System.out.println("BubbleSort: "+bubbleTime+"ms");
		System.out.println("MergeSort: "+mergeTime+"ms");
		System.out.println("SelectionSort: "+selecTime+"ms");
		System.out.println("InsertionSort: "+insertTime+"ms");
	
	}

}
