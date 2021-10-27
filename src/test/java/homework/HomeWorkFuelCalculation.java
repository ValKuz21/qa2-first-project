package homework;

import org.junit.jupiter.api.Test;

public class HomeWorkFuelCalculation {
    public float fuelCalculation(float consumptionPer100Km, float distance) {
    float consumptionPer1Km = consumptionPer100Km / 100;
    float result = consumptionPer1Km * distance;

    return result;
    }

    @Test
    public void test(){
        float consumption = fuelCalculation(12, 650);

        System.out.println(consumption);
    }
}
