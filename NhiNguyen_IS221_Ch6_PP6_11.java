/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch6_PP6_11
   Author:   Nhi Nguyen
   Date:     Mar 8, 2023
   Language: Java
   Purpose:  The purpose of this program is to write a JavaFX application that
             draws 20 horizontal, evenly spaced parallel lines of random length.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Mar 8, 2023
   Desc.:    This is the original version of the code.  
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch6_pp6_11;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class NhiNguyen_IS221_Ch6_PP6_11 extends Application {
    // Constant height of the window
    private static final int int_HEIGHT = 400;
    // Number of lines to draw
    private static final int int_NUM_LINES = 20; 
    // Maximum length of a line
    private static final int int_LINE_LENGTH_MAX = 400; 
    // Distance between lines
    private static final int int_LINE_SPACING = int_HEIGHT / (int_NUM_LINES + 1);
    
    @Override
    public void start(Stage primaryStage) {
        Random randomGenerator = new Random();
        Group grpMyGroup = new Group();
        Scene MyScene = new Scene(grpMyGroup, 500, int_HEIGHT);
        
        for (int i = 1; i < int_NUM_LINES + 1; i++) {
            // Generate random line length
            int int_LineLength = randomGenerator.nextInt(int_LINE_LENGTH_MAX) + 21;
            
            // Create the line with black color and a width of 2
            Line MyLine = new Line(20, i * int_LINE_SPACING, int_LineLength, 
                    i * int_LINE_SPACING);
            MyLine.setStroke(Color.BLACK);
            MyLine.setStrokeWidth(2);
            
            // Add all the lines to the group
            grpMyGroup.getChildren().add(MyLine);
        }
        
        primaryStage.setTitle("20 lines with random length");
        primaryStage.setScene(MyScene);
        primaryStage.show();
    }    
    
    public static void main(String[] args) {
        launch(args);
    }

}
