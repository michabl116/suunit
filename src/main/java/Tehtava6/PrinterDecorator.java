package Tehtava6;
abstract class PrinterDecorator implements Printer {
    protected Printer decoratedPrinter; // El objeto interno que estama envolviendo

    public PrinterDecorator(Printer printer) {
        this.decoratedPrinter = printer;
    }

    @Override
    public void print(String message) {
        // Por defecto, delega la impresión al objeto envuelto
        this.decoratedPrinter.print(message);
    }
}