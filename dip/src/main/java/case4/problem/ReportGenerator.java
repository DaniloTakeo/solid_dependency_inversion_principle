package case4.problem;

public class ReportGenerator {
    private PDFExporter exporter = new PDFExporter();

    public void generateReport(String content) {
        // lógica de geração de conteúdo
        exporter.export(content);
    }
}