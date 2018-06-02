package Test;

import BusinessService.RotationService;
import BusinessService.SnailService;
import Main.Matrix;
import junit.framework.TestCase;

public class Test extends TestCase {
    public void testSnail3x3Array() {
        Matrix matrix = new Matrix(3, 3);
        matrix.setData('1', 0, 0);
        matrix.setData('2', 0, 1);
        matrix.setData('3', 0, 2);
        matrix.setData('4', 1, 0);
        matrix.setData('5', 1, 1);
        matrix.setData('6', 1, 2);
        matrix.setData('7', 2, 0);
        matrix.setData('8', 2, 1);
        matrix.setData('9', 2, 2);


        char[] output = {'1', '2', '3', '6', '9', '8', '7', '4', '5'};
        int length = matrix.getRowCount();
        int length1 = matrix.getColCount();

        char[] fromMethod = SnailService.snailMatrix(matrix);
        for (int i = 0; i < length * length1; i++) {
            assertEquals(output[i], fromMethod[i]);
        }
    }


    public void testRotation3x3Array() {
        Matrix matrix = new Matrix(3, 3);
        matrix.setData('1', 0, 0);
        matrix.setData('2', 0, 1);
        matrix.setData('3', 0, 2);
        matrix.setData('4', 1, 0);
        matrix.setData('5', 1, 1);
        matrix.setData('6', 1, 2);
        matrix.setData('7', 2, 0);
        matrix.setData('8', 2, 1);
        matrix.setData('9', 2, 2);

        Matrix output = new Matrix(3, 3);
        output.setData('3', 0, 0);
        output.setData('6', 0, 1);
        output.setData('9', 0, 2);
        output.setData('2', 1, 0);
        output.setData('5', 1, 1);
        output.setData('8', 1, 2);
        output.setData('1', 2, 0);
        output.setData('4', 2, 1);
        output.setData('7', 2, 2);

        int length = output.getRowCount();
        int length1 = output.getColCount();

        Matrix fromMethod = RotationService.rotateMatrix(matrix);
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length1; k++) {
                assertEquals(output.getData(i, k), fromMethod.getData(i, k));
            }
        }
    }

    public void testSnail3x4Array() {
        Matrix matrix = new Matrix(3, 4);
        matrix.setData('1', 0, 0);
        matrix.setData('2', 0, 1);
        matrix.setData('3', 0, 2);
        matrix.setData('4', 0, 3);
        matrix.setData('5', 1, 0);
        matrix.setData('6', 1, 1);
        matrix.setData('7', 1, 2);
        matrix.setData('8', 1, 3);
        matrix.setData('9', 2, 0);
        matrix.setData('a', 2, 1);
        matrix.setData('b', 2, 2);
        matrix.setData('c', 2, 3);

        char[] output = {'1', '2', '3', '4', '8', 'c', 'b', 'a', '9', '5', '6', '7'};
        int length = matrix.getRowCount();
        int length1 = matrix.getColCount();

        char[] fromMethod = SnailService.snailMatrix(matrix);
        for (int i = 0; i < length * length1; i++) {
            assertEquals(output[i], fromMethod[i]);
        }
    }

    public void testRotation3x4Array() {
        Matrix matrix = new Matrix(3, 4);
        matrix.setData('1', 0, 0);
        matrix.setData('2', 0, 1);
        matrix.setData('3', 0, 2);
        matrix.setData('4', 0, 3);
        matrix.setData('5', 1, 0);
        matrix.setData('6', 1, 1);
        matrix.setData('7', 1, 2);
        matrix.setData('8', 1, 3);
        matrix.setData('9', 2, 0);
        matrix.setData('a', 2, 1);
        matrix.setData('b', 2, 2);
        matrix.setData('c', 2, 3);

        Matrix output = new Matrix(4, 3);
        output.setData('4', 0, 0);
        output.setData('8', 0, 1);
        output.setData('c', 0, 2);
        output.setData('3', 1, 0);
        output.setData('7', 1, 1);
        output.setData('b', 1, 2);
        output.setData('2', 2, 0);
        output.setData('6', 2, 1);
        output.setData('a', 2, 2);
        output.setData('1', 3, 0);
        output.setData('5', 3, 1);
        output.setData('9', 3, 2);


        int length = output.getRowCount();
        int length1 = output.getColCount();

        Matrix fromMethod = RotationService.rotateMatrix(matrix);
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length1; k++) {
                assertEquals(output.getData(i, k), fromMethod.getData(i, k));
            }
        }
    }
}
