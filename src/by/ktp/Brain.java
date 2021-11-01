package by.ktp;

import lombok.Data;

@Data
public class Brain {
    private long lifeCycles = 50000000;
    public void activate() {
        //todo
    }

    public void startCycling() {
        //todo
    }

    public boolean checkTimeToCompleteCurrentLife() {
        lifeCycles--;
        return lifeCycles != 0;
    }
}
