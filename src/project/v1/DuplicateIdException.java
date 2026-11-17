package project.v1;

public class DuplicateIdException extends RuntimeException{
    public DuplicateIdException(String message){
        super(message);
    }
}
