package edu.solution.goncharova.calories;

public class Calories {

    private static final float PROTEIN_KCAL_G = 4.1f;
    private static final float FATS_KCAL_G = 9.3f;
    private static final float CARBOHYDRATES_KCAL_G = 4.1f;
    private static final int TERMINATION_NUMBER = -1;
    static int array[] = {1,20,0,15,3,0,1,5,2,5,3,6,-1,1,10,2,15,1,30,3,5,-1};

    public static void main(String[] args) {

        calculateAmountOfKilocaloriesInAProduct();
    }

    public static void calculateAmountOfKilocaloriesInAProduct() {
        int i = 0;
        int count = 1;
        while (array[i] != TERMINATION_NUMBER) {
            i = i + 4;
            count++;
        }
        //  System.out.println(count);
        float[] arrayRes = new float[count];
        float[] arraySum = new float[count];

        i = 0;
        while (array[i] != TERMINATION_NUMBER) {
            int id = array[i];
            int protein = array[i + 1];
            int fat = array[i + 2];
            int carbohydrate = array[i + 3];
            i = i + 4;
            float kCalG = protein * PROTEIN_KCAL_G + fat * FATS_KCAL_G + carbohydrate * CARBOHYDRATES_KCAL_G;
            // System.out.println(id + " " + kCalG);
            arrayRes[id] = kCalG;
        }

        i++;
        while (array[i] != TERMINATION_NUMBER) {
            int id = array[i];
            int grams = array[i + 1];
            i = i + 2;
            arraySum[id] = arraySum[id] + (grams * arrayRes[id]);
        }

        float totalOutput = 0;
        for (float element : arraySum) {
            totalOutput += element;
        }
        System.out.println(totalOutput);
    }
}






























//    private static final float PROTEIN = 4.1f;
//    private static final float FATS = 9.3f;
//    private static final float CARBOHYDRATES = 4.1f;
//    private static final int TERMINATION_NUMBER = -1;
//    static Scanner input = new Scanner(System.in);
//    static float array[] = new float[4];
//    static float result = 0;
//
//    public static void main(String[] args) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt(); ///Save element to first position.
//            System.out.println("values " + array[i]); //Get the element from the first position.
//        }
//
//        calculateAmountOfKilocaloriesInAProduct();
//    }
//
//    public static float calculateAmountOfKilocaloriesInAProduct() {
//
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[1]) {
//                array[1] = array[1] * PROTEIN;
//                array[2] = array[2] * FATS;
//                array[3] = array[3] * CARBOHYDRATES;
//                result = array[1] + array[2] + array[3];
//            }
//        }
//        System.out.println(result);
//        return result;
//    }


