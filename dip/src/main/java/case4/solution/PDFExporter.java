package case4.solution;

public class PDFExporter implements ReportExporter {
    @Override
    public void export(String content) {
        System.out.println("Exportando em PDF: " + content);
    }
}