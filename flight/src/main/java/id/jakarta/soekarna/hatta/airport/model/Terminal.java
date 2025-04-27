package id.jakarta.soekarna.hatta.airport.model;


import jakarta.enterprise.inject.Model;


public class Terminal {

  private String terminalName;
  private String terminalCode;
  private TerminalType terminalType;

  public enum TerminalType {
    DOMESTIC,
    INTERNATIONAL
  }

  public String getTerminalName() {
    return terminalName;
  }

  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }

  public String getTerminalCode() {
    return terminalCode;
  }

  public void setTerminalCode(String terminalCode) {
    this.terminalCode = terminalCode;
  }

  public TerminalType getTerminalType() {
    return terminalType;
  }

  public void setTerminalType(TerminalType terminalType) {
    this.terminalType = terminalType;
  }
}
