import java.util.Map;
import java.util.Set;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, StringBuilder> dict = new HashMap<>();
            File inpFile = new File(args[0]);
            if (!inpFile.exists()) {
                throw new FileReadException();
            }
            try (Scanner in = new Scanner(inpFile)) {
                while (in.hasNext()) {
                    String line = in.nextLine();
                    if (!line.contains("|")) {
                        throw new InvalidFileFormatException();
                    }
                    line = line.toLowerCase();
                    String[] keyAndValue = line.split(" \\| ");
                    dict.put(keyAndValue[0], new StringBuilder(keyAndValue[1]));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            File translateFile = new File(args[1]);
            if (!translateFile.exists()) {
                throw new FileReadException();
            }
            try (Scanner in = new Scanner(translateFile)) {
                while (in.hasNext()) {
                    String line = in.nextLine();
                    line = line.toLowerCase();
                    StringBuilder answer = getString(dict, line);
                    if (!answer.equals("")) {
                        System.out.println(line + " - " + dict.get(new String(answer)));
                    } else {
                        System.out.println(line);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (FileReadException e) {
            System.out.println(e.getMessage());
        }
    }

    private static StringBuilder getString(Map<String, StringBuilder> dict, String line) {
        Set<String> keys = dict.keySet();
        String answer = "";
        int size = 0;
        for (String key : keys) {
            if (key.contains(line)) {
                if (line.equals(key.split(" ")[0]) || line.equals(key)) {
                    if (size < key.split(" ").length) {
                        answer = key;
                        size = key.split(" ").length;
                    }
                }
            }
        }
        return new StringBuilder(answer);
    }
}
