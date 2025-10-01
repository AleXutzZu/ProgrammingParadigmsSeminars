package controller;

import model.IBox;
import repository.BoxRepo;
import repository.IBoxRepo;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public IBoxRepo boxRepo;

    public Controller(IBoxRepo boxRepo) {
        this.boxRepo = boxRepo;
    }

    public List<IBox> filterItems()
    {
        List<IBox> result = new ArrayList<>();
        IBox[] boxes = this.boxRepo.returnBoxes();
        for (int i  = 0; i < boxRepo.getBoxSize(); i++) {
            if (boxes[i].getWeight() > 200){
                result.add(boxes[i]);
            }
        }

        return result;
    }
}
