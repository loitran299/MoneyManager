package com.oop.moneymanager.view;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class AddDailyPopup extends BaseView implements Initializable {
    @FXML
    private JFXComboBox<String> cbKindOfTime;

    @FXML
    private Label lbDateView;

    @FXML
    private ListView<Pane> listViewStatistic;

    @FXML
    void onActionKindOfTime(ActionEvent event) {

    }

    @FXML
    void onClickAddStatistic(MouseEvent event) {

    }

    @FXML
    void onClickForward(MouseEvent event) {

    }

    @FXML
    void onClickBackward(MouseEvent event) {


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
