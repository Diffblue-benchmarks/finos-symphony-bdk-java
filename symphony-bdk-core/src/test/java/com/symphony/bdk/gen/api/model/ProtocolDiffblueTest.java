package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProtocolDiffblueTest {
  /**
   * Test {@link Protocol#equals(Object)}, and {@link Protocol#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Protocol#equals(Object)}
   *   <li>{@link Protocol#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Protocol.equals(Object)", "int Protocol.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Protocol protocol = new Protocol();
    Protocol protocol2 = new Protocol();

    // Act and Assert
    assertEquals(protocol, protocol2);
    assertEquals(protocol.hashCode(), protocol2.hashCode());
  }

  /**
   * Test {@link Protocol#equals(Object)}, and {@link Protocol#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Protocol#equals(Object)}
   *   <li>{@link Protocol#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Protocol.equals(Object)", "int Protocol.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Protocol protocol = new Protocol();

    // Act and Assert
    assertEquals(protocol, protocol);
    int expectedHashCodeResult = protocol.hashCode();
    assertEquals(expectedHashCodeResult, protocol.hashCode());
  }

  /**
   * Test {@link Protocol#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Protocol#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Protocol.equals(Object)", "int Protocol.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Protocol(), null);
  }

  /**
   * Test {@link Protocol#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Protocol#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Protocol.equals(Object)", "int Protocol.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Protocol(), "Different type to Protocol");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Protocol}
   *   <li>{@link Protocol#scheme(String)}
   *   <li>{@link Protocol#setScheme(String)}
   *   <li>{@link Protocol#toString()}
   *   <li>{@link Protocol#getScheme()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Protocol.<init>()",
    "String Protocol.getScheme()",
    "Protocol Protocol.scheme(String)",
    "void Protocol.setScheme(String)",
    "String Protocol.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Protocol actualProtocol = new Protocol();
    Protocol actualSchemeResult = actualProtocol.scheme("Scheme");
    actualProtocol.setScheme("Scheme");
    String actualToStringResult = actualProtocol.toString();

    // Assert
    assertEquals("Scheme", actualProtocol.getScheme());
    assertEquals("class Protocol {\n    scheme: Scheme\n}", actualToStringResult);
    assertSame(actualProtocol, actualSchemeResult);
  }
}
