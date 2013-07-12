package com.tutorialspoint;

public class HelloWorld {

    private String message;

    /**
     * @return the message
     */
    public void getMessage() {
        System.out.println("Your Message: " + message);
    }
//    public String getMessage() {
//        return message;
//    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}