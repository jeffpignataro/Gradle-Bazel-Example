package com.example;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Greeting {
    public static void sayHi() {
        Logger logger = System.getLogger("BaseLogger");
        logger.log(Level.INFO, "Hello, world.");
    }
}
