package com.iquestgroup.remotelearning.week2.sample;

/**
 * Parser for .pdf files
 */
public class PdfParser extends Parser {
    public PdfParser() {
        type = "pdf";
    }

    @Override
    public String parse() {
        // implement specific parsing
        return "Parsing pdf file.";
    }
}
