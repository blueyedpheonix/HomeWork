//package objectPractice;
//
//import java.util.Random;
//
//public class ArrayHandler {
//    Random rand = new Random();
//    int[] array;
//    public ArrayHandler(int array[])
//    {
//        this.array = array;
//    }
//    public ArrayHandler(){
//       this.array = new int[10];
//       for (int i =0; i < 10; i++)
//       {
//           array[i] = rand.nextInt(10);
//       }
//    }
//        public boolean isBalanced(int index)
//        {
//            int sum = 0;
//            int sum2 = 0;
//            boolean isEqual = false;
//            for (int i =0; i < index; i++){
//                sum += array[i];
//            }
//            for (int i = index; i > array.length; i++){
//                sum2 += array[i];
//            }
//            return (sum == sum2);
//
//        }
//       public int[] getDuplicates(){
//        int counter = 0;
//           for (int i = 0; i < array.length; i++){
//               for (int j = 0; j < array.length; j++){
//                   if (array[i] == array[j]){
//                       counter++;
//                   }
//               }
//           }
//           int[] dublicates = new int[counter];
//           counter = 0;
//           return dublicates;
//           for (int i = 0; i < array.length; i++){
//               for (int j = 0; j < array.length; j++){
//                   if (array[i] == array[j]){
//                       dublicates[counter] = array[j];
//                       counter++;
//                   }
//               }
//           }
//           return dublicates;
//
//        }
//
//}
