package siteTestAutomation.utils;

import java.util.Random;

public class StringUtils {
    public static String generateString(int length) {
        Random rng = new Random();
        String characters = "abcdefghijklmnopqrstuvwxys";

        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
