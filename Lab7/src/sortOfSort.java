import java.util.Arrays;

public class sortOfSort { // used this site for visualization and help tracing of method.  http://www.pythontutor.com/visualize.html#mode=edit

    public sortOfSort(){}

    public void sortArray(int[] arr){ //helper method that sorts the array first.
        Arrays.sort(arr);

    }

    public void sortOfSorts(int[] arr){
        int end = arr.length-1;
        int maxIndex = 0;
        int start = 0;
        int incCount = 0;

        sortArray(arr); //sort the array first.
        
        while(start < end) {

            //first find the max number in array
            //find max method help from from https://www.geeksforgeeks.org/c-program-find-largest-element-array/

            int max = arr[start]; //where to start looking for the max number
            for (int i = start; i <= end; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    maxIndex = i; //updates the current max's index
                }
            }
                if(incCount <2){ // swaps array indexes. used https://stackoverflow.com/questions/13766209/effective-swapping-of-elements-of-an-array-in-java for help.
                    int tempVal = arr[end]; //initializing the temporary value at end value
                    arr[end] = max;
                    arr[maxIndex] = tempVal;
                    end--; // important to decrement the array length at -1 (last val or first val depending on the direction) so that it does not check the val when searching for the max
                    incCount++;

                }
                else { // more swapping array indexes.
                    int tempVal = arr[start];//initializing the temporary value at starting value
                    arr[start] = max;
                    arr[maxIndex] = tempVal;
                    start++;
                    incCount++;
                }
            if(incCount >= 4){ // resets the incCounter after iterating through if-else statements whenever the counter reaches 4
                incCount = 0;
            }

        }
        System.out.println(Arrays.toString(arr)); // Printing Arrays so that it prints out the content and not the location.
    }
}


