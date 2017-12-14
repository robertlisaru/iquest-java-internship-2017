package com.iquestgroup.remotelearning.week2.sample;

/**
 * Parser base class
 */
public abstract class Parser {
  protected String type;

  /**
   * Checks if a parser can parse a specific type of file
   * 
   * @param extension input file extension
   * @return true if the parser can parse the file, false otherwise
   */
  public boolean canParse(String extension) {
    return type != null && type.equals(extension);
  }

  /**
   * @return the result of parsing
   */
  public abstract String parse();

}
