package ru.tikskit.lesson02;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class TestCaseDataProvider {
    private final static String IN_FILE_MASK = "test.%s.in";
    private final static String OUT_FILE_MASK = "test.%s.out";

    public static TestCaseData getTestCaseData(int no) {
        return new TestCaseData(getDigitsCount(no), getExpectedValue(no));


    }

    private static int getDigitsCount(int no) {
        String inFilePath = String.format(IN_FILE_MASK, no);
        try {
            Path path = Path.of(TestCaseDataProvider.class.getClassLoader().getResource(inFilePath).toURI());
            List<String> lines = Files.readAllLines(path);
            return Integer.valueOf(lines.get(0).trim());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static long getExpectedValue(int no) {
        String outFilePath = String.format(OUT_FILE_MASK, no);
        try {
            Path path = Path.of(TestCaseDataProvider.class.getClassLoader().getResource(outFilePath).toURI());
            List<String> lines = Files.readAllLines(path);
            return Long.valueOf(lines.get(0).trim());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
