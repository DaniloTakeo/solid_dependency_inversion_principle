package case4.solution;

public class ReportGenerator {
    private final ReportExporter exporter;

    public ReportGenerator(ReportExporter exporter) {
        this.exporter = exporter;
    }

    public void generateReport(String content) {
        // lógica de geração de conteúdo
        exporter.export(content);
    }
}