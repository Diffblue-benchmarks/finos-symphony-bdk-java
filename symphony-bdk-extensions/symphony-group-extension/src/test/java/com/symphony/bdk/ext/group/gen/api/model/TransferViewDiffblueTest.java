package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TransferViewDiffblueTest {
  /**
   * Test {@link TransferView#equals(Object)}, and {@link TransferView#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransferView#equals(Object)}
   *   <li>{@link TransferView#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TransferView transferView = new TransferView();
    TransferView transferView2 = new TransferView();

    // Act and Assert
    assertEquals(transferView, transferView2);
    int expectedHashCodeResult = transferView.hashCode();
    assertEquals(expectedHashCodeResult, transferView2.hashCode());
  }

  /**
   * Test {@link TransferView#equals(Object)}, and {@link TransferView#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransferView#equals(Object)}
   *   <li>{@link TransferView#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TransferView transferView = new TransferView();

    // Act and Assert
    assertEquals(transferView, transferView);
    int expectedHashCodeResult = transferView.hashCode();
    assertEquals(expectedHashCodeResult, transferView.hashCode());
  }

  /**
   * Test {@link TransferView#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransferView#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TransferView(), 1);
  }

  /**
   * Test {@link TransferView#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransferView#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TransferView transferView = new TransferView();
    transferView.visible(true);

    // Act and Assert
    assertNotEquals(transferView, new TransferView());
  }

  /**
   * Test {@link TransferView#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransferView#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TransferView transferView = new TransferView();
    transferView.restrictToTenants(true);

    // Act and Assert
    assertNotEquals(transferView, new TransferView());
  }

  /**
   * Test {@link TransferView#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransferView#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TransferView transferView = new TransferView();
    transferView.restrictToUsers(true);

    // Act and Assert
    assertNotEquals(transferView, new TransferView());
  }

  /**
   * Test {@link TransferView#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransferView#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TransferView(), null);
  }

  /**
   * Test {@link TransferView#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransferView#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransferView.equals(Object)", "int TransferView.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TransferView(), "Different type to TransferView");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link TransferView}
   *   <li>{@link TransferView#restrictToTenants(Boolean)}
   *   <li>{@link TransferView#restrictToUsers(Boolean)}
   *   <li>{@link TransferView#setRestrictToTenants(Boolean)}
   *   <li>{@link TransferView#setRestrictToUsers(Boolean)}
   *   <li>{@link TransferView#setVisible(Boolean)}
   *   <li>{@link TransferView#visible(Boolean)}
   *   <li>{@link TransferView#toString()}
   *   <li>{@link TransferView#getRestrictToTenants()}
   *   <li>{@link TransferView#getRestrictToUsers()}
   *   <li>{@link TransferView#getVisible()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransferView.<init>()", "Boolean TransferView.getRestrictToTenants()",
      "Boolean TransferView.getRestrictToUsers()", "Boolean TransferView.getVisible()",
      "TransferView TransferView.restrictToTenants(Boolean)", "TransferView TransferView.restrictToUsers(Boolean)",
      "void TransferView.setRestrictToTenants(Boolean)", "void TransferView.setRestrictToUsers(Boolean)",
      "void TransferView.setVisible(Boolean)", "String TransferView.toString()",
      "TransferView TransferView.visible(Boolean)"})
  void testGettersAndSetters() {
    // Arrange and Act
    TransferView actualTransferView = new TransferView();
    TransferView actualRestrictToTenantsResult = actualTransferView.restrictToTenants(true);
    TransferView actualRestrictToUsersResult = actualTransferView.restrictToUsers(true);
    actualTransferView.setRestrictToTenants(true);
    actualTransferView.setRestrictToUsers(true);
    actualTransferView.setVisible(true);
    TransferView actualVisibleResult = actualTransferView.visible(true);
    String actualToStringResult = actualTransferView.toString();
    Boolean actualRestrictToTenants = actualTransferView.getRestrictToTenants();
    Boolean actualRestrictToUsers = actualTransferView.getRestrictToUsers();

    // Assert
    assertEquals("class TransferView {\n    visible: true\n    restrictToTenants: true\n    restrictToUsers: true\n}",
        actualToStringResult);
    assertTrue(actualRestrictToTenants);
    assertTrue(actualRestrictToUsers);
    assertTrue(actualTransferView.getVisible());
    assertSame(actualTransferView, actualRestrictToTenantsResult);
    assertSame(actualTransferView, actualRestrictToUsersResult);
    assertSame(actualTransferView, actualVisibleResult);
  }
}
