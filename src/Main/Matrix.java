package Main;

public class Matrix {
    char[][] input;

    public Matrix(int rowCount, int columnCount) {
        this.input = new char[rowCount][columnCount];
    }

    public void setData(char value, int row, int col) {
        int rowCount = input.length;
        int columnCount = input[0].length;
        if (row >= 0 && col >= 0 && row < rowCount && col < columnCount) {
            input[row][col] = value;
        }
    }

    public char getData(int row, int col) {
        int rowCount = input.length;
        int columnCount = input[0].length;
        if (row >= 0 && col >= 0 && row < rowCount && col < columnCount) {
            return input[row][col];
        }
        return ' ';
    }

    public int getRowCount() {
        return this.input.length;
    }

    public int getColCount() {
        return this.input[0].length;
    }
}
