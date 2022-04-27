package com.calculadora.controlador;

import com.calculadora.modelo.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controlador {

    @FXML
    private TextField op2;
    @FXML
    private TextField op1;
    @FXML
    private TextField signo;
    @FXML
    private Button sumar;
    @FXML
    private Button restar;
    @FXML
    private Button multiplicar;
    @FXML
    private Button dividir;
    @FXML
    private Button borrar;
    @FXML
    private TextField resul;


    @FXML
    public void onDividir(ActionEvent actionEvent) {
        calcular("/");
    }

    @FXML
    public void onRestar(ActionEvent actionEvent) {
        calcular("-");
    }

    @FXML
    public void onMultiplicar(ActionEvent actionEvent) {
        calcular("x");
    }

    @FXML
    public void onSumar(ActionEvent actionEvent) {
        calcular("+");
    }

    @FXML
    public void onBorrar(ActionEvent actionEvent) {
        op1.setText("");
        op2.setText("");
        resul.setText("BORRADO NENA");
    }


    //Caculos
    Calculadora cal = new Calculadora();


    private void calcular(String tipo) {
        if ((op1.getText() != "") && (op2.getText() != "")) {
            cal.setOp1(Float.parseFloat(op1.getText()));
            cal.setOp2(Float.parseFloat(op2.getText()));
            cal.setResul(operacion(cal.getOp1(), cal.getOp2(), tipo));
            resul.setText((cal.getResul().toString()));
        }
    }


    public Float operacion(Float op1, Float op2, String operacion) {
        switch (operacion) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "/":
                return op1 / op2;
            case "x":
                return op1 * op2;
            default:
                return null;
        }
    }
}