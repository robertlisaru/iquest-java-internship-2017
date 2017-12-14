package com.iquestgroup.remotelearning.week2.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * File parser agregator - holdes and delegates to parsers. Just an example - the path to the actual file to parse is
 * not included
 */
public class FileParser {
  private List<Parser> parsers = new ArrayList<Parser>();

  /**
   * Parses based on file extension
   * 
   * @param fileExtension input file extension
   * @return the result of parsing
   */
  public String parse(String fileExtension) {
    for (Parser parser : parsers) {
      if (parser.canParse(fileExtension)) {
        return parser.parse();
      }
    }
    return null;
  }

  /**
   * Adds parser to internal parsers list
   * 
   * @param parser parser to add
   */
  public void registerParser(Parser parser) {
    parsers.add(parser);
  }
}
