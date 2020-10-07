public class Arrays {
    public static void main(String[] args) {
        int[] arrs = {-5, 1, -8, 0, 4, 6};
        int result = minValue(arrs);
        System.out.println("The smallest element in the array is: " + result);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }
        return  index;
    }
}


