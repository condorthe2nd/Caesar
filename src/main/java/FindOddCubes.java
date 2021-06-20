public class FindOddCubes {

    public static int cubeOdd(int arr[]) {
        int sum = 0;

        for (int j = 0, arrLength = arr.length; j < arrLength; j++) {
            int i = arr[j];
            i = i * i * i;
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
