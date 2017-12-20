package com.iquestgroup.remotelearning.week2.sample;

public class Main {
  public static void main(String[] args) {
    FileParser fileParser = new FileParser();
    fileParser.registerParser(new DocParser());
    fileParser.registerParser(new XlsParser());

    fileParser.registerParser(new PdfParser());
    // I made this work
    fileParser.parse("pdf");

  }
}
