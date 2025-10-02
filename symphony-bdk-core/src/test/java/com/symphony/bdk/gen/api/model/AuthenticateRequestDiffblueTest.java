package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthenticateRequestDiffblueTest {
  /**
   * Test {@link AuthenticateRequest#equals(Object)}, and {@link AuthenticateRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AuthenticateRequest#equals(Object)}
   *   <li>{@link AuthenticateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateRequest.equals(Object)",
    "int AuthenticateRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AuthenticateRequest authenticateRequest = new AuthenticateRequest();
    AuthenticateRequest authenticateRequest2 = new AuthenticateRequest();

    // Act and Assert
    assertEquals(authenticateRequest, authenticateRequest2);
    assertEquals(authenticateRequest.hashCode(), authenticateRequest2.hashCode());
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}, and {@link AuthenticateRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AuthenticateRequest#equals(Object)}
   *   <li>{@link AuthenticateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateRequest.equals(Object)",
    "int AuthenticateRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AuthenticateRequest authenticateRequest = new AuthenticateRequest();

    // Act and Assert
    assertEquals(authenticateRequest, authenticateRequest);
    int expectedHashCodeResult = authenticateRequest.hashCode();
    assertEquals(expectedHashCodeResult, authenticateRequest.hashCode());
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateRequest.equals(Object)",
    "int AuthenticateRequest.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateRequest(), null);
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AuthenticateRequest.equals(Object)",
    "int AuthenticateRequest.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateRequest(), "Different type to AuthenticateRequest");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AuthenticateRequest}
   *   <li>{@link AuthenticateRequest#setToken(String)}
   *   <li>{@link AuthenticateRequest#token(String)}
   *   <li>{@link AuthenticateRequest#toString()}
   *   <li>{@link AuthenticateRequest#getToken()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticateRequest.<init>()",
    "String AuthenticateRequest.getToken()",
    "void AuthenticateRequest.setToken(String)",
    "String AuthenticateRequest.toString()",
    "AuthenticateRequest AuthenticateRequest.token(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AuthenticateRequest actualAuthenticateRequest = new AuthenticateRequest();
    actualAuthenticateRequest.setToken("ABC123");
    AuthenticateRequest actualTokenResult = actualAuthenticateRequest.token("ABC123");
    String actualToStringResult = actualAuthenticateRequest.toString();

    // Assert
    assertEquals("ABC123", actualAuthenticateRequest.getToken());
    assertEquals("class AuthenticateRequest {\n    token: ABC123\n}", actualToStringResult);
    assertSame(actualAuthenticateRequest, actualTokenResult);
  }
}
