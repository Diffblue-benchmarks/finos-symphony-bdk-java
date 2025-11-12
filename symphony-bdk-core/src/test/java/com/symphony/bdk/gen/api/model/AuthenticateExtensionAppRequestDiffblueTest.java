package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthenticateExtensionAppRequestDiffblueTest {
  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}, and {@link
   * AuthenticateExtensionAppRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AuthenticateExtensionAppRequest#equals(Object)}
   *   <li>{@link AuthenticateExtensionAppRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AuthenticateExtensionAppRequest authenticateExtensionAppRequest =
        new AuthenticateExtensionAppRequest();
    AuthenticateExtensionAppRequest authenticateExtensionAppRequest2 =
        new AuthenticateExtensionAppRequest();

    // Act and Assert
    assertEquals(authenticateExtensionAppRequest, authenticateExtensionAppRequest2);
    assertEquals(
        authenticateExtensionAppRequest.hashCode(), authenticateExtensionAppRequest2.hashCode());
  }

  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}, and {@link
   * AuthenticateExtensionAppRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AuthenticateExtensionAppRequest#equals(Object)}
   *   <li>{@link AuthenticateExtensionAppRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AuthenticateExtensionAppRequest authenticateExtensionAppRequest =
        new AuthenticateExtensionAppRequest();

    // Act and Assert
    assertEquals(authenticateExtensionAppRequest, authenticateExtensionAppRequest);
    int expectedHashCodeResult = authenticateExtensionAppRequest.hashCode();
    assertEquals(expectedHashCodeResult, authenticateExtensionAppRequest.hashCode());
  }

  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateExtensionAppRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateExtensionAppRequest(), 1);
  }

  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateExtensionAppRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AuthenticateExtensionAppRequest authenticateExtensionAppRequest =
        new AuthenticateExtensionAppRequest();
    authenticateExtensionAppRequest.appToken("ABC123");

    // Act and Assert
    assertNotEquals(authenticateExtensionAppRequest, new AuthenticateExtensionAppRequest());
  }

  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateExtensionAppRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AuthenticateExtensionAppRequest authenticateExtensionAppRequest =
        new AuthenticateExtensionAppRequest();
    authenticateExtensionAppRequest.authToken("ABC123");

    // Act and Assert
    assertNotEquals(authenticateExtensionAppRequest, new AuthenticateExtensionAppRequest());
  }

  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateExtensionAppRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateExtensionAppRequest(), null);
  }

  /**
   * Test {@link AuthenticateExtensionAppRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateExtensionAppRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateExtensionAppRequest.equals(Object)",
    "int AuthenticateExtensionAppRequest.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new AuthenticateExtensionAppRequest(), "Different type to AuthenticateExtensionAppRequest");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AuthenticateExtensionAppRequest}
   *   <li>{@link AuthenticateExtensionAppRequest#appToken(String)}
   *   <li>{@link AuthenticateExtensionAppRequest#authToken(String)}
   *   <li>{@link AuthenticateExtensionAppRequest#setAppToken(String)}
   *   <li>{@link AuthenticateExtensionAppRequest#setAuthToken(String)}
   *   <li>{@link AuthenticateExtensionAppRequest#toString()}
   *   <li>{@link AuthenticateExtensionAppRequest#getAppToken()}
   *   <li>{@link AuthenticateExtensionAppRequest#getAuthToken()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticateExtensionAppRequest.<init>()",
    "AuthenticateExtensionAppRequest AuthenticateExtensionAppRequest.appToken(String)",
    "AuthenticateExtensionAppRequest AuthenticateExtensionAppRequest.authToken(String)",
    "String AuthenticateExtensionAppRequest.getAppToken()",
    "String AuthenticateExtensionAppRequest.getAuthToken()",
    "void AuthenticateExtensionAppRequest.setAppToken(String)",
    "void AuthenticateExtensionAppRequest.setAuthToken(String)",
    "String AuthenticateExtensionAppRequest.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AuthenticateExtensionAppRequest actualAuthenticateExtensionAppRequest =
        new AuthenticateExtensionAppRequest();
    AuthenticateExtensionAppRequest actualAppTokenResult =
        actualAuthenticateExtensionAppRequest.appToken("ABC123");
    AuthenticateExtensionAppRequest actualAuthTokenResult =
        actualAuthenticateExtensionAppRequest.authToken("ABC123");
    actualAuthenticateExtensionAppRequest.setAppToken("ABC123");
    actualAuthenticateExtensionAppRequest.setAuthToken("ABC123");
    String actualToStringResult = actualAuthenticateExtensionAppRequest.toString();
    String actualAppToken = actualAuthenticateExtensionAppRequest.getAppToken();

    // Assert
    assertEquals("ABC123", actualAppToken);
    assertEquals("ABC123", actualAuthenticateExtensionAppRequest.getAuthToken());
    assertEquals(
        "class AuthenticateExtensionAppRequest {\n    appToken: ABC123\n    authToken: ABC123\n}",
        actualToStringResult);
    assertSame(actualAuthenticateExtensionAppRequest, actualAppTokenResult);
    assertSame(actualAuthenticateExtensionAppRequest, actualAuthTokenResult);
  }
}
