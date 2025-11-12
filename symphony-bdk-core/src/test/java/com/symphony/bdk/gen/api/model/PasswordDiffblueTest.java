package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PasswordDiffblueTest {
  /**
   * Test {@link Password#gethSalt()}.
   *
   * <p>Method under test: {@link Password#gethSalt()}
   */
  @Test
  @DisplayName("Test gethSalt()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Password.gethSalt()"})
  void testGethSalt() {
    // Arrange, Act and Assert
    assertNull(new Password().gethSalt());
  }

  /**
   * Test {@link Password#gethPassword()}.
   *
   * <p>Method under test: {@link Password#gethPassword()}
   */
  @Test
  @DisplayName("Test gethPassword()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Password.gethPassword()"})
  void testGethPassword() {
    // Arrange, Act and Assert
    assertNull(new Password().gethPassword());
  }

  /**
   * Test {@link Password#equals(Object)}, and {@link Password#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Password#equals(Object)}
   *   <li>{@link Password#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Password password = new Password();
    Password password2 = new Password();

    // Act and Assert
    assertEquals(password, password2);
    assertEquals(password.hashCode(), password2.hashCode());
  }

  /**
   * Test {@link Password#equals(Object)}, and {@link Password#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Password#equals(Object)}
   *   <li>{@link Password#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Password password = new Password();

    // Act and Assert
    assertEquals(password, password);
    int expectedHashCodeResult = password.hashCode();
    assertEquals(expectedHashCodeResult, password.hashCode());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Password(), 1);
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Password password = new Password();
    password.hSalt("H Salt");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Password password = new Password();
    password.hPassword("iloveyou");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Password password = new Password();
    password.khSalt("Kh Salt");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Password password = new Password();
    password.khPassword("iloveyou");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Password(), null);
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Password(), "Different type to Password");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Password}
   *   <li>{@link Password#hPassword(String)}
   *   <li>{@link Password#hSalt(String)}
   *   <li>{@link Password#khPassword(String)}
   *   <li>{@link Password#khSalt(String)}
   *   <li>{@link Password#setKhPassword(String)}
   *   <li>{@link Password#setKhSalt(String)}
   *   <li>{@link Password#sethPassword(String)}
   *   <li>{@link Password#sethSalt(String)}
   *   <li>{@link Password#toString()}
   *   <li>{@link Password#getKhPassword()}
   *   <li>{@link Password#getKhSalt()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Password.<init>()",
    "String Password.getKhPassword()",
    "String Password.getKhSalt()",
    "Password Password.hPassword(String)",
    "Password Password.hSalt(String)",
    "Password Password.khPassword(String)",
    "Password Password.khSalt(String)",
    "void Password.setKhPassword(String)",
    "void Password.setKhSalt(String)",
    "void Password.sethPassword(String)",
    "void Password.sethSalt(String)",
    "String Password.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Password actualPassword = new Password();
    Password actualHPasswordResult = actualPassword.hPassword("iloveyou");
    Password actualHSaltResult = actualPassword.hSalt("H Salt");
    Password actualKhPasswordResult = actualPassword.khPassword("iloveyou");
    Password actualKhSaltResult = actualPassword.khSalt("Kh Salt");
    actualPassword.setKhPassword("iloveyou");
    actualPassword.setKhSalt("Kh Salt");
    actualPassword.sethPassword("iloveyou");
    actualPassword.sethSalt("H Salt");
    String actualToStringResult = actualPassword.toString();
    String actualKhPassword = actualPassword.getKhPassword();

    // Assert
    assertEquals("Kh Salt", actualPassword.getKhSalt());
    assertEquals(
        "class Password {\n"
            + "    hSalt: H Salt\n"
            + "    hPassword: iloveyou\n"
            + "    khSalt: Kh Salt\n"
            + "    khPassword: iloveyou\n"
            + "}",
        actualToStringResult);
    assertEquals("iloveyou", actualKhPassword);
    assertSame(actualPassword, actualHPasswordResult);
    assertSame(actualPassword, actualHSaltResult);
    assertSame(actualPassword, actualKhPasswordResult);
    assertSame(actualPassword, actualKhSaltResult);
  }
}
