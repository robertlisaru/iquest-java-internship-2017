package com.iquestgroup.remotelearning.week2;

public class FileParser {

  public String parse(String type) {
    if ("doc".equals(type)) {
      return parseDoc();
    }
    else if ("xls".equals(type)) {
      return parseXls();
    }
    else {
      return "Unknown type.";
    }
  }

  private String parseDoc() {
    return "Parsing doc file.";
  }

  private String parseXls() {
    return "Parsing xls file.";
  }

  public static void main(String[] args) {
    FileParser fileParser = new FileParser();
    fileParser.parse("pdf");

  }
}
