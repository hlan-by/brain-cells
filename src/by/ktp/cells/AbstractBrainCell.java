package by.ktp.cells;

import by.ktp.connectors.Connector;
import lombok.Data;

import java.util.List;

@Data
public class AbstractBrainCell {
    private long id;
    private List<Connector> cellConnectors;

    public void addConnector(Connector connector) {
        cellConnectors.add(connector);
    }

    public void addAllConnectors(List<Connector> connectors) {
        for (Connector currentConnector : connectors) {
            addConnector(currentConnector);
        }
    }
}
