package Tehtava2;

import Tehtava2.Factory.AFactory;
import Tehtava2.Factory.BFactory;
import Tehtava2.Factory.UIFactory;
import Tehtava2.button.Button;
import Tehtava2.checkbox.Checkbox;
import Tehtava2.textfield.TextField;

public class Main {
    public static void main(String[] args) {

        UIFactory factoryA = new AFactory();
        UIFactory factoryB = new BFactory();

        Button buttonA = factoryA.createButton("Enter");
        TextField textFieldA= factoryA.createTextfield("Username");
        Checkbox checkboxA = factoryA.createCheckbox("F");

        Button buttonB = factoryA.createButton("Enter");
        TextField textFieldB = factoryA.createTextfield("Username");
        Checkbox checkboxB = factoryA.createCheckbox("F");

        System.out.println("\n---AFactory---\n");
        buttonA.display();
        textFieldA.display();
        checkboxA.display();


        buttonA.setText("Hyväksyä");
        textFieldA.setText("Maksuehdot");
        checkboxA.setText("Hyväksyn ehdot");

        System.out.println("\n---------\n");

        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        System.out.println("\n---BFactory---\n");
        buttonB.display();
        textFieldB.display();
        checkboxB.display();


        buttonB.setText("Hyväksyä");
        textFieldB.setText("Maksuehdot");
        checkboxB.setText("Hyväksyn ehdot");

        System.out.println("\n---------\n");

        buttonB.display();
        textFieldB.display();
        checkboxB.display();



    }
}
