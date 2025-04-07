package case4.solution;

public class Main {
    public static void main(String[] args) {
        ReportExporter exporter = new PDFExporter(); // ou new ExcelExporter()
        ReportGenerator generator = new ReportGenerator(exporter);
        generator.generateReport("Relatório de Vendas");
    }
}