package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    // abstract creator may perform addition processing on the object returned by subclasses
    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    // Factory method
    protected abstract Message createMessage();


}
