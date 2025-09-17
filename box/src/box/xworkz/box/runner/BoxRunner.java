package box.xworkz.box.runner;

import box.xworkz.box.Box;
import box.xworkz.box.imply.BoxImply;

import box.xworkz.box.BoxType;

import static box.xworkz.box.BoxType.STEEL;

public class BoxRunner {
    public static void main(String[] args) {
        Box box=new BoxImply();
        box.boxDesign();
        box.noOfOrders();
        box.boxType(STEEL);
    }
}
