package com.github.martinambrus.rdapi.game;

import com.github.martinambrus.rdapi.keyboard.KeyboardListener;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.List;

public abstract class Game implements GameInterface {
    private final double apiVersion = 0.1;
    protected List<KeyboardListener> keyboardListeners = new ArrayList<KeyboardListener>();

    public void addKeyboardListener(KeyboardListener kl) {
        this.keyboardListeners.add( kl );
    }

    public boolean render( float a ) {
        while(Keyboard.next()) {
            if ( Keyboard.getEventKeyState() ) {
                for (KeyboardListener kl : this.keyboardListeners) {
                    kl.onKeyPressed(Keyboard.getEventKey());
                }
            }
        }

        return true;
    }

    public double getVersion() {
        return this.apiVersion;
    }
}
