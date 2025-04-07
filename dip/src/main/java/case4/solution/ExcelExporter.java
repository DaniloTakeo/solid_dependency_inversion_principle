package case4.solution;

public class ExcelExporter implements ReportExporter {
    @Override
    public void export(String content) {
        System.out.println("Exportando em Excel: " + content);
    }
}