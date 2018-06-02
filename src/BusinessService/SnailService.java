package BusinessService;

import Main.Matrix;

public class SnailService {
    public SnailService() {
    }

    public static char[] snailMatrix(Matrix matrix) {
        int i, k = 0, l = 0, resultNode = 0;
        int xSize = matrix.getRowCount();
        int ySize = matrix.getColCount();
        int lengthOfArray = xSize * ySize;
        char[] result = new char[lengthOfArray];
        xSize--;
        ySize--;

        while (k <= xSize && l <= ySize) {
            for (i = l; i <= ySize; ++i) {
                result[resultNode] = matrix.getData(k, i);
                resultNode++;
            }
            k++;
            if (resultNode == lengthOfArray) break;

            for (i = k; i <= xSize; ++i) {
                result[resultNode] = matrix.getData(i, ySize);
                resultNode++;
            }
            ySize--;
            if (resultNode == lengthOfArray) break;

            for (i = ySize; i >= l; --i) {
                result[resultNode] = matrix.getData(xSize, i);
                resultNode++;
            }
            xSize--;
            if (resultNode == lengthOfArray) break;


            for (i = xSize; i >= k; --i) {
                result[resultNode] = matrix.getData(i, l);
                resultNode++;
            }
            l++;
            if (resultNode == lengthOfArray) break;

        }
        return result;
    }

}
