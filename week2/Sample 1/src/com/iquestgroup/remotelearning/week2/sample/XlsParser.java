package com.iquestgroup.remotelearning.week2.sample;

/**
 * Parser for .xls files
 */
public class XlsParser extends Parser {
  public XlsParser() {
    type = "xls";
  }

  @Override
  public String parse() {
    // implement specific parsing
    return "Parsing xls file.";
  }
}
