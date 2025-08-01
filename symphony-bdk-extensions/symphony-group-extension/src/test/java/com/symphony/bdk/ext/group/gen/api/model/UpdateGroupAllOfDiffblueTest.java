package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UpdateGroupAllOfDiffblueTest {
  /**
   * Test {@link UpdateGroupAllOf#geteTag()}.
   *
   * <p>Method under test: {@link UpdateGroupAllOf#geteTag()}
   */
  @Test
  @DisplayName("Test geteTag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UpdateGroupAllOf.geteTag()"})
  void testGeteTag() {
    // Arrange, Act and Assert
    assertNull(new UpdateGroupAllOf().geteTag());
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}, and {@link UpdateGroupAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UpdateGroupAllOf#equals(Object)}
   *   <li>{@link UpdateGroupAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UpdateGroupAllOf updateGroupAllOf = new UpdateGroupAllOf();
    UpdateGroupAllOf updateGroupAllOf2 = new UpdateGroupAllOf();

    // Act and Assert
    assertEquals(updateGroupAllOf, updateGroupAllOf2);
    int expectedHashCodeResult = updateGroupAllOf.hashCode();
    assertEquals(expectedHashCodeResult, updateGroupAllOf2.hashCode());
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}, and {@link UpdateGroupAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UpdateGroupAllOf#equals(Object)}
   *   <li>{@link UpdateGroupAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UpdateGroupAllOf updateGroupAllOf = new UpdateGroupAllOf();

    // Act and Assert
    assertEquals(updateGroupAllOf, updateGroupAllOf);
    int expectedHashCodeResult = updateGroupAllOf.hashCode();
    assertEquals(expectedHashCodeResult, updateGroupAllOf.hashCode());
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UpdateGroupAllOf(), 1);
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UpdateGroupAllOf updateGroupAllOf = new UpdateGroupAllOf();
    updateGroupAllOf.id("42");

    // Act and Assert
    assertNotEquals(updateGroupAllOf, new UpdateGroupAllOf());
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UpdateGroupAllOf updateGroupAllOf = new UpdateGroupAllOf();
    updateGroupAllOf.status(Status.ACTIVE);

    // Act and Assert
    assertNotEquals(updateGroupAllOf, new UpdateGroupAllOf());
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UpdateGroupAllOf updateGroupAllOf = new UpdateGroupAllOf();
    updateGroupAllOf.eTag("E Tag");

    // Act and Assert
    assertNotEquals(updateGroupAllOf, new UpdateGroupAllOf());
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UpdateGroupAllOf(), null);
  }

  /**
   * Test {@link UpdateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroupAllOf.equals(Object)", "int UpdateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UpdateGroupAllOf(), "Different type to UpdateGroupAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UpdateGroupAllOf}
   *   <li>{@link UpdateGroupAllOf#eTag(String)}
   *   <li>{@link UpdateGroupAllOf#id(String)}
   *   <li>{@link UpdateGroupAllOf#setId(String)}
   *   <li>{@link UpdateGroupAllOf#setStatus(Status)}
   *   <li>{@link UpdateGroupAllOf#seteTag(String)}
   *   <li>{@link UpdateGroupAllOf#status(Status)}
   *   <li>{@link UpdateGroupAllOf#toString()}
   *   <li>{@link UpdateGroupAllOf#getId()}
   *   <li>{@link UpdateGroupAllOf#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UpdateGroupAllOf.<init>()",
    "UpdateGroupAllOf UpdateGroupAllOf.eTag(String)",
    "String UpdateGroupAllOf.getId()",
    "Status UpdateGroupAllOf.getStatus()",
    "UpdateGroupAllOf UpdateGroupAllOf.id(String)",
    "void UpdateGroupAllOf.setId(String)",
    "void UpdateGroupAllOf.setStatus(Status)",
    "void UpdateGroupAllOf.seteTag(String)",
    "UpdateGroupAllOf UpdateGroupAllOf.status(Status)",
    "String UpdateGroupAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UpdateGroupAllOf actualUpdateGroupAllOf = new UpdateGroupAllOf();
    UpdateGroupAllOf actualETagResult = actualUpdateGroupAllOf.eTag("E Tag");
    UpdateGroupAllOf actualIdResult = actualUpdateGroupAllOf.id("42");
    actualUpdateGroupAllOf.setId("42");
    actualUpdateGroupAllOf.setStatus(Status.ACTIVE);
    actualUpdateGroupAllOf.seteTag("E Tag");
    UpdateGroupAllOf actualStatusResult = actualUpdateGroupAllOf.status(Status.ACTIVE);
    String actualToStringResult = actualUpdateGroupAllOf.toString();
    String actualId = actualUpdateGroupAllOf.getId();

    // Assert
    assertEquals("42", actualId);
    assertEquals(
        "class UpdateGroupAllOf {\n    id: 42\n    status: ACTIVE\n    eTag: E Tag\n}",
        actualToStringResult);
    assertEquals(Status.ACTIVE, actualUpdateGroupAllOf.getStatus());
    assertSame(actualUpdateGroupAllOf, actualETagResult);
    assertSame(actualUpdateGroupAllOf, actualIdResult);
    assertSame(actualUpdateGroupAllOf, actualStatusResult);
  }
}
