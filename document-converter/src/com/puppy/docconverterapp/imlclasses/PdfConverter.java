package com.puppy.docconverterapp.imlclasses;

import com.puppy.docconverterapp.interfaces.FileConverter;

public class PdfConverter implements FileConverter {

    @Override
    public boolean loadFile() {
        return true;
    }

    @Override
    public void convertFile() {
        System.out.println("File is converted into pdf formate");
    }

    @Override
    public boolean isFileConverted() {
        return true;
    }
}
