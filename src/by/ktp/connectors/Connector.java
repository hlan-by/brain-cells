package by.ktp.connectors;

import lombok.Data;

@Data
public class Connector {
    private int id;
    private int signalCollectedLevel;

    public Connector(int id, int signalRequiredLevel, long xCoordinate, long yCoordinate, long zCoordinate) {
        this.id = id;
        this.signalRequiredLevel = signalRequiredLevel;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    private int signalRequiredLevel;
    private int inputSignalValue;
    private int outputSignalValue;
    private long xCoordinate;
    private long yCoordinate;
    private long zCoordinate;

}
