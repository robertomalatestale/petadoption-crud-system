package org.petadoption.exception;

public class EmptyFieldException extends RuntimeException{
    public EmptyFieldException(String message){
        super("Preencha corretamente, campo não pode ficar vazio: " + message);
    }
}
