package Sorting;

public class Sorting {

    public static void main(String[] args) {
        int[] array = {1, -1, 3,6,2,5,5};
        array = insertionSort(array);
        for(int a: array){
            System.out.print(a + " ");
        }
        
    }
    
   public static int[] insertionSort(int[] array){
       int length = array.length;
       int temp = 0;
       for(int i=1; i<length; i++){
           for(int j=i; j>0; j--){
              if(array[j]<array[j-1]){
                  exchange(array,j,j-1);
              } 
           }
       }
       return array;
   }
   
   public static void exchange(int[] array, int fIndex, int sIndex){
       int temp = 0;
       temp = array[fIndex];
       array[fIndex]= array[sIndex];
       array[sIndex] = temp;
       
   }
    
}
