package Tehtava6;

import java.util.Base64;

class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        // Ciframos el mensaje pasándolo a Base64
        String encryptedMessage = Base64.getEncoder().encodeToString(message.getBytes());
        // Pasamos el mensaje cifrado al siguiente eslabón
        super.print(encryptedMessage);
    }
}

