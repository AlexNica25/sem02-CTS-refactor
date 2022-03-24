package exception;

// peste tot unde e id "Valoarea pt identificator tr sa fie mai mare decat 1
public class IdentifierValueException extends Exception{
    public IdentifierValueException (String message) {
        super(message);
    }
}
