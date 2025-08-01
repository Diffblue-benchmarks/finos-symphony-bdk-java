package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExtensionAppTokensDiffblueTest {
  /**
   * Test {@link ExtensionAppTokens#equals(Object)}, and {@link ExtensionAppTokens#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtensionAppTokens#equals(Object)}
   *   <li>{@link ExtensionAppTokens#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ExtensionAppTokens extensionAppTokens = new ExtensionAppTokens();
    ExtensionAppTokens extensionAppTokens2 = new ExtensionAppTokens();

    // Act and Assert
    assertEquals(extensionAppTokens, extensionAppTokens2);
    int expectedHashCodeResult = extensionAppTokens.hashCode();
    assertEquals(expectedHashCodeResult, extensionAppTokens2.hashCode());
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}, and {@link ExtensionAppTokens#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtensionAppTokens#equals(Object)}
   *   <li>{@link ExtensionAppTokens#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ExtensionAppTokens extensionAppTokens = new ExtensionAppTokens();

    // Act and Assert
    assertEquals(extensionAppTokens, extensionAppTokens);
    int expectedHashCodeResult = extensionAppTokens.hashCode();
    assertEquals(expectedHashCodeResult, extensionAppTokens.hashCode());
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ExtensionAppTokens(), 1);
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ExtensionAppTokens extensionAppTokens = new ExtensionAppTokens();
    extensionAppTokens.appId("42");

    // Act and Assert
    assertNotEquals(extensionAppTokens, new ExtensionAppTokens());
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ExtensionAppTokens extensionAppTokens = new ExtensionAppTokens();
    extensionAppTokens.appToken("ABC123");

    // Act and Assert
    assertNotEquals(extensionAppTokens, new ExtensionAppTokens());
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ExtensionAppTokens extensionAppTokens = new ExtensionAppTokens();
    extensionAppTokens.symphonyToken("ABC123");

    // Act and Assert
    assertNotEquals(extensionAppTokens, new ExtensionAppTokens());
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ExtensionAppTokens extensionAppTokens = new ExtensionAppTokens();
    extensionAppTokens.expireAt(1L);

    // Act and Assert
    assertNotEquals(extensionAppTokens, new ExtensionAppTokens());
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ExtensionAppTokens(), null);
  }

  /**
   * Test {@link ExtensionAppTokens#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppTokens#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppTokens.equals(Object)",
    "int ExtensionAppTokens.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ExtensionAppTokens(), "Different type to ExtensionAppTokens");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ExtensionAppTokens}
   *   <li>{@link ExtensionAppTokens#appId(String)}
   *   <li>{@link ExtensionAppTokens#appToken(String)}
   *   <li>{@link ExtensionAppTokens#expireAt(Long)}
   *   <li>{@link ExtensionAppTokens#setAppId(String)}
   *   <li>{@link ExtensionAppTokens#setAppToken(String)}
   *   <li>{@link ExtensionAppTokens#setExpireAt(Long)}
   *   <li>{@link ExtensionAppTokens#setSymphonyToken(String)}
   *   <li>{@link ExtensionAppTokens#symphonyToken(String)}
   *   <li>{@link ExtensionAppTokens#toString()}
   *   <li>{@link ExtensionAppTokens#getAppId()}
   *   <li>{@link ExtensionAppTokens#getAppToken()}
   *   <li>{@link ExtensionAppTokens#getExpireAt()}
   *   <li>{@link ExtensionAppTokens#getSymphonyToken()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ExtensionAppTokens.<init>()",
    "ExtensionAppTokens ExtensionAppTokens.appId(String)",
    "ExtensionAppTokens ExtensionAppTokens.appToken(String)",
    "ExtensionAppTokens ExtensionAppTokens.expireAt(Long)",
    "String ExtensionAppTokens.getAppId()",
    "String ExtensionAppTokens.getAppToken()",
    "Long ExtensionAppTokens.getExpireAt()",
    "String ExtensionAppTokens.getSymphonyToken()",
    "void ExtensionAppTokens.setAppId(String)",
    "void ExtensionAppTokens.setAppToken(String)",
    "void ExtensionAppTokens.setExpireAt(Long)",
    "void ExtensionAppTokens.setSymphonyToken(String)",
    "ExtensionAppTokens ExtensionAppTokens.symphonyToken(String)",
    "String ExtensionAppTokens.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ExtensionAppTokens actualExtensionAppTokens = new ExtensionAppTokens();
    ExtensionAppTokens actualAppIdResult = actualExtensionAppTokens.appId("42");
    ExtensionAppTokens actualAppTokenResult = actualExtensionAppTokens.appToken("ABC123");
    ExtensionAppTokens actualExpireAtResult = actualExtensionAppTokens.expireAt(1L);
    actualExtensionAppTokens.setAppId("42");
    actualExtensionAppTokens.setAppToken("ABC123");
    actualExtensionAppTokens.setExpireAt(1L);
    actualExtensionAppTokens.setSymphonyToken("ABC123");
    ExtensionAppTokens actualSymphonyTokenResult = actualExtensionAppTokens.symphonyToken("ABC123");
    String actualToStringResult = actualExtensionAppTokens.toString();
    String actualAppId = actualExtensionAppTokens.getAppId();
    String actualAppToken = actualExtensionAppTokens.getAppToken();
    Long actualExpireAt = actualExtensionAppTokens.getExpireAt();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("ABC123", actualAppToken);
    assertEquals("ABC123", actualExtensionAppTokens.getSymphonyToken());
    assertEquals(
        "class ExtensionAppTokens {\n"
            + "    appId: 42\n"
            + "    appToken: ABC123\n"
            + "    symphonyToken: ABC123\n"
            + "    expireAt: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualExpireAt.longValue());
    assertSame(actualExtensionAppTokens, actualAppIdResult);
    assertSame(actualExtensionAppTokens, actualAppTokenResult);
    assertSame(actualExtensionAppTokens, actualExpireAtResult);
    assertSame(actualExtensionAppTokens, actualSymphonyTokenResult);
  }
}
