public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) { // Corrected loop condition
            arr[i] = i * 2;
        }
        // Avoids accessing index outside of the bounds
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}