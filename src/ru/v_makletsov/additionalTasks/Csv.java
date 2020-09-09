package ru.v_makletsov.additionalTasks;

import java.io.*;

public class Csv {
    private static void printHtmlHead(PrintWriter writer) {
        writer.append("<!DOCTYPE html>").append(System.lineSeparator());
        writer.append("<html>").append(System.lineSeparator());
        writer.append("\t<head>").append(System.lineSeparator());
        writer.append("\t\t<meta charset=\"utf-8\" />").append(System.lineSeparator());
        writer.append("\t\t<title>HTML Document</title>").append(System.lineSeparator());
        writer.append("\t</head>").append(System.lineSeparator());
        writer.append("\t<body>").append(System.lineSeparator());
    }

    private static void printHtmlEnd(PrintWriter writer) {
        writer.append("\t</body>").append(System.lineSeparator());
        writer.append("</html>");
    }

    private static void printTableStart(PrintWriter writer) {
        writer.append("\t\t<table border=\"1\">").append(System.lineSeparator());
    }

    private static void printTableEnd(PrintWriter writer) {
        writer.append("\t\t</table>").append(System.lineSeparator());
    }

    private static void printLineEnd(PrintWriter writer) {
        writer.append("</td>").append(System.lineSeparator());
        writer.append("\t\t\t</tr>").append(System.lineSeparator());
    }

    private static void printNewDetail(PrintWriter writer) {
        writer.append("</td>").append(System.lineSeparator());
        writer.append("\t\t\t\t<td>");
    }

    private static void printNewLine(PrintWriter writer) {
        writer.append("\t\t\t<tr>").append(System.lineSeparator());
        writer.append("\t\t\t\t<td>");
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Недостаточно данных для запуска. Нужно передать файл для чтения и файл для записи");
            return;
        }

        if (args.length > 2) {
            System.out.println("Переданы лишние данные. Нужно передать файл для чтения и файл для записи");
            return;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0])); PrintWriter writer = new PrintWriter(args[1])) {
            printHtmlHead(writer);
            printTableStart(writer);

            int characterKey;
            boolean isQuotesOpen = false;
            boolean isStringEmpty = true;
            int quoteCounter = 0;

            while ((characterKey = bufferedReader.read()) != -1) {
                char character = (char) characterKey;

                if ((character != '\r') && (character != '\n')) {
                    if (isStringEmpty) {
                        printNewLine(writer);
                    }

                    isStringEmpty = false;
                }

                switch (character) {
                    case '\r':
                        break;
                    case '\n':
                        if (isStringEmpty) {
                            break;
                        }

                        if (!isQuotesOpen) {
                            printLineEnd(writer);
                            isStringEmpty = true;
                        } else if (quoteCounter % 2 == 0) {
                            writer.append("<br/>").append(character).append("\t\t\t\t");
                        } else {
                            isQuotesOpen = false;
                            quoteCounter = 0;

                            printLineEnd(writer);
                            isStringEmpty = true;
                        }

                        break;
                    case '\"':
                        if (!isQuotesOpen) {
                            isQuotesOpen = true;
                        } else {
                            quoteCounter++;
                        }

                        if ((quoteCounter % 2 == 0) && (quoteCounter != 0)) {
                            writer.append(character);
                        }

                        break;
                    case ',':
                        if (!isQuotesOpen) {
                            printNewDetail(writer);
                        } else if (quoteCounter % 2 == 0) {
                            writer.append(character);
                        } else {
                            isQuotesOpen = false;
                            quoteCounter = 0;

                            printNewDetail(writer);
                        }

                        break;
                    default:
                        if (isQuotesOpen) {
                            quoteCounter = 0;
                        }

                        switch (character) {
                            case '<':
                                writer.append("&lt;");
                                break;
                            case '>':
                                writer.append("&gt;");
                                break;
                            case '&':
                                writer.append("&amp;");
                                break;
                            default:
                                writer.append(character);
                                break;
                        }
                }
            }

            printTableEnd(writer);
            printHtmlEnd(writer);
        }
    }
}
