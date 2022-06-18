package utils;

import java.util.Random;

/**
 * Класс для работы со строками, их генерации.
 */
public final class StringUtils {

    public final static String RUSSIAN_LOWER_CASE_PATTERN = "абвгдеёжзийклмнопрстуфхцчшщъыьэяю";
    public final static String RUSSIAN_UPPER_CASE_PATTERN = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public final static String ENGLISH_LOWER_CASE_PATTERN = "abcdefghijklmnopqrstuvwxyz";
    public final static String ENGLISH_UPPER_CASE_PATTERN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final static String ARABIC_NUMBER_PATTER = "0123456789";
    private final static Random RANDOM = new Random();

    public static String randomEmail() {
        return String.format("%s@%s.%s",
                randomEnglishLowerCaseString(6),
                randomEnglishLowerCaseString(3),
                randomEnglishLowerCaseString(3));
    }

    public static String randomEnglishLowerCaseString(final int length) {
        return randomString(ENGLISH_LOWER_CASE_PATTERN, length);
    }

    public static String randomEnglishUpperCaseString(final int length) {
        return randomString(ENGLISH_UPPER_CASE_PATTERN, length);
    }

    public static String randomRussianLowerCaseString(final int length) {
        return randomString(RUSSIAN_LOWER_CASE_PATTERN, length);
    }

    public static String randomRussianUpperCaseString(final int length) {
        return randomString(RUSSIAN_UPPER_CASE_PATTERN, length);
    }

    public static String randomNumberString(final int length) {
        return randomString(ARABIC_NUMBER_PATTER, length);
    }

    private static String randomString(final String pattern, final int length) {
        final StringBuilder random = new StringBuilder();
        for(int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(pattern.length());
            random.append(pattern.charAt(index));
        }

        return random.toString();
    }
}
