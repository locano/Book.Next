/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.jfoenix.controls.JFXToggleNode;
import de.jensd.fx.fontawesome.Icon;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author jcdur
 */
public class mainToolbar extends Pane{
    
    double width, height;
    public static String style, title;
    private JFXToggleNode hamburger, close;
    public static Label lblTitle;
    
    public mainToolbar(double width, double height, String style, String title){
        this.width = width;
        this.height = height;
        this.style = style;
        this.title = title;
        this.hamburger = new JFXToggleNode();
        this.close  = new JFXToggleNode();
        
    }
    
    public void createToolbar()
    {
        this.setWidth(width);
        this.setHeight(height);
        this.setStyle(style);
        this.setMinHeight(height);
        this.setEffect(new DropShadow(5d, 0d, +2d, Color.GRAY));
        //this.setAlignment(Pos.CENTER_LEFT);
        setHamburger();
        setTitle();
        setClose();

    }
    
    public void setHamburger()
    {
        Icon value = new Icon("BARS", "2em");
        value.setTextFill(Color.WHITE);
        value.setPrefSize(30, 30);
        value.setAlignment(Pos.CENTER);
        hamburger.setGraphic(value);
        hamburger.setStyle("-fx-background-radius: 4em; -fx-background-color:TRANSPARENT;");
        hamburger.setPrefSize(60, 60);
        hamburger.relocate(0, 0);
        this.getChildren().add(hamburger);
    }
    
    public void setClose()
    {   
        Icon value = new Icon("CLOSE", "2em");
        value.setTextFill(Color.WHITE);
        value.setPrefSize(30, 30);
        value.setAlignment(Pos.CENTER);
        close.setGraphic(value);
        close.setStyle("-fx-background-radius: 4em; -fx-background-color:TRANSPARENT;");
        close.setPrefSize(60, 60);
        close.relocate(1050, 0);
        this.getChildren().add(close);
    }
    
    public void setTitle()
    {
        lblTitle = new Label(title);
        lblTitle.setMinHeight(50);
        lblTitle.setAlignment(Pos.TOP_CENTER);
        lblTitle.setTextFill(Color.web("#FFFFFF"));
        lblTitle.setStyle("-fx-font-size: 22; -fx-padding: 12 0 0 0;");
        lblTitle.relocate(70, 5);
        this.getChildren().add(lblTitle);
    }
    
    public JFXToggleNode getHamburger()
    {
        return this.hamburger;
    }
    
    public JFXToggleNode getClose()
    {
        return this.close;
    }
}
