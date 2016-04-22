package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.MotionBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.WHITE;

public class YinYang extends Application {
    private double x_coordinate = 0;
    private double y_coordinate = 0;

    public static void main( String[] args ) {
        launch();
    }

    public void start(Stage stage) {
        Group root = new Group();
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                x_coordinate = event.getSceneX();
                y_coordinate = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - x_coordinate);
                stage.setY(event.getScreenY() - y_coordinate);
            }
        });
        Canvas canvas = new Canvas( 630, 600 );
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Rectangle blackRec = new Rectangle( canvas.getWidth(), canvas.getHeight() );
        blackRec.setFill( Color.web( "black", 0.9 ));

        Rectangle whiteRec = new Rectangle( 580, 550,
                new LinearGradient( 1f, 1f, 0f, 0f, true, CycleMethod.NO_CYCLE,
                        new Stop( 1, Color.web( "black", 0.9 ) ),
                        new Stop(0.85, Color.web( "white",0.9 )),
                        new Stop(0.71, Color.web( "black",0.9 )),
                        new Stop(0.57, Color.web( "white",0.9 )),
                        new Stop(0.43, Color.web( "black",0.9 )),
                        new Stop(0.28,Color.web( "white",0.9 )),
                        new Stop(0.14, Color.web( "black",0.9 )),
                        new Stop( 0, Color.web( "white", 0.9 ) ) ));
        whiteRec.setEffect( new GaussianBlur(  ) );
        whiteRec.setX( 23 );
        whiteRec.setY( 24 );

        Rectangle colors = new Rectangle( 550, 520,
                new LinearGradient( 0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop( 0, Color.web( "white", 0.9 ) ),
                        new Stop(0.14, Color.web( "black",0.9 )),
                        new Stop(0.28,Color.web( "white",0.9 )),
                        new Stop(0.43, Color.web( "black",0.9 )),
                        new Stop(0.57, Color.web( "white",0.9 )),
                        new Stop(0.71, Color.web( "black",0.9 )),
                        new Stop(0.85, Color.web( "white",0.9 )),
                        new Stop( 1, Color.web( "black", 0.9 ) ) ) );
        colors.setEffect( new GaussianBlur(  ) );
        colors.setX( 37 );
        colors.setY( 38 );

        Rectangle recThree = new Rectangle( 510, 480,
                new LinearGradient( 1f, 1f, 0f, 0f, true, CycleMethod.NO_CYCLE, new Stop( 0, Color.web( "white", 0.9 ) ),
                        new Stop(0.14, Color.web( "black",0.9 )),
                        new Stop(0.28,Color.web( "white",0.9 )),
                        new Stop(0.43, Color.web( "black",0.9 )),
                        new Stop(0.57, Color.web( "white",0.9 )),
                        new Stop(0.71, Color.web( "black",0.9 )),
                        new Stop(0.85, Color.web( "white",0.9 )),
                        new Stop( 1, Color.web( "black", 0.9 ) ) ) );
        recThree.setEffect( new GaussianBlur(  ) );
        recThree.setX( 57 );
        recThree.setY( 58 );

        Rectangle recFour = new Rectangle( 470, 440,
                new LinearGradient( 0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop( 0, Color.web( "white", 0.9 ) ),
                        new Stop(0.14, Color.web( "black",0.9 )),
                        new Stop(0.28,Color.web( "white",0.9 )),
                        new Stop(0.43, Color.web( "black",0.9 )),
                        new Stop(0.57, Color.web( "white",0.9 )),
                        new Stop(0.71, Color.web( "black",0.9 )),
                        new Stop(0.85, Color.web( "white",0.9 )),
                        new Stop( 1, Color.web( "black", 0.9 ) ) ) );
        recFour.setEffect( new GaussianBlur(  ) );
        recFour.setX( 78 );
        recFour.setY( 79 );

        Circle circle = new Circle( 313, 305, 165 );
        circle.setFill( Color.web( "white" ) );
        circle.setStrokeType( StrokeType.OUTSIDE );
        circle.setStroke(Color.web( "white",0.9 ));
        circle.setStrokeWidth( 5 );
        circle.setEffect( new GaussianBlur() );

        Circle circleTwo = new Circle( 313, 305, 175 );
        circleTwo.setFill( Color.web( "white",0 ) );
        circleTwo.setStrokeType( StrokeType.OUTSIDE );
        circleTwo.setStroke(Color.web( "black" ));
        circleTwo.setStrokeWidth( 5 );
        circleTwo.setEffect( new GaussianBlur() );

        Circle circleThree = new Circle( 313, 305, 155 );
        circleThree.setFill( Color.BLACK );
        circleThree.setStrokeType( StrokeType.OUTSIDE );
        circleThree.setStroke(Color.web( "black",0.9 ));
        circleThree.setStrokeWidth( 5 );
        circleThree.setEffect( new GaussianBlur() );

        Text yin = new Text( "阴" );
        yin.setX( 50 );
        yin.setY( 135 );
        yin.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yin.setFill( WHITE );
        yin.setStrokeType( StrokeType.OUTSIDE );
        yin.setStroke(Color.web( "black",0.70 ));
        yin.setStrokeWidth(5);
        yin.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text yang = new Text( "阳" );
        yang.setX( 50 );
        yang.setY( 255 );
        yang.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yang.setFill( WHITE );
        yang.setStrokeType( StrokeType.OUTSIDE );
        yang.setStroke(Color.web( "black",0.70 ));
        yang.setStrokeWidth(5);
        yang.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text liang = new Text( "两" );
        liang.setX( 50 );
        liang.setY( 355 );
        liang.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        liang.setFill( WHITE );
        liang.setStrokeType( StrokeType.OUTSIDE );
        liang.setStroke(Color.web( "black",0.70 ));
        liang.setStrokeWidth(5);
        liang.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text yi = new Text( "仪" );
        yi.setX( 50 );
        yi.setY( 455 );
        yi.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yi.setFill( WHITE );
        yi.setStrokeType( StrokeType.OUTSIDE );
        yi.setStroke(Color.web( "black",0.70 ));
        yi.setStrokeWidth(5);
        yi.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text qian = new Text( "乾" );
        qian.setX( 495 );
        qian.setY( 135 );
        qian.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        qian.setFill( WHITE );
        qian.setStrokeType( StrokeType.OUTSIDE );
        qian.setStroke(Color.web( "black",0.70 ));
        qian.setStrokeWidth(5);
        qian.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text kun = new Text( "坤" );
        kun.setX( 495 );
        kun.setY( 255 );
        kun.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        kun.setFill( WHITE );
        kun.setStrokeType( StrokeType.OUTSIDE );
        kun.setStroke(Color.web( "black",0.70 ));
        kun.setStrokeWidth(5);
        kun.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text ba = new Text( "八" );
        ba.setX( 495 );
        ba.setY( 355 );
        ba.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        ba.setFill( WHITE );
        ba.setStrokeType( StrokeType.OUTSIDE );
        ba.setStroke(Color.web( "black",0.70 ));
        ba.setStrokeWidth(5);
        ba.setEffect( new MotionBlur( 90.0f,5.0f ) );
        Text gua= new Text( "卦" );
        gua.setX( 495 );
        gua.setY( 455 );
        gua.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        gua.setFill( WHITE );
        gua.setStrokeType( StrokeType.OUTSIDE );
        gua.setStroke(Color.web( "black",0.70 ));
        gua.setStrokeWidth(5);
        gua.setEffect( new MotionBlur( 90.0f,5.0f ) );



        Arc arcOne = new Arc(313, 305,150, 150, 90, 180);
        arcOne.setType( ArcType.OPEN );
        arcOne.setFill( WHITE );
        arcOne.setEffect( new GaussianBlur(  ) );

        Arc arcTwo = new Arc( 313, 305, 150, 150, 270, 180);
        arcTwo.setType( ArcType.OPEN );
        arcTwo.setFill( BLACK );
        arcTwo.setEffect( new GaussianBlur(  ) );

