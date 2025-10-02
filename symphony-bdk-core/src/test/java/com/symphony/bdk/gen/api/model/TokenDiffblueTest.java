package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TokenDiffblueTest {
  /**
   * Test {@link Token#equals(Object)}, and {@link Token#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Token#equals(Object)}
   *   <li>{@link Token#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Token token = new Token();
    Token token2 = new Token();

    // Act and Assert
    assertEquals(token, token2);
    assertEquals(token.hashCode(), token2.hashCode());
  }

  /**
   * Test {@link Token#equals(Object)}, and {@link Token#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Token#equals(Object)}
   *   <li>{@link Token#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Token token = new Token();

    // Act and Assert
    assertEquals(token, token);
    int expectedHashCodeResult = token.hashCode();
    assertEquals(expectedHashCodeResult, token.hashCode());
  }

  /**
   * Test {@link Token#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Token#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Token(), 1);
  }

  /**
   * Test {@link Token#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Token#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Token token = new Token();
    token.name("Name");

    // Act and Assert
    assertNotEquals(token, new Token());
  }

  /**
   * Test {@link Token#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Token#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Token token = new Token();
    token.token("ABC123");

    // Act and Assert
    assertNotEquals(token, new Token());
  }

  /**
   * Test {@link Token#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Token#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Token token = new Token();
    token.authorizationToken("ABC123");

    // Act and Assert
    assertNotEquals(token, new Token());
  }

  /**
   * Test {@link Token#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Token#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Token(), null);
  }

  /**
   * Test {@link Token#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Token#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Token(), "Different type to Token");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Token}
   *   <li>{@link Token#authorizationToken(String)}
   *   <li>{@link Token#name(String)}
   *   <li>{@link Token#setAuthorizationToken(String)}
   *   <li>{@link Token#setName(String)}
   *   <li>{@link Token#setToken(String)}
   *   <li>{@link Token#token(String)}
   *   <li>{@link Token#toString()}
   *   <li>{@link Token#getAuthorizationToken()}
   *   <li>{@link Token#getName()}
   *   <li>{@link Token#getToken()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Token.<init>()",
    "Token Token.authorizationToken(String)",
    "String Token.getAuthorizationToken()",
    "String Token.getName()",
    "String Token.getToken()",
    "Token Token.name(String)",
    "void Token.setAuthorizationToken(String)",
    "void Token.setName(String)",
    "void Token.setToken(String)",
    "String Token.toString()",
    "Token Token.token(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Token actualToken = new Token();
    Token actualAuthorizationTokenResult = actualToken.authorizationToken("ABC123");
    Token actualNameResult = actualToken.name("Name");
    actualToken.setAuthorizationToken("ABC123");
    actualToken.setName("Name");
    actualToken.setToken("ABC123");
    Token actualTokenResult = actualToken.token("ABC123");
    String actualToStringResult = actualToken.toString();
    String actualAuthorizationToken = actualToken.getAuthorizationToken();
    String actualName = actualToken.getName();

    // Assert
    assertEquals("ABC123", actualAuthorizationToken);
    assertEquals("ABC123", actualToken.getToken());
    assertEquals("Name", actualName);
    assertEquals(
        "class Token {\n    name: Name\n    token: ABC123\n    authorizationToken: ABC123\n}",
        actualToStringResult);
    assertSame(actualToken, actualAuthorizationTokenResult);
    assertSame(actualToken, actualNameResult);
    assertSame(actualToken, actualTokenResult);
  }
}
