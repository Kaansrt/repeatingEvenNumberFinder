import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {1, 3, 5,9, 8, 9, 10, 10, 12, 13, 12,14,14};
        int[] duplicate = new int[list.length];
        int starIndex=0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (((i != j) && list[i] == list[j]) && list[i] % 2 == 0) {
                    if (!isFind(duplicate, list[i])) {
                    duplicate[starIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int arr : duplicate) {
            if (arr != 0) {
            System.out.print(arr + " ");
            }
        }

    }
}