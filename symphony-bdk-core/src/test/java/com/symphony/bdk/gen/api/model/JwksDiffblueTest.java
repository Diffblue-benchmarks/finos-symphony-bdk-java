package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JwksDiffblueTest {
  /**
   * Test {@link Jwks#addKeysItem(Map)}.
   *
   * <ul>
   *   <li>Given {@link Jwks} (default constructor) keys {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Jwks#addKeysItem(Map)}
   */
  @Test
  @DisplayName("Test addKeysItem(Map); given Jwks (default constructor) keys ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Jwks Jwks.addKeysItem(Map)"})
  void testAddKeysItem_givenJwksKeysArrayList() {
    // Arrange
    Jwks jwks = new Jwks();
    jwks.keys(new ArrayList<>());

    // Act
    Jwks actualAddKeysItemResult = jwks.addKeysItem(new HashMap<>());

    // Assert
    assertSame(jwks, actualAddKeysItemResult);
  }

  /**
   * Test {@link Jwks#addKeysItem(Map)}.
   *
   * <ul>
   *   <li>Given {@link Jwks} (default constructor).
   *   <li>Then return Keys size is one.
   * </ul>
   *
   * <p>Method under test: {@link Jwks#addKeysItem(Map)}
   */
  @Test
  @DisplayName(
      "Test addKeysItem(Map); given Jwks (default constructor); then return Keys size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Jwks Jwks.addKeysItem(Map)"})
  void testAddKeysItem_givenJwks_thenReturnKeysSizeIsOne() {
    // Arrange
    Jwks jwks = new Jwks();

    // Act
    Jwks actualAddKeysItemResult = jwks.addKeysItem(new HashMap<>());

    // Assert
    List<Map<String, String>> keys = actualAddKeysItemResult.getKeys();
    assertEquals(1, keys.size());
    assertTrue(keys.get(0).isEmpty());
    assertSame(jwks, actualAddKeysItemResult);
  }

  /**
   * Test {@link Jwks#equals(Object)}, and {@link Jwks#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Jwks#equals(Object)}
   *   <li>{@link Jwks#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Jwks.equals(Object)", "int Jwks.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Jwks jwks = new Jwks();
    Jwks jwks2 = new Jwks();

    // Act and Assert
    assertEquals(jwks, jwks2);
    assertEquals(jwks.hashCode(), jwks2.hashCode());
  }

  /**
   * Test {@link Jwks#equals(Object)}, and {@link Jwks#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Jwks#equals(Object)}
   *   <li>{@link Jwks#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Jwks.equals(Object)", "int Jwks.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Jwks jwks = new Jwks();

    // Act and Assert
    assertEquals(jwks, jwks);
    int expectedHashCodeResult = jwks.hashCode();
    assertEquals(expectedHashCodeResult, jwks.hashCode());
  }

  /**
   * Test {@link Jwks#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Jwks#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Jwks.equals(Object)", "int Jwks.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Jwks jwks = new Jwks();
    jwks.addKeysItem(new HashMap<>());

    // Act and Assert
    assertNotEquals(jwks, new Jwks());
  }

  /**
   * Test {@link Jwks#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Jwks#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Jwks.equals(Object)", "int Jwks.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Jwks(), null);
  }

  /**
   * Test {@link Jwks#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Jwks#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Jwks.equals(Object)", "int Jwks.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Jwks(), "Different type to Jwks");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Jwks}
   *   <li>{@link Jwks#keys(List)}
   *   <li>{@link Jwks#setKeys(List)}
   *   <li>{@link Jwks#toString()}
   *   <li>{@link Jwks#getKeys()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Jwks.<init>()",
    "List Jwks.getKeys()",
    "Jwks Jwks.keys(List)",
    "void Jwks.setKeys(List)",
    "String Jwks.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Jwks actualJwks = new Jwks();
    Jwks actualKeysResult = actualJwks.keys(new ArrayList<>());
    ArrayList<Map<String, String>> keys = new ArrayList<>();
    actualJwks.setKeys(keys);
    String actualToStringResult = actualJwks.toString();
    List<Map<String, String>> actualKeys = actualJwks.getKeys();

    // Assert
    assertEquals("class Jwks {\n    keys: []\n}", actualToStringResult);
    assertTrue(actualKeys.isEmpty());
    assertSame(actualJwks, actualKeysResult);
    assertSame(keys, actualKeys);
  }
}
