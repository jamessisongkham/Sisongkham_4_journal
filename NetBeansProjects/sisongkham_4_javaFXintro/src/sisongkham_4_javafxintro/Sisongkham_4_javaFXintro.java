/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisongkham_4_javafxintro;

import javafx.application.Application;
import static javafx.beans.binding.Bindings.length;
import javafx.scene. Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author jamessisongkham
 */
public class Sisongkham_4_javaFXintro extends Application {
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawSomeCircle(gc);
        //drawSomecircle
        //drawShapes(gc);
        root.getChildren() .add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    private void drawSomeCircle(GraphicsContext gc) {
     
        gc.setEffect(null);
        gc.beginPath();
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.LIGHTGREY);
        gc.setLineWidth(130);
        gc.strokeLine(45, 180, 180, 40);
        gc.fillOval(85, 85, 35, 350);
        gc.setLineDashes();
        
        
        
        gc.fillPolygon(new double[]{10, 20, 20, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{80, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140,},
                          new double[]{210, 210, 240, 240}, 4);
         
        
                }
    }  
  
                
                
                
                
                
                
        
        
        
    
   
        
        
       
            
  
