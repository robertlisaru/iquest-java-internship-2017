package com.iquestgroup.remotelearning.week2.sample;

/**
 * Parser for .doc files
 */
public class DocParser extends Parser {
  public DocParser() {
    type = "doc";
  }

  @Override
  public String parse() {
    // implement specific parsing
    return "Parsing doc file.";
  }
}
