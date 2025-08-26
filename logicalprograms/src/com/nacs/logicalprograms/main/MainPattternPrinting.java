package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.PatternPrinting;

public class MainPattternPrinting {

    public static void main(String[] args) {

       
        PatternPrinting squarePattern = new PatternPrinting();
        squarePattern.setRow(5); 

        
        PatternPrinting trianglePattern = new PatternPrinting();
        trianglePattern.setRow(5);

        
        System.out.println("\n Square Pattern ");
        squarePattern.printSquare();

        System.out.println("\n Hollow Square Pattern ");
        squarePattern.printHollow();

        System.out.println("\n Square with Row-wise Letters and Digits ");
        squarePattern.printSquareWithRowWiseLettersAndDigits();

        System.out.println("\n Square with Continuous Letters and Digits ");
        squarePattern.printSquareWithContinuousLettersAndDigits();

        System.out.println("\n Alternating Row Letter-Digit Square ");
        squarePattern.printAlternatingRowLetterDigitSquare();

        System.out.println("\n Checkerboard Letter-Digit Square ");
        squarePattern.printCheckerboardLetterDigitSquare();


        
        System.out.println("\n print Alternating Letter Digit Square Pattern ");
        trianglePattern.printAlternatingLetterDigitSquarePattern();

        System.out.println("\n Inverted Right-Angle Triangle");
        trianglePattern.printInvertedRightAngleTriangle();

        System.out.println("\n UpSideDownleft-aligned inverted triangle.");
        trianglePattern.UpSideDownleftAlignedInvertedTriangle();

        System.out.println("\n Right-Aligned Triangle with Spacing ");
        trianglePattern.printRightAlignedTriangleWithSpacing();

        System.out.println("\n PyramidPattern Triangle ");
        trianglePattern.printPyramidPatternTriangle();

        System.out.println("\n PyramidPatternTriangle \r\n");
        trianglePattern.PyramidPatternTriangle();

        System.out.println("\n Up-Side Down Triangle");
        trianglePattern.printUpSideDownTriangle();


        
        System.out.println("\nCentered number and letter Triangle without Space PyramidPattern  ");
        trianglePattern.NumberAndLetterTriangleWithoutSpacePyramidPattern();

        System.out.println("\n Centered number and letter Triangle without Space PyramidPattern ");
        trianglePattern.printRightAlignedNumberAndLetterTriangleWithOutSpace();

        System.out.println("\n Centered number and letter Triangle with Space ");
        trianglePattern.printCenteredNumberAndLetterTriangleWithSpace();

        System.out.println("\n Centered Mixed Triangle Pattern (Letters & Digits) ");
        trianglePattern.printCenteredMixedTriangleWithPattern();


      
    }
}
