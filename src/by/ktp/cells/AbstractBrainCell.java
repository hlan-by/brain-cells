package by.ktp.cells;

import by.ktp.connectors.Connector;
import lombok.Data;

import java.util.List;

@Data
public class AbstractBrainCell {
    private long id;
    private List<Connector> cellConnectors;
}
