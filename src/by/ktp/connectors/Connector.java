package by.ktp.connectors;

import lombok.Data;

@Data
public class Connector {
    private int id;
    private int signalCollectedLevel;
    private int signalRequiredLevel;
    private int inputSignalValue;
    private int outputSignalValue;
    private long xCoordinate;
    private long yCoordinate;
    private long zCoordinate;

}
