package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VisibilityRestrictionDiffblueTest {
  /**
   * Test {@link VisibilityRestriction#equals(Object)}, and {@link VisibilityRestriction#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link VisibilityRestriction#equals(Object)}
   *   <li>{@link VisibilityRestriction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    VisibilityRestriction visibilityRestriction = new VisibilityRestriction();
    VisibilityRestriction visibilityRestriction2 = new VisibilityRestriction();

    // Act and Assert
    assertEquals(visibilityRestriction, visibilityRestriction2);
    int expectedHashCodeResult = visibilityRestriction.hashCode();
    assertEquals(expectedHashCodeResult, visibilityRestriction2.hashCode());
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}, and {@link VisibilityRestriction#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link VisibilityRestriction#equals(Object)}
   *   <li>{@link VisibilityRestriction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    VisibilityRestriction visibilityRestriction = new VisibilityRestriction();

    // Act and Assert
    assertEquals(visibilityRestriction, visibilityRestriction);
    int expectedHashCodeResult = visibilityRestriction.hashCode();
    assertEquals(expectedHashCodeResult, visibilityRestriction.hashCode());
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link VisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new VisibilityRestriction(), 1);
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link VisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    VisibilityRestriction visibilityRestriction = new VisibilityRestriction();
    visibilityRestriction.visible(true);

    // Act and Assert
    assertNotEquals(visibilityRestriction, new VisibilityRestriction());
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link VisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    VisibilityRestriction visibilityRestriction = new VisibilityRestriction();
    visibilityRestriction.restrictToTenants(true);

    // Act and Assert
    assertNotEquals(visibilityRestriction, new VisibilityRestriction());
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link VisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    VisibilityRestriction visibilityRestriction = new VisibilityRestriction();
    visibilityRestriction.restrictToUsers(true);

    // Act and Assert
    assertNotEquals(visibilityRestriction, new VisibilityRestriction());
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link VisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new VisibilityRestriction(), null);
  }

  /**
   * Test {@link VisibilityRestriction#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link VisibilityRestriction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean VisibilityRestriction.equals(Object)", "int VisibilityRestriction.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new VisibilityRestriction(), "Different type to VisibilityRestriction");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link VisibilityRestriction}
   *   <li>{@link VisibilityRestriction#restrictToTenants(Boolean)}
   *   <li>{@link VisibilityRestriction#restrictToUsers(Boolean)}
   *   <li>{@link VisibilityRestriction#setRestrictToTenants(Boolean)}
   *   <li>{@link VisibilityRestriction#setRestrictToUsers(Boolean)}
   *   <li>{@link VisibilityRestriction#setVisible(Boolean)}
   *   <li>{@link VisibilityRestriction#visible(Boolean)}
   *   <li>{@link VisibilityRestriction#toString()}
   *   <li>{@link VisibilityRestriction#getRestrictToTenants()}
   *   <li>{@link VisibilityRestriction#getRestrictToUsers()}
   *   <li>{@link VisibilityRestriction#getVisible()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void VisibilityRestriction.<init>()", "Boolean VisibilityRestriction.getRestrictToTenants()",
      "Boolean VisibilityRestriction.getRestrictToUsers()", "Boolean VisibilityRestriction.getVisible()",
      "VisibilityRestriction VisibilityRestriction.restrictToTenants(Boolean)",
      "VisibilityRestriction VisibilityRestriction.restrictToUsers(Boolean)",
      "void VisibilityRestriction.setRestrictToTenants(Boolean)",
      "void VisibilityRestriction.setRestrictToUsers(Boolean)", "void VisibilityRestriction.setVisible(Boolean)",
      "String VisibilityRestriction.toString()", "VisibilityRestriction VisibilityRestriction.visible(Boolean)"})
  void testGettersAndSetters() {
    // Arrange and Act
    VisibilityRestriction actualVisibilityRestriction = new VisibilityRestriction();
    VisibilityRestriction actualRestrictToTenantsResult = actualVisibilityRestriction.restrictToTenants(true);
    VisibilityRestriction actualRestrictToUsersResult = actualVisibilityRestriction.restrictToUsers(true);
    actualVisibilityRestriction.setRestrictToTenants(true);
    actualVisibilityRestriction.setRestrictToUsers(true);
    actualVisibilityRestriction.setVisible(true);
    VisibilityRestriction actualVisibleResult = actualVisibilityRestriction.visible(true);
    String actualToStringResult = actualVisibilityRestriction.toString();
    Boolean actualRestrictToTenants = actualVisibilityRestriction.getRestrictToTenants();
    Boolean actualRestrictToUsers = actualVisibilityRestriction.getRestrictToUsers();

    // Assert
    assertEquals("class VisibilityRestriction {\n" + "    visible: true\n" + "    restrictToTenants: true\n"
        + "    restrictToUsers: true\n" + "}", actualToStringResult);
    assertTrue(actualRestrictToTenants);
    assertTrue(actualRestrictToUsers);
    assertTrue(actualVisibilityRestriction.getVisible());
    assertSame(actualVisibilityRestriction, actualRestrictToTenantsResult);
    assertSame(actualVisibilityRestriction, actualRestrictToUsersResult);
    assertSame(actualVisibilityRestriction, actualVisibleResult);
  }
}
