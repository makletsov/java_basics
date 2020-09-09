package ru.v_makletsov.lecture_13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Blur {
    private static double[][] getBlurBrush(int brushSize) {
        double[][] brush = new double[brushSize][brushSize];

        for (int i = 0; i < brushSize; i++) {
            for (int j = 0; j < brushSize; j++) {
                brush[i][j] = 1d / Math.pow(brushSize, 2);
            }
        }

        return brush;
    }

    private static void filterOutSaturation(double[] pixel) {
        for (int i = 0; i < pixel.length; i++) {
            if (pixel[i] < 0) {
                pixel[i] = 0;
            } else if (pixel[i] > 255) {
                pixel[i] = 255;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        int width = inputRaster.getWidth();
        int height = inputRaster.getHeight();

        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster outputRaster = outputImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;
        int[] inputPixel = new int[COLORS_COUNT_IN_RGB];
        double[] outputPixel = new double[COLORS_COUNT_IN_RGB];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер размывающей кисти в пикселях:");
        int brushSize = scanner.nextInt();
        int brushRadius = brushSize / 2;

        double[][] brush = getBlurBrush(brushSize);

        for (int y = brushRadius; y < height - brushRadius; ++y) {
            for (int x = brushRadius; x < width - brushRadius; ++x) {
                for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                    outputPixel[k] = 0;
                }

                for (int brushY = 0, matrixY = y - brushRadius; brushY < brushSize; brushY++, matrixY++) {
                    for (int brushX = 0, matrixX = x - brushRadius; brushX < brushSize; brushX++, matrixX++) {
                        inputRaster.getPixel(matrixX, matrixY, inputPixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            outputPixel[k] += brush[brushX][brushY] * inputPixel[k];
                        }
                    }
                }

                filterOutSaturation(outputPixel);

                outputRaster.setPixel(x, y, outputPixel);
            }
        }

        ImageIO.write(outputImage, "png", new File("out.png"));
    }
}
