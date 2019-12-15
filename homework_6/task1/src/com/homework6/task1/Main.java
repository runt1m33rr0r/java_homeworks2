package com.homework6.task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = readStringFromFile("./text.txt");
        Pattern pattern = Pattern.compile("((?:[?&](?:\\w+)=(?:\\w+))+|[--:\\w?@%&+~#=]+)? \\(.*?\\)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static String readStringFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
                line = reader.readLine();
            }

            return builder.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return "";
    }
}
