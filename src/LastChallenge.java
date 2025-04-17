public class LastChallenge {
    public static void main(String[] args) {

        int[] arr = {1, 562, 3, 4, 15, 6};

//        int n = arr.length - 1; // Corrected
        int currmax = Integer.MIN_VALUE; // Java equivalent of INT_MIN

        for(int i = 0; i < arr.length; i++) { // Corrected loop condition
            currmax = Math.max(arr[i], currmax); // Corrected usage of max
        }

        int secondmax =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != currmax){
                secondmax = Math.max(arr[i],secondmax);
            }
        }

        System.out.println("Maximum value is: " + currmax);
        System.out.println("Second max value is:" + secondmax);
    }
}
