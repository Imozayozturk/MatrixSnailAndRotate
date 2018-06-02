package BusinessService;

import Main.Matrix;

public class RotationService {
    public RotationService() {
    }

    public static Matrix rotateMatrix(Matrix matrix) {

        Matrix rotated = new Matrix(matrix.getColCount(), matrix.getRowCount());

        for (int i = 0; i < matrix.getColCount(); ++i) {
            for (int j = 0; j < matrix.getRowCount(); ++j) {

                char data = matrix.getData(j, matrix.getColCount() - i - 1);
                rotated.setData(data, i, j);
            }
        }
        return rotated;
    }
}
