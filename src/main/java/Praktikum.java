public class Praktikum {
  public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    String checkName = "Тимоти Шаломе";
    Account account = new Account(checkName);
    System.out.println(account.checkNameToEmboss());
  }
}
