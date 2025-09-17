package com.puppy.docconverterapp.interfaces;

public interface FileConverter {
    boolean loadFile();
    void convertFile();

    boolean isFileConverted();
}
