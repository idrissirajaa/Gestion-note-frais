package ma.emsi.gestion_depense.Exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public NotFoundException(String exMessage) {
        super(exMessage);
    }
}
