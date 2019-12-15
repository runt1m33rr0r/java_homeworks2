package com.homework6.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> parsedData = new HashMap<>();
        Pattern pattern = Pattern.compile("\\S+");

        try (BufferedReader reader = new BufferedReader(new FileReader("./text.txt"))) {
            reader.readLine();
            reader.readLine();
            String line = reader.readLine();

            while (line != null) {
                Matcher matcher = pattern.matcher(line);
                String name = "";
                while (matcher.find()) {
                    if (name.equals("")) {
                        name = matcher.group();
                        parsedData.put(name, new ArrayList<>());
                    } else {
                        parsedData.get(name).add(matcher.group());
                    }
                }

                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        parsedData.forEach((name, addresses) -> {
            System.out.print(name + ": [");

            for (int i = 0; i < addresses.size(); i++) {
                if (i == addresses.size() - 1) {
                    System.out.print(addresses.get(i));
                } else {
                    System.out.print(addresses.get(i) + ", ");
                }
            }

            System.out.println("]");
        });
    }
}
