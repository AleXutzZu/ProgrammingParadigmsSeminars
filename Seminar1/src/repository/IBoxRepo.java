package repository;

import exception.BoxOverflowException;
import model.IBox;

public interface IBoxRepo {

    void addBox(IBox box) throws BoxOverflowException;
    IBox[] returnBoxes();

    int getBoxSize();
}
