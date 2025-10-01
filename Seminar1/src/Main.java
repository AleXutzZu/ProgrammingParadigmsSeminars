import controller.Controller;
import exception.BoxOverflowException;
import model.Apple;
import model.Book;
import model.Cake;
import repository.BoxRepo;
import repository.IBoxRepo;
import view.View;

public class Main {
    public static void main(String[] args) {
        int arraySize = View.readArraySize();
        IBoxRepo repo = new BoxRepo(arraySize);
        try {
            repo.addBox(new Book(187));
            repo.addBox(new Apple(201));
            repo.addBox(new Cake(567));
            repo.addBox(new Book(111));
            repo.addBox(new Apple(100));
            repo.addBox(new Cake(678));
        }catch(BoxOverflowException err){
            System.out.println(err.getMessage());
            return;
        }
        Controller controller = new Controller(repo);
        View view = new View(controller);
        view.displayList();
    }
}
