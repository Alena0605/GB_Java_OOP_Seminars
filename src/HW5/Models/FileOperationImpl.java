package HW5.Models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationImpl implements FileOperation {
    private final String fileName;

    public FileOperationImpl(String fileName) {
        this.fileName = fileName;

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();

        try {
            File file = new File(fileName);
            // Создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // Создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // Считываем первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            // Считываем остальные строки в цикле
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    @Override
    public void saveAllLines(List<String> lines) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                // Запись всей строки
                writer.write(line);
                // Запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
