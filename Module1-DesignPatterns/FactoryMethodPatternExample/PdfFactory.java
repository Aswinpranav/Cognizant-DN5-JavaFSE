public class PdfFactory extends DocumentFactory{
    public Document CreateDocument(){
        return new PdfDocument();
    }
}
