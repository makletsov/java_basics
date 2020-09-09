package ru.v_makletsov.lecture_13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class Crazy {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;
        //final int MAX_RGB = 255;

        int[] inputPixel = new int[COLORS_COUNT_IN_RGB];
        //int[][] coefficient = {{0, -1, 0}, {-1, 5, -1}, {0, -1, 0}};

        double[][] coefficient = {{1d / 9, 1d / 9, 1d / 9},
                {1d / 9, 1d / 9, 1d / 9},
                {1d / 9, 1d / 9, 1d / 9}};

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                int[] outputPixel = {0, 0, 0};

                for (int matrixY = y - 1, coefficientY = 0; matrixY <= y + 1; matrixY++, coefficientY++) {
                    for (int matrixX = x - 1, coefficientX = 0; matrixX <= x + 1; matrixX++, coefficientX++) {
                        raster.getPixel(matrixX, matrixY, inputPixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            int result = (int) Math.round(coefficient[coefficientX][coefficientY] * inputPixel[k]);
                            outputPixel[k] += result;

                            /*if (result < 0) {
                                buffer[k] = 0;
                            } else if (result > 255) {
                                buffer[k] = 255;
                            } else {
                                buffer[k] = result;
                            }*/
                        }
                    }
                }

                //raster.getPixel(x, y, buffer);

                /*for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    pixel[i] = buffer[i];
                }*/

                raster.setPixel(x, y, outputPixel);
            }
        }

        ImageIO.write(image, "png", new File("out.png"));
    }
}
