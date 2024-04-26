package com.github.martinambrus.rdapi.game;

import com.github.martinambrus.rdapi.keyboard.KeyboardListener;
import org.lwjgl.LWJGLException;
import com.mojang.rubydung.Timer;

import java.io.IOException;

public interface GameInterface {
    void init() throws LWJGLException, IOException;
    void destroy();
    void run();
    void tick();
    boolean render(float a);
    static void main(String[] args) throws LWJGLException {}
    void addKeyboardListener( KeyboardListener kl );
    Timer getTimerInstance();
}
