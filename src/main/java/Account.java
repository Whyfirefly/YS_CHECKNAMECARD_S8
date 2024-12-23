public class Account {
  private final String name;

  public Account(String name) {
    this.name = name;
  }

  public boolean checkNameToEmboss() {
    int countSpaces;
    countSpaces = name.length() - name.replaceAll(" ", "").length();
    return name.length() >= 3 && name.length() <= 19 && !name.isBlank() && countSpaces == 1 && !name.startsWith(" ") && !name.endsWith(" ");
  }
}
