package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GroupItemDiffblueTest {
  /**
   * Test {@link GroupItem#equals(Object)}, and {@link GroupItem#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GroupItem#equals(Object)}
   *   <li>{@link GroupItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupItem.equals(Object)", "int GroupItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupItem groupItem = new GroupItem();
    GroupItem groupItem2 = new GroupItem();

    // Act and Assert
    assertEquals(groupItem, groupItem2);
    int expectedHashCodeResult = groupItem.hashCode();
    assertEquals(expectedHashCodeResult, groupItem2.hashCode());
  }

  /**
   * Test {@link GroupItem#equals(Object)}, and {@link GroupItem#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GroupItem#equals(Object)}
   *   <li>{@link GroupItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupItem.equals(Object)", "int GroupItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupItem groupItem = new GroupItem();

    // Act and Assert
    assertEquals(groupItem, groupItem);
    int expectedHashCodeResult = groupItem.hashCode();
    assertEquals(expectedHashCodeResult, groupItem.hashCode());
  }

  /**
   * Test {@link GroupItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupItem.equals(Object)", "int GroupItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GroupItem groupItem = new GroupItem();
    groupItem.addedBy(1L);

    // Act and Assert
    assertNotEquals(groupItem, new GroupItem());
  }

  /**
   * Test {@link GroupItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupItem.equals(Object)", "int GroupItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GroupItem groupItem = new GroupItem();
    groupItem.id(1L);
    groupItem.addedBy(1L);

    // Act and Assert
    assertNotEquals(groupItem, new GroupItem());
  }

  /**
   * Test {@link GroupItem#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupItem.equals(Object)", "int GroupItem.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupItem(), null);
  }

  /**
   * Test {@link GroupItem#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupItem.equals(Object)", "int GroupItem.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupItem(), "Different type to GroupItem");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupItem}
   *   <li>{@link GroupItem#id(Long)}
   *   <li>{@link GroupItem#setAddedBy(Long)}
   *   <li>{@link GroupItem#setId(Long)}
   *   <li>{@link GroupItem#addedBy(Long)}
   *   <li>{@link GroupItem#toString()}
   *   <li>{@link GroupItem#getAddedBy()}
   *   <li>{@link GroupItem#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GroupItem.<init>()", "GroupItem GroupItem.addedBy(Long)", "Long GroupItem.getAddedBy()",
      "Long GroupItem.getId()", "GroupItem GroupItem.id(Long)", "void GroupItem.setAddedBy(Long)",
      "void GroupItem.setId(Long)", "String GroupItem.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    GroupItem actualGroupItem = new GroupItem();
    GroupItem actualIdResult = actualGroupItem.id(1L);
    actualGroupItem.setAddedBy(1L);
    actualGroupItem.setId(1L);
    GroupItem actualAddedByResult = actualGroupItem.addedBy(1L);
    String actualToStringResult = actualGroupItem.toString();
    Long actualAddedBy = actualGroupItem.getAddedBy();
    Long actualId = actualGroupItem.getId();

    // Assert
    assertEquals("class GroupItem {\n    id: 1\n    addedBy: 1\n}", actualToStringResult);
    assertEquals(1L, actualAddedBy.longValue());
    assertEquals(1L, actualId.longValue());
    assertSame(actualGroupItem, actualAddedByResult);
    assertSame(actualGroupItem, actualIdResult);
  }
}
