public class Main {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.CreateDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.CreateDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.CreateDocument();
        excel.open();
    }
}