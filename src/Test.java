public class Test {


  static int[] countArray(int[] array) {
        int[] count = new int[101];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        return count;
    }

    static int countElements (int number, int [] array){
      return array[number];
    }

}
