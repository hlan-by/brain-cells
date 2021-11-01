package by.ktp;

import by.ktp.cells.AbstractBrainCell;
import by.ktp.cells.Afferent;
import by.ktp.connectors.Connector;
import lombok.Data;

import java.util.List;

@Data
public class Brain {
    private long lifeCycles = 378_691_200_000L;

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

    public void addAfferentBrainCell(List<Connector> connectors) {
        AbstractBrainCell eyeBeanAfferent = new Afferent();
        eyeBeanAfferent.addAllConnectors(connectors);
    }
}
