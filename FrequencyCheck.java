public class FrequencyCheck {
    public static void main(String[] args) {
        int[] arr = {10, 5, 60, 10, 5, 10, 10, 10, 4, 10};
        int result = findMostFrequentElement(arr);
        if (result != -1) {
            System.out.println("The most frequent element is: " + result);
        } else {
            System.out.println("No element occurs more than half the array length.");
        }
    }

    public static int findMostFrequentElement(int[] arr) {
        int mostFrequentElement = -1;
        int highestFrequency = 0;

        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

           
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            
            if (count > highestFrequency) {
                highestFrequency = count;
                mostFrequentElement = arr[i];
            }
        }

      
        if (highestFrequency > arr.length / 2) {
            return mostFrequentElement; 
        }

        return -1; 
    }
}