//        Arc arcThree = new Arc( 313, 380,75,75,90,180 );
//        arcThree.setType( ArcType.OPEN );
//        arcThree.setFill( BLACK);
//        arcThree.setEffect( new GaussianBlur(  ) );

//        Arc arcFour = new Arc( 313, 230,75,75,270,180 );
//        arcFour.setType( ArcType.OPEN );
//        arcFour.setFill( WHITE);
//        arcFour.setEffect( new GaussianBlur(  ) );

        Circle gapCircleOne = new Circle( 77.5, Color.WHITE );
        gapCircleOne.setCenterX( 313 );
        gapCircleOne.setCenterY( 230 );
        gapCircleOne.setEffect( new GaussianBlur(  ) );

        Circle gapCircleTwo = new Circle( 77.5, Color.BLACK );
        gapCircleTwo.setCenterX( 313 );
        gapCircleTwo.setCenterY( 380 );
        gapCircleTwo.setEffect( new GaussianBlur(  ) );

        Circle smallCircleOne = new Circle( 20 , Color.BLACK);
        smallCircleOne.setCenterX( 313 );
        smallCircleOne.setCenterY( 230 );
        smallCircleOne.setEffect( new GaussianBlur(  ) );

        Circle smallCircleTwo = new Circle( 20 , Color.WHITE);
        smallCircleTwo.setCenterX( 313 );
        smallCircleTwo.setCenterY( 380 );
        smallCircleTwo.setEffect( new GaussianBlur(  ) );


//        gc.setFill(WHITE);
//        gc.fillArc( 163, 155, 300, 300, 90, 180, ArcType.OPEN );
//
//        gc.setFill(BLACK);
//        gc.fillArc( 163, 155, 300, 300, 270, 180, ArcType.OPEN );
//
//        gc.fillArc( 238, 305, 150, 150, 90, 180, ArcType.OPEN );
//
//        gc.setFill(WHITE);
//        gc.fillArc( 238, 155, 150, 150, 270, 180, ArcType.OPEN );
//        gc.setFill(Color.web( "white",0.95 ));

//        gc.setFill( WHITE );
//        gc.fillOval( 298, 355, 40, 40 );
//        gc.setFill(BLACK);
//        gc.fillOval( 298, 205, 40, 40 );

//        root.getChildren().add( blackRec );
//        root.getChildren().add( whiteRec );
//        root.getChildren().add(colors);
//        root.getChildren().add( recThree );
        root.getChildren().addAll( blackRec,whiteRec,colors, recThree,recFour,
                circleTwo,circle,circleThree,
                yin,yang,liang,yi,qian,kun,ba,gua,
                arcOne, arcTwo,gapCircleOne, gapCircleTwo, smallCircleOne, smallCircleTwo);

        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        stage.initStyle( StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
}
