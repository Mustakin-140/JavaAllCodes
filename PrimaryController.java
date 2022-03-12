
package com.mycompany.simpcalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable 
{


    @FXML
    private Button btnPlus;
    @FXML
    private Button btnMinus;
    @FXML
    private Button btnMul;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btnSeven;
    @FXML
    private Button btnSix;
    @FXML
    private Button btnNine;
    @FXML
    private Button btnEight;
    @FXML
    private Button btnThree;
    @FXML
    private Button btnTwo;
    @FXML
    private Button btnFive;
    @FXML
    private Button btnFour;
    @FXML
    private Button btnOne;
    @FXML
    private Button btnResult;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnZero;
    @FXML
    private TextField display;
    
    int num,num1,num2,Result;
    String Op;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    
    
    @FXML
    private void PlusClick(ActionEvent event) 
    {
        num1 = Integer.parseInt(display.getText());
        Op = "+";
        display.setText("0");
    }

    @FXML
    private void MinusClick(ActionEvent event) 
    {
        num1 = Integer.parseInt(display.getText());
        Op = "-";
        display.setText("0");
    }

    @FXML
    private void MulClick(ActionEvent event) 
    {
        num1 = Integer.parseInt(display.getText());
        Op = "*";
        display.setText("0");
    }

    @FXML
    private void DivClick(ActionEvent event) 
    {
        num1 = Integer.parseInt(display.getText());
        Op = "/";
        display.setText("0");
    }

    @FXML
    private void SevenClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("7");
        }
        else
        {
            display.setText(display.getText()+ "7");
        }
    }

    @FXML
    private void SixClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("6");
        }
        else
        {
            display.setText(display.getText()+ "6");
        }
    }

    @FXML
    private void NineClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("9");
        }
        else
        {
            display.setText(display.getText()+ "9");
        }
    }

    @FXML
    private void EightClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("8");
        }
        else
        {
            display.setText(display.getText()+ "8");
        }
    }

    @FXML
    private void ThreeClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("3");
        }
        else
        {
            display.setText(display.getText()+ "3");
        }
    }

    @FXML
    private void TwoClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("2");
        }
        else
        {
            display.setText(display.getText()+ "2");
        }
    }

    @FXML
    private void FiveClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("5");
        }
        else
        {
            display.setText(display.getText()+ "5");
        }
    }

    @FXML
    private void FourClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("4");
        }
        else
        {
            display.setText(display.getText()+ "4");
        }
    }

    @FXML
    private void OneClick(ActionEvent event) 
    {
        num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("1");
        }
        else
        {
            display.setText(display.getText()+ "1");
        }
    }

    @FXML
    private void ResultClick(ActionEvent event) 
    {
        num2 = Integer.parseInt(display.getText());
        switch(Op)
        {
            case "+":
                Result = num1 + num2;
                break;
            case "-":
                Result = num1 - num2;
                break;
            case "*":
                Result = num1 * num2;
                break;
            case "/":
                Result = num1 / num2;
                break;
                
        }
        display.setText(String.valueOf(num1 + Op + num2 + "="+ Result));
    }

    @FXML
    private void ClearClick(ActionEvent event) 
    {
        display.setText("0");
    }

    @FXML
    private void ZeroClick(ActionEvent event)
    {
         num = Integer.parseInt(display.getText());
        if(num == 0)
        {
            display.setText("0");
        }
        else
        {
            display.setText(display.getText()+ "0");
        }
    }

}
