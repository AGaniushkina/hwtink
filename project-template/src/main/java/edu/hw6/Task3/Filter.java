package edu.hw6.Task3;

import java.nio.file.Files;

public class Filter {
    public static AbstractFilter largerThan(int bytes) {
        return entry -> Files.size(entry) > bytes;

    }

    public static AbstractFilter magicNumber(int... extensions) {
        return entry -> {
            byte[] bytes = Files.readAllBytes(entry);
            if (bytes.length < extensions.length) {
                return false;
            }
            for (int i = 0; i < extensions.length; i++) {
                if (bytes[i] != extensions[i]) {
                    return false;
                }
            }
            return true;
        };
    }

    public static AbstractFilter globMatches(String glob) {
        return entry -> entry.getFileSystem()
            .getPathMatcher("glob:" + glob)
            .matches(entry.getFileName());
    }

    public static AbstractFilter regexContains(String regex) {
        return entry -> entry.getFileName()
            .toString()
            .matches("^.*" + regex + ".*$");
    }
}
