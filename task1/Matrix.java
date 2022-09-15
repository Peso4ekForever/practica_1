package task1;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private final double[][] components;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.components = new double[rows][columns];
    }

    public Matrix fill() {
        Random rnd = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                components[i][j] = rnd.nextDouble();
            }
        }
        return this;
    }

    public Matrix add(Matrix matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                components[i][j] += matrix.getComponent(i, j);
            }
        }
        return this;
    }

    public Matrix scale(double value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                components[i][j] *= value;
            }
        }
        return this;
    }

    public Matrix mul(Matrix matrix) {
        //double[][] result = new double[rows][columns];

//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[rows].length; j++) {
//                result[i][j] = mulMatrixCell(matrix, i, j);
//            }
//        }

        // this.components = result; ??
        return this;
    }

    public double getComponent(int row, int column) {
        return components[row][column];
    }

    public double mulMatrixCell(Matrix matrix, int row, int column) {
        double result = 0.0;
        for (int i = 0; i < components.length; i++) {
            result += components[row][i] * matrix.getComponent(i, column);
        }
        return result;
    }

    //косячный метод выведения в строку
    @Override
    public String toString() {
        return "Matrix{" +
                "components=" + Arrays.toString(components) +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }
}