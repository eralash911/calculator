/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEXP
 */
public class Calculator {
    private Calculator(){}
 
    public static double calculate(int number1, int number2, char operation){
        int result = 0;
        switch (operation){
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/': result = number1 / number2; break;
            default:throw  new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
 
}