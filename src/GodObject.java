import java.util.Arrays;

public class GodObject {
    public static int getMax (int ...nums){
        if (nums.length != 3){
            return -1;
        }

        int max = nums[0];
        for (int n: nums){
            if (n > max){
                max = n;
            }
        }

        return max;
    }


    public static int getMin (int ...nums){
        if (nums.length != 5){
            return -1;
        }

        int min = nums[0];
        for (int n: nums){
            if (n < min){
                min = n;
            }
        }

        return min;
    }

    public static float getAvg (int[] arr){
        int sum = 0;

        for (int n: arr){
            sum += n;
        }

        return (float)sum / arr.length;
    }

    public static int getMaxFromArray (int[] arr){
        int max = arr[0];

        for (int n: arr){
            if (n > max){
                max = n;
            }
        }
        return max;
    }


    public static int getMinFromArray (int[] arr){
        int min = arr[0];

        for (int n: arr){
            if (n < min){
                min = n;
            }
        }
        return min;
    }

    public static void sortArray (int[] arr){
        Arrays.sort(arr);
    }

    public static int binarySearch(int[] arr, int n){
        if (arr == null){
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
