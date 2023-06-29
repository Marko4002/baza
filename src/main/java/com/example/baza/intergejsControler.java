package com.example.baza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class intergejsControler {
    @FXML
    private TextField ime;
    @FXML
    private TextField broj;
    @FXML
    private TextField sprema;
    @FXML
    private Button dodajK;
    @FXML
    private Button izbrisiK;
    @FXML
    private Button izmeniK;
    @FXML
    private Button povezi;
    @FXML
    private Button dodajS;
    @FXML
    private Button izbrisiS;

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    kandidat kan= null;
    kvallifikacija kval = null;

    @FXML
    public void dodajK(ActionEvent ae) throws SQLException {
        kan = new kandidat();
        kan.setIme(ime.getText());
        kan.setTel(broj.getText());


        try {

            con = DBUtil.getConnection();
            String sql = "INSERT INTO kandidat(ime, tel) VALUES(?,?";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, kan.getIme());
            pstmt.setString(2, kan.getTel());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBUtil.closeConnection(con);
        //    System.out.println(emp.getSalary()+"...........");
    }



    @FXML
    public void izmeniK(ActionEvent ae) throws SQLException {

    }
    @FXML
    public void izbrisiK(ActionEvent ae) throws SQLException {

    }
    @FXML
    public void povezi(ActionEvent ae) throws SQLException {

    }
    @FXML
    public void dodajS(ActionEvent ae) throws SQLException {

    }
    @FXML
    public void izbrisiS(ActionEvent ae) throws SQLException {

    }

}