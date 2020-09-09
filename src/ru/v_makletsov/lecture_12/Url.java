package ru.v_makletsov.lecture_12;

public class Url {
    private static String getServerName(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.length();
        int slashIndex = url.indexOf("/", startIndex);

        if (slashIndex > -1) {
            endIndex = slashIndex;
        }

        return url.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println("Имя сервера: " + getServerName(url));
    }
}
