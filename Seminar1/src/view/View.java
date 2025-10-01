package view;

import controller.Controller;
import model.IBox;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void displayList(){
        List<IBox> lst = controller.filterItems();
        for(IBox box : lst){
            System.out.println(box);
        }
    }

    public static int readArraySize(){
        Scanner sc = new Scanner(System.in);
        int size;
        while(true){
            try {
                System.out.print("Enter array size : ");
                size = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Please enter an integer");
                sc = new Scanner(System.in);
            }
        }
        return size;
    }


}
