package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppNotificationDiffblueTest {
  /**
   * Test {@link AppNotification#equals(Object)}, and {@link AppNotification#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppNotification#equals(Object)}
   *   <li>{@link AppNotification#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AppNotification appNotification = new AppNotification();
    AppNotification appNotification2 = new AppNotification();

    // Act and Assert
    assertEquals(appNotification, appNotification2);
    assertEquals(appNotification.hashCode(), appNotification2.hashCode());
  }

  /**
   * Test {@link AppNotification#equals(Object)}, and {@link AppNotification#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppNotification#equals(Object)}
   *   <li>{@link AppNotification#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AppNotification appNotification = new AppNotification();

    // Act and Assert
    assertEquals(appNotification, appNotification);
    int expectedHashCodeResult = appNotification.hashCode();
    assertEquals(expectedHashCodeResult, appNotification.hashCode());
  }

  /**
   * Test {@link AppNotification#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppNotification#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppNotification(), 1);
  }

  /**
   * Test {@link AppNotification#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppNotification#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AppNotification appNotification = new AppNotification();
    appNotification.url("https://example.org/example");

    // Act and Assert
    assertNotEquals(appNotification, new AppNotification());
  }

  /**
   * Test {@link AppNotification#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppNotification#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AppNotification appNotification = new AppNotification();
    appNotification.apiKey("Api Key");

    // Act and Assert
    assertNotEquals(appNotification, new AppNotification());
  }

  /**
   * Test {@link AppNotification#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppNotification#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppNotification(), null);
  }

  /**
   * Test {@link AppNotification#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppNotification#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppNotification.equals(Object)", "int AppNotification.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppNotification(), "Different type to AppNotification");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AppNotification}
   *   <li>{@link AppNotification#apiKey(String)}
   *   <li>{@link AppNotification#setApiKey(String)}
   *   <li>{@link AppNotification#setUrl(String)}
   *   <li>{@link AppNotification#url(String)}
   *   <li>{@link AppNotification#toString()}
   *   <li>{@link AppNotification#getApiKey()}
   *   <li>{@link AppNotification#getUrl()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppNotification.<init>()",
    "AppNotification AppNotification.apiKey(String)",
    "String AppNotification.getApiKey()",
    "String AppNotification.getUrl()",
    "void AppNotification.setApiKey(String)",
    "void AppNotification.setUrl(String)",
    "String AppNotification.toString()",
    "AppNotification AppNotification.url(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AppNotification actualAppNotification = new AppNotification();
    AppNotification actualApiKeyResult = actualAppNotification.apiKey("Api Key");
    actualAppNotification.setApiKey("Api Key");
    actualAppNotification.setUrl("https://example.org/example");
    AppNotification actualUrlResult = actualAppNotification.url("https://example.org/example");
    String actualToStringResult = actualAppNotification.toString();
    String actualApiKey = actualAppNotification.getApiKey();

    // Assert
    assertEquals("Api Key", actualApiKey);
    assertEquals(
        "class AppNotification {\n    url: https://example.org/example\n    apiKey: Api Key\n}",
        actualToStringResult);
    assertEquals("https://example.org/example", actualAppNotification.getUrl());
    assertSame(actualAppNotification, actualApiKeyResult);
    assertSame(actualAppNotification, actualUrlResult);
  }
}
