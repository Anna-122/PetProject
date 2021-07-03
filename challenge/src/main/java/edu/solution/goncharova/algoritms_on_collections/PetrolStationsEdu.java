package edu.solution.goncharova.algoritms_on_collections;

public class PetrolStationsEdu {

   static int[] values = new int[] { 3, 16, 5, 4, 15, 10, 12, 8 };
   static int coordinatesOfEachStation[];

    public static void main(String[] args) {

            int i = 0;
            int startingPoint = values[i];
            i++;
            int endPoint = values[i];
            i++;
            int numOfKm = values[i];
            i++;
            int numOfStation = values[i];
            i++;
            coordinatesOfEachStation = new int[numOfStation];
            int count =0;
            for(;i<values.length;i++) {
               coordinatesOfEachStation[count] = values[i];
               count++;
            }
            int carPoint = startingPoint;
            int petrolPretender;
            int stopStationCount =0;

            int carFuelDestination = 0;
            while ((carPoint+numOfKm) < endPoint) {
                carFuelDestination = carPoint + numOfKm;
                petrolPretender = carPoint;
                for( i =0; i < coordinatesOfEachStation.length; i++) {
                        if (coordinatesOfEachStation[i] <= carFuelDestination) {
                            if (coordinatesOfEachStation[i] > petrolPretender) {
                                petrolPretender = coordinatesOfEachStation[i];
                            }
                        }
                }

                if(petrolPretender == carPoint){
                    System.out.println(-1);
                    break;
                }
               // System.out.println(petrolPretender);
                carPoint = petrolPretender;
                stopStationCount++;
            }
            System.out.println("общие количество остановок "+stopStationCount);
    }
}



