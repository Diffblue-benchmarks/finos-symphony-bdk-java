package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableRoomAttributesDiffblueTest {
  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}, and {@link
   * ImmutableRoomAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableRoomAttributes#equals(Object)}
   *   <li>{@link ImmutableRoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();
    ImmutableRoomAttributes immutableRoomAttributes2 = new ImmutableRoomAttributes();

    // Act and Assert
    assertEquals(immutableRoomAttributes, immutableRoomAttributes2);
    assertEquals(immutableRoomAttributes.hashCode(), immutableRoomAttributes2.hashCode());
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}, and {@link
   * ImmutableRoomAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableRoomAttributes#equals(Object)}
   *   <li>{@link ImmutableRoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();

    // Act and Assert
    assertEquals(immutableRoomAttributes, immutableRoomAttributes);
    int expectedHashCodeResult = immutableRoomAttributes.hashCode();
    assertEquals(expectedHashCodeResult, immutableRoomAttributes.hashCode());
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImmutableRoomAttributes(), 1);
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();
    immutableRoomAttributes._public(true);

    // Act and Assert
    assertNotEquals(immutableRoomAttributes, new ImmutableRoomAttributes());
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();
    immutableRoomAttributes.readOnly(true);

    // Act and Assert
    assertNotEquals(immutableRoomAttributes, new ImmutableRoomAttributes());
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();
    immutableRoomAttributes.copyProtected(true);

    // Act and Assert
    assertNotEquals(immutableRoomAttributes, new ImmutableRoomAttributes());
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImmutableRoomAttributes(), null);
  }

  /**
   * Test {@link ImmutableRoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRoomAttributes.equals(Object)",
    "int ImmutableRoomAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImmutableRoomAttributes(), "Different type to ImmutableRoomAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ImmutableRoomAttributes}
   *   <li>{@link ImmutableRoomAttributes#_public(Boolean)}
   *   <li>{@link ImmutableRoomAttributes#copyProtected(Boolean)}
   *   <li>{@link ImmutableRoomAttributes#readOnly(Boolean)}
   *   <li>{@link ImmutableRoomAttributes#setCopyProtected(Boolean)}
   *   <li>{@link ImmutableRoomAttributes#setPublic(Boolean)}
   *   <li>{@link ImmutableRoomAttributes#setReadOnly(Boolean)}
   *   <li>{@link ImmutableRoomAttributes#toString()}
   *   <li>{@link ImmutableRoomAttributes#getCopyProtected()}
   *   <li>{@link ImmutableRoomAttributes#getPublic()}
   *   <li>{@link ImmutableRoomAttributes#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableRoomAttributes.<init>()",
    "ImmutableRoomAttributes ImmutableRoomAttributes._public(Boolean)",
    "ImmutableRoomAttributes ImmutableRoomAttributes.copyProtected(Boolean)",
    "Boolean ImmutableRoomAttributes.getCopyProtected()",
    "Boolean ImmutableRoomAttributes.getPublic()",
    "Boolean ImmutableRoomAttributes.getReadOnly()",
    "ImmutableRoomAttributes ImmutableRoomAttributes.readOnly(Boolean)",
    "void ImmutableRoomAttributes.setCopyProtected(Boolean)",
    "void ImmutableRoomAttributes.setPublic(Boolean)",
    "void ImmutableRoomAttributes.setReadOnly(Boolean)",
    "String ImmutableRoomAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ImmutableRoomAttributes actualImmutableRoomAttributes = new ImmutableRoomAttributes();
    ImmutableRoomAttributes actual_publicResult = actualImmutableRoomAttributes._public(true);
    ImmutableRoomAttributes actualCopyProtectedResult =
        actualImmutableRoomAttributes.copyProtected(true);
    ImmutableRoomAttributes actualReadOnlyResult = actualImmutableRoomAttributes.readOnly(true);
    actualImmutableRoomAttributes.setCopyProtected(true);
    actualImmutableRoomAttributes.setPublic(true);
    actualImmutableRoomAttributes.setReadOnly(true);
    String actualToStringResult = actualImmutableRoomAttributes.toString();
    Boolean actualCopyProtected = actualImmutableRoomAttributes.getCopyProtected();
    Boolean actualPublic = actualImmutableRoomAttributes.getPublic();

    // Assert
    assertEquals(
        "class ImmutableRoomAttributes {\n    _public: true\n    readOnly: true\n    copyProtected: true\n}",
        actualToStringResult);
    assertTrue(actualCopyProtected);
    assertTrue(actualPublic);
    assertTrue(actualImmutableRoomAttributes.getReadOnly());
    assertSame(actualImmutableRoomAttributes, actual_publicResult);
    assertSame(actualImmutableRoomAttributes, actualCopyProtectedResult);
    assertSame(actualImmutableRoomAttributes, actualReadOnlyResult);
  }
}
