package me.jdragon.tdd.chapter02;

/**
 * @author choijaeyong on 2020/02/23.
 * @project tdd
 * @description
 */
public class PasswordStrengthMeter {

  public PasswordStrength meter(String s) {
    if (s == null || s.isEmpty()) {
      return PasswordStrength.INVALID;
    }
    if (s.length() < 8) {
      return PasswordStrength.NORMAL;
    }

    boolean containsNum = meetsContainingNumberCriteria(s);
    if (!containsNum) return PasswordStrength.NORMAL;

    boolean containsUpp = meetsContainingUppercaseCriteria(s);
    if(!containsUpp) return PasswordStrength.NORMAL;

    return PasswordStrength.STRONG;
  }

  private boolean meetsContainingUppercaseCriteria(String s) {
    boolean containsUpp = false;
    for (char ch : s.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        containsUpp = true;
        break;
      }
    }
    return containsUpp;
  }

  private boolean meetsContainingNumberCriteria(String s) {
    for ( char ch: s.toCharArray() ) {
      if (ch >= '0' && ch <= '9') {
        return true;
      }
    }
    return false;
  }
}
