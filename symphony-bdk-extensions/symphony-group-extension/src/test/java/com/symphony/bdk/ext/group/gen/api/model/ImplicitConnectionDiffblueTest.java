package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImplicitConnectionDiffblueTest {
  /**
   * Test {@link ImplicitConnection#equals(Object)}, and {@link ImplicitConnection#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ImplicitConnection#equals(Object)}
   *   <li>{@link ImplicitConnection#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImplicitConnection implicitConnection = new ImplicitConnection();
    ImplicitConnection implicitConnection2 = new ImplicitConnection();

    // Act and Assert
    assertEquals(implicitConnection, implicitConnection2);
    int expectedHashCodeResult = implicitConnection.hashCode();
    assertEquals(expectedHashCodeResult, implicitConnection2.hashCode());
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}, and {@link ImplicitConnection#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ImplicitConnection#equals(Object)}
   *   <li>{@link ImplicitConnection#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImplicitConnection implicitConnection = new ImplicitConnection();

    // Act and Assert
    assertEquals(implicitConnection, implicitConnection);
    int expectedHashCodeResult = implicitConnection.hashCode();
    assertEquals(expectedHashCodeResult, implicitConnection.hashCode());
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImplicitConnection(), 1);
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ImplicitConnection implicitConnection = new ImplicitConnection();
    implicitConnection.all(true);

    // Act and Assert
    assertNotEquals(implicitConnection, new ImplicitConnection());
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ImplicitConnection implicitConnection = new ImplicitConnection();
    implicitConnection.connectToTenants(true);

    // Act and Assert
    assertNotEquals(implicitConnection, new ImplicitConnection());
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ImplicitConnection implicitConnection = new ImplicitConnection();
    implicitConnection.connectToUsers(true);

    // Act and Assert
    assertNotEquals(implicitConnection, new ImplicitConnection());
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImplicitConnection(), null);
  }

  /**
   * Test {@link ImplicitConnection#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImplicitConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImplicitConnection.equals(Object)", "int ImplicitConnection.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImplicitConnection(), "Different type to ImplicitConnection");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ImplicitConnection}
   *   <li>{@link ImplicitConnection#all(Boolean)}
   *   <li>{@link ImplicitConnection#connectToTenants(Boolean)}
   *   <li>{@link ImplicitConnection#connectToUsers(Boolean)}
   *   <li>{@link ImplicitConnection#setAll(Boolean)}
   *   <li>{@link ImplicitConnection#setConnectToTenants(Boolean)}
   *   <li>{@link ImplicitConnection#setConnectToUsers(Boolean)}
   *   <li>{@link ImplicitConnection#toString()}
   *   <li>{@link ImplicitConnection#getAll()}
   *   <li>{@link ImplicitConnection#getConnectToTenants()}
   *   <li>{@link ImplicitConnection#getConnectToUsers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ImplicitConnection.<init>()", "ImplicitConnection ImplicitConnection.all(Boolean)",
      "ImplicitConnection ImplicitConnection.connectToTenants(Boolean)",
      "ImplicitConnection ImplicitConnection.connectToUsers(Boolean)", "Boolean ImplicitConnection.getAll()",
      "Boolean ImplicitConnection.getConnectToTenants()", "Boolean ImplicitConnection.getConnectToUsers()",
      "void ImplicitConnection.setAll(Boolean)", "void ImplicitConnection.setConnectToTenants(Boolean)",
      "void ImplicitConnection.setConnectToUsers(Boolean)", "String ImplicitConnection.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ImplicitConnection actualImplicitConnection = new ImplicitConnection();
    ImplicitConnection actualAllResult = actualImplicitConnection.all(true);
    ImplicitConnection actualConnectToTenantsResult = actualImplicitConnection.connectToTenants(true);
    ImplicitConnection actualConnectToUsersResult = actualImplicitConnection.connectToUsers(true);
    actualImplicitConnection.setAll(true);
    actualImplicitConnection.setConnectToTenants(true);
    actualImplicitConnection.setConnectToUsers(true);
    String actualToStringResult = actualImplicitConnection.toString();
    Boolean actualAll = actualImplicitConnection.getAll();
    Boolean actualConnectToTenants = actualImplicitConnection.getConnectToTenants();

    // Assert
    assertEquals("class ImplicitConnection {\n    all: true\n    connectToTenants: true\n    connectToUsers: true\n}",
        actualToStringResult);
    assertTrue(actualAll);
    assertTrue(actualConnectToTenants);
    assertTrue(actualImplicitConnection.getConnectToUsers());
    assertSame(actualImplicitConnection, actualAllResult);
    assertSame(actualImplicitConnection, actualConnectToTenantsResult);
    assertSame(actualImplicitConnection, actualConnectToUsersResult);
  }
}
