package Seminar6.Solid1SRP2.srp;

import java.io.FileWriter;
import java.io.IOException;

public class SaveJson {
    private final String fileName;

    public SaveJson(String fileName) {
        this.fileName = fileName;
    }

    public void saveToJson(Order order) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
