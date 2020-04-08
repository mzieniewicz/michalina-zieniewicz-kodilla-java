package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getusername();

        if(result.equals("theForumUser")){
        System.out.println("test OK");}
        else{
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy: ");

        Calculator calculator = new Calculator(3, 7);

        Integer addResult = calculator.add();
        Integer aAddB = 3+7;
        if(addResult.equals(aAddB)){
            System.out.println("addition test OK");
        }
        else{
            System.out.println("Error!");
        }
        Integer substractResult = calculator.substract();
        Integer aSubstractB = 3-7;
        if(substractResult.equals(aSubstractB)){
            System.out.println("subtraction test OK");
        }
        else{
            System.out.println("Error!");
        }

    }
}
