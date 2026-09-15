package Tehtava6;

//Decorador XML
class XMLPrinter extends PrinterDecorator {
    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        // Transformamos el mensaje a formato XML
        String xmlMessage = "<message>" + message + "</message>";
        // Pasamos el mensaje modificado al siguiente eslabón de la cadena
        super.print(xmlMessage);
    }
}

