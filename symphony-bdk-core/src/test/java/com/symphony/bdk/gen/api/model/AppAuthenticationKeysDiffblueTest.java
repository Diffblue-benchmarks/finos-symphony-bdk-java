package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppAuthenticationKeysDiffblueTest {
  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}, and {@link
   * AppAuthenticationKeys#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppAuthenticationKeys#equals(Object)}
   *   <li>{@link AppAuthenticationKeys#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AppAuthenticationKeys appAuthenticationKeys = new AppAuthenticationKeys();
    AppAuthenticationKeys appAuthenticationKeys2 = new AppAuthenticationKeys();

    // Act and Assert
    assertEquals(appAuthenticationKeys, appAuthenticationKeys2);
    assertEquals(appAuthenticationKeys.hashCode(), appAuthenticationKeys2.hashCode());
  }

  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}, and {@link
   * AppAuthenticationKeys#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppAuthenticationKeys#equals(Object)}
   *   <li>{@link AppAuthenticationKeys#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AppAuthenticationKeys appAuthenticationKeys = new AppAuthenticationKeys();

    // Act and Assert
    assertEquals(appAuthenticationKeys, appAuthenticationKeys);
    int expectedHashCodeResult = appAuthenticationKeys.hashCode();
    assertEquals(expectedHashCodeResult, appAuthenticationKeys.hashCode());
  }

  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKeys#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppAuthenticationKeys(), 1);
  }

  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKeys#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AppAuthenticationKeys appAuthenticationKeys = new AppAuthenticationKeys();
    appAuthenticationKeys.current(new AppAuthenticationKey());

    // Act and Assert
    assertNotEquals(appAuthenticationKeys, new AppAuthenticationKeys());
  }

  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKeys#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AppAuthenticationKeys appAuthenticationKeys = new AppAuthenticationKeys();
    appAuthenticationKeys.previous(new AppAuthenticationKey());

    // Act and Assert
    assertNotEquals(appAuthenticationKeys, new AppAuthenticationKeys());
  }

  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKeys#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppAuthenticationKeys(), null);
  }

  /**
   * Test {@link AppAuthenticationKeys#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationKeys#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AppAuthenticationKeys.equals(Object)",
    "int AppAuthenticationKeys.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppAuthenticationKeys(), "Different type to AppAuthenticationKeys");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AppAuthenticationKeys}
   *   <li>{@link AppAuthenticationKeys#current(AppAuthenticationKey)}
   *   <li>{@link AppAuthenticationKeys#previous(AppAuthenticationKey)}
   *   <li>{@link AppAuthenticationKeys#setCurrent(AppAuthenticationKey)}
   *   <li>{@link AppAuthenticationKeys#setPrevious(AppAuthenticationKey)}
   *   <li>{@link AppAuthenticationKeys#toString()}
   *   <li>{@link AppAuthenticationKeys#getCurrent()}
   *   <li>{@link AppAuthenticationKeys#getPrevious()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationKeys.<init>()",
    "AppAuthenticationKeys AppAuthenticationKeys.current(AppAuthenticationKey)",
    "AppAuthenticationKey AppAuthenticationKeys.getCurrent()",
    "AppAuthenticationKey AppAuthenticationKeys.getPrevious()",
    "AppAuthenticationKeys AppAuthenticationKeys.previous(AppAuthenticationKey)",
    "void AppAuthenticationKeys.setCurrent(AppAuthenticationKey)",
    "void AppAuthenticationKeys.setPrevious(AppAuthenticationKey)",
    "String AppAuthenticationKeys.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AppAuthenticationKeys actualAppAuthenticationKeys = new AppAuthenticationKeys();
    AppAuthenticationKeys actualCurrentResult =
        actualAppAuthenticationKeys.current(new AppAuthenticationKey());
    AppAuthenticationKeys actualPreviousResult =
        actualAppAuthenticationKeys.previous(new AppAuthenticationKey());
    AppAuthenticationKey current = new AppAuthenticationKey();
    actualAppAuthenticationKeys.setCurrent(current);
    AppAuthenticationKey previous = new AppAuthenticationKey();
    actualAppAuthenticationKeys.setPrevious(previous);
    String actualToStringResult = actualAppAuthenticationKeys.toString();
    AppAuthenticationKey actualCurrent = actualAppAuthenticationKeys.getCurrent();

    // Assert
    assertEquals(
        "class AppAuthenticationKeys {\n"
            + "    current: class AppAuthenticationKey {\n"
            + "        key: null\n"
            + "        expirationDate: null\n"
            + "        action: null\n"
            + "    }\n"
            + "    previous: class AppAuthenticationKey {\n"
            + "        key: null\n"
            + "        expirationDate: null\n"
            + "        action: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(current, actualCurrent);
    assertSame(previous, actualAppAuthenticationKeys.getPrevious());
    assertSame(actualAppAuthenticationKeys, actualCurrentResult);
    assertSame(actualAppAuthenticationKeys, actualPreviousResult);
  }
}
