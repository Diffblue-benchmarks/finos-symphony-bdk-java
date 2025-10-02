package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppAuthenticationKeyDiffblueTest {
  /**
   * Test {@link AppAuthenticationKey#equals(Object)}, and {@link AppAuthenticationKey#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppAuthenticationKey#equals(Object)}
   *   <li>{@link AppAuthenticationKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AppAuthenticationKey appAuthenticationKey = new AppAuthenticationKey();
    AppAuthenticationKey appAuthenticationKey2 = new AppAuthenticationKey();

    // Act and Assert
    assertEquals(appAuthenticationKey, appAuthenticationKey2);
    assertEquals(appAuthenticationKey.hashCode(), appAuthenticationKey2.hashCode());
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}, and {@link AppAuthenticationKey#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppAuthenticationKey#equals(Object)}
   *   <li>{@link AppAuthenticationKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AppAuthenticationKey appAuthenticationKey = new AppAuthenticationKey();

    // Act and Assert
    assertEquals(appAuthenticationKey, appAuthenticationKey);
    int expectedHashCodeResult = appAuthenticationKey.hashCode();
    assertEquals(expectedHashCodeResult, appAuthenticationKey.hashCode());
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppAuthenticationKey(), 1);
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AppAuthenticationKey appAuthenticationKey = new AppAuthenticationKey();
    appAuthenticationKey.key("Key");

    // Act and Assert
    assertNotEquals(appAuthenticationKey, new AppAuthenticationKey());
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AppAuthenticationKey appAuthenticationKey = new AppAuthenticationKey();
    appAuthenticationKey.expirationDate(1L);

    // Act and Assert
    assertNotEquals(appAuthenticationKey, new AppAuthenticationKey());
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AppAuthenticationKey appAuthenticationKey = new AppAuthenticationKey();
    appAuthenticationKey.action("Action");

    // Act and Assert
    assertNotEquals(appAuthenticationKey, new AppAuthenticationKey());
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppAuthenticationKey(), null);
  }

  /**
   * Test {@link AppAuthenticationKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKey.equals(Object)",
    "int AppAuthenticationKey.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppAuthenticationKey(), "Different type to AppAuthenticationKey");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AppAuthenticationKey}
   *   <li>{@link AppAuthenticationKey#action(String)}
   *   <li>{@link AppAuthenticationKey#expirationDate(Long)}
   *   <li>{@link AppAuthenticationKey#key(String)}
   *   <li>{@link AppAuthenticationKey#setAction(String)}
   *   <li>{@link AppAuthenticationKey#setExpirationDate(Long)}
   *   <li>{@link AppAuthenticationKey#setKey(String)}
   *   <li>{@link AppAuthenticationKey#toString()}
   *   <li>{@link AppAuthenticationKey#getAction()}
   *   <li>{@link AppAuthenticationKey#getExpirationDate()}
   *   <li>{@link AppAuthenticationKey#getKey()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationKey.<init>()",
    "AppAuthenticationKey AppAuthenticationKey.action(String)",
    "AppAuthenticationKey AppAuthenticationKey.expirationDate(Long)",
    "String AppAuthenticationKey.getAction()",
    "Long AppAuthenticationKey.getExpirationDate()",
    "String AppAuthenticationKey.getKey()",
    "AppAuthenticationKey AppAuthenticationKey.key(String)",
    "void AppAuthenticationKey.setAction(String)",
    "void AppAuthenticationKey.setExpirationDate(Long)",
    "void AppAuthenticationKey.setKey(String)",
    "String AppAuthenticationKey.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AppAuthenticationKey actualAppAuthenticationKey = new AppAuthenticationKey();
    AppAuthenticationKey actualActionResult = actualAppAuthenticationKey.action("Action");
    AppAuthenticationKey actualExpirationDateResult = actualAppAuthenticationKey.expirationDate(1L);
    AppAuthenticationKey actualKeyResult = actualAppAuthenticationKey.key("Key");
    actualAppAuthenticationKey.setAction("Action");
    actualAppAuthenticationKey.setExpirationDate(1L);
    actualAppAuthenticationKey.setKey("Key");
    String actualToStringResult = actualAppAuthenticationKey.toString();
    String actualAction = actualAppAuthenticationKey.getAction();
    Long actualExpirationDate = actualAppAuthenticationKey.getExpirationDate();

    // Assert
    assertEquals("Action", actualAction);
    assertEquals("Key", actualAppAuthenticationKey.getKey());
    assertEquals(
        "class AppAuthenticationKey {\n    key: Key\n    expirationDate: 1\n    action: Action\n}",
        actualToStringResult);
    assertEquals(1L, actualExpirationDate.longValue());
    assertSame(actualAppAuthenticationKey, actualActionResult);
    assertSame(actualAppAuthenticationKey, actualExpirationDateResult);
    assertSame(actualAppAuthenticationKey, actualKeyResult);
  }
}
