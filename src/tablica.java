public class tablica {
        private static void printArray(int[] anArray) {
            for (int i = 0; i < anArray.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(anArray[i]);
            }

        }
}
