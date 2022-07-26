package com.github.goodfatcat.alishev.greedyalgorithms;

// У машины бак 400 киломестров нужно пройти до точки b 950 километров.
// станции 1-я 200 км 2-я 375 км 3-я 550 км 4-я 750 км
public class GasStation {
    public static void main(String[] args) {
        Car car = new Car();
        int max = 0;

        while (car.getTravelled() != Stations.STATION5.getDistance()) {
            System.out.println(car.getTravelled());
            for (Stations stations : Stations.values()) {
                int distance = stations.getDistance();
                if (max < distance
                        && car.getTravelled() + car.getGas() > distance) {
                    max = distance;
                }
            }
            car.setTravelled(max);
        }
        System.out.println(car.getTravelled());
    }
}

class Car {
    private int gas = 400;
    private int travelled = 0;
    public void Refuel() {
        gas = 400;
    }

    public int getGas() {
        return gas;
    }

    public void setTravelled(int travelled) {
        this.travelled = travelled;
    }

    public int getTravelled() {
        return travelled;
    }
}
enum Stations {

    STATION1(200),
    STATION2(375),
    STATION3(550),
    STATION4(750),
    STATION5(950);

    private final int distance;

    Stations(int value) {
        distance = value;
    }

    public int getDistance() {
        return distance;
    }
}
