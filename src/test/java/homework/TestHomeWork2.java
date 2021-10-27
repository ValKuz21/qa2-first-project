package homework;

import org.junit.Test;

public class TestHomeWork2 {
    public float calculationFuel(float fuelPer100km, float distance) {
        float fuelPer1km;
        fuelPer1km = fuelPer100km / 100;
        float result = fuelPer1km * distance;

        return result;
    }

    public float predictDistance(float fuelPer100km, float fuelWhatWeHave) {
        float fuelPer1Km = fuelPer100km / 100;
        float result = fuelWhatWeHave / fuelPer1Km;

        return result;
    }

    @Test
    public void test() {
        float consumption = calculationFuel(10, 2000);
        float distanceForCarB = predictDistance(10, consumption);
        float distanceForCarC = predictDistance(3, consumption);
        float distanceForCarD = predictDistance(6, consumption);
        float distanceForCarE = predictDistance(13, consumption);


        System.out.println("Available fuel: " + consumption + " l");
        System.out.println("Car B " + distanceForCarB + " km");
        System.out.println("Car C " + distanceForCarC + " km");
        System.out.println("Car D " + distanceForCarD + " km");
        System.out.println("Car E " + distanceForCarE + " km");
    }
}
