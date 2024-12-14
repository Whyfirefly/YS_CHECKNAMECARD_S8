import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
  private final String nameTest;
  private final boolean expected;

  public AccountTest(String nameTest, boolean expected) {
    this.nameTest = nameTest;
    this.expected = expected;
  }

  @Parameterized.Parameters(name = "Тестовые данные: {0}, {1}")
  public static Object[][] getTestData() {
    return new Object[][]{
            {"Альбус Дамблдор", true},
            {"ГарриПоттер", false},
            {" Иван Сумин", false},
            {"Анна Золотухина ", false},
            {"П", false},
            {"Сонечка Конфеткинананананананаанананана", false},
            {"Hagrid With", true},
            {"Hagrid With Op", false},
            {"123", false},
            {" Alice in ", false},
    };
  }

  @Test
  public void checkNameToEmbossWithDifferentMeanings() {
    Account account = new Account(nameTest);
    boolean actual = account.checkNameToEmboss();
    assertEquals(expected, actual);
    System.out.println(actual);
  }
}
