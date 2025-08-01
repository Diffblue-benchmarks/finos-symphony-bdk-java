package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExtensionAppAuthenticateRequestDiffblueTest {
  /**
   * Test {@link ExtensionAppAuthenticateRequest#equals(Object)}, and {@link
   * ExtensionAppAuthenticateRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtensionAppAuthenticateRequest#equals(Object)}
   *   <li>{@link ExtensionAppAuthenticateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppAuthenticateRequest.equals(Object)",
    "int ExtensionAppAuthenticateRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ExtensionAppAuthenticateRequest extensionAppAuthenticateRequest =
        new ExtensionAppAuthenticateRequest();
    ExtensionAppAuthenticateRequest extensionAppAuthenticateRequest2 =
        new ExtensionAppAuthenticateRequest();

    // Act and Assert
    assertEquals(extensionAppAuthenticateRequest, extensionAppAuthenticateRequest2);
    int expectedHashCodeResult = extensionAppAuthenticateRequest.hashCode();
    assertEquals(expectedHashCodeResult, extensionAppAuthenticateRequest2.hashCode());
  }

  /**
   * Test {@link ExtensionAppAuthenticateRequest#equals(Object)}, and {@link
   * ExtensionAppAuthenticateRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtensionAppAuthenticateRequest#equals(Object)}
   *   <li>{@link ExtensionAppAuthenticateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppAuthenticateRequest.equals(Object)",
    "int ExtensionAppAuthenticateRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ExtensionAppAuthenticateRequest extensionAppAuthenticateRequest =
        new ExtensionAppAuthenticateRequest();

    // Act and Assert
    assertEquals(extensionAppAuthenticateRequest, extensionAppAuthenticateRequest);
    int expectedHashCodeResult = extensionAppAuthenticateRequest.hashCode();
    assertEquals(expectedHashCodeResult, extensionAppAuthenticateRequest.hashCode());
  }

  /**
   * Test {@link ExtensionAppAuthenticateRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppAuthenticateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppAuthenticateRequest.equals(Object)",
    "int ExtensionAppAuthenticateRequest.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ExtensionAppAuthenticateRequest(), null);
  }

  /**
   * Test {@link ExtensionAppAuthenticateRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppAuthenticateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtensionAppAuthenticateRequest.equals(Object)",
    "int ExtensionAppAuthenticateRequest.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new ExtensionAppAuthenticateRequest(), "Different type to ExtensionAppAuthenticateRequest");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ExtensionAppAuthenticateRequest}
   *   <li>{@link ExtensionAppAuthenticateRequest#appToken(String)}
   *   <li>{@link ExtensionAppAuthenticateRequest#setAppToken(String)}
   *   <li>{@link ExtensionAppAuthenticateRequest#toString()}
   *   <li>{@link ExtensionAppAuthenticateRequest#getAppToken()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ExtensionAppAuthenticateRequest.<init>()",
    "ExtensionAppAuthenticateRequest ExtensionAppAuthenticateRequest.appToken(String)",
    "String ExtensionAppAuthenticateRequest.getAppToken()",
    "void ExtensionAppAuthenticateRequest.setAppToken(String)",
    "String ExtensionAppAuthenticateRequest.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ExtensionAppAuthenticateRequest actualExtensionAppAuthenticateRequest =
        new ExtensionAppAuthenticateRequest();
    ExtensionAppAuthenticateRequest actualAppTokenResult =
        actualExtensionAppAuthenticateRequest.appToken("ABC123");
    actualExtensionAppAuthenticateRequest.setAppToken("ABC123");
    String actualToStringResult = actualExtensionAppAuthenticateRequest.toString();

    // Assert
    assertEquals("ABC123", actualExtensionAppAuthenticateRequest.getAppToken());
    assertEquals(
        "class ExtensionAppAuthenticateRequest {\n    appToken: ABC123\n}", actualToStringResult);
    assertSame(actualExtensionAppAuthenticateRequest, actualAppTokenResult);
  }
}
