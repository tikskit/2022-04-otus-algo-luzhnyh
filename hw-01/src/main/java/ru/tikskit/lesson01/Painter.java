package ru.tikskit.lesson01;

public class Painter {

    private final int colsCount;
    private final int rowsCount;
    private final char[][] matrix;

    public Painter(int rowsCount, int colsCount) {
        if (rowsCount < 1) {
            throw new IllegalArgumentException("rowsCount меньше 1!");
        }
        if (colsCount < 1) {
            throw new IllegalArgumentException("colsCount меньше 1!");
        }

        this.rowsCount = rowsCount;
        this.colsCount = colsCount;
        matrix = new char[rowsCount][colsCount];
    }

    public void point(int colNo, int rowNo, char c) {
        matrix[rowNo][colNo] = c;
    }

    public void flush() {
        for (int colNo = 0; colNo < colsCount; colNo++) {
            for (int rowNo = 0; rowNo < rowsCount; rowNo++) {
                System.out.print(matrix[rowNo][colNo]);
            }
            System.out.println();
        }
    }
}
