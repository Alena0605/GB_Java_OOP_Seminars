package Seminar6.HW6_7.Models;

import java.util.List;

public interface FileOperations {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);
}
