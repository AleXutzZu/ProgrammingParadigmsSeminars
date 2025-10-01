package repository;

import exception.BoxOverflowException;
import model.IBox;

public class BoxRepo implements IBoxRepo {

    int size;
    IBox[] boxes;
    int position;

    public BoxRepo(int size) {
        this.size = size;
        boxes = new IBox[size];
        position = 0;
    }

    @Override
    public void addBox(IBox box) throws BoxOverflowException {
        if (this.position < this.size) {
            this.boxes[position++] = box;
        } else {
            throw new BoxOverflowException("Box array overflow");
        }
    }

    @Override
    public IBox[] returnBoxes() {
        return this.boxes;
    }

    @Override
    public int getBoxSize() {
        return this.position;
    }
}
