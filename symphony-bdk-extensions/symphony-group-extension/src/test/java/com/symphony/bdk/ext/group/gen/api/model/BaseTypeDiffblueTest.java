package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BaseTypeDiffblueTest {
  /**
   * Test {@link BaseType#equals(Object)}, and {@link BaseType#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BaseType#equals(Object)}
   *   <li>{@link BaseType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BaseType baseType = new BaseType();
    BaseType baseType2 = new BaseType();

    // Act and Assert
    assertEquals(baseType, baseType2);
    int expectedHashCodeResult = baseType.hashCode();
    assertEquals(expectedHashCodeResult, baseType2.hashCode());
  }

  /**
   * Test {@link BaseType#equals(Object)}, and {@link BaseType#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BaseType#equals(Object)}
   *   <li>{@link BaseType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BaseType baseType = new BaseType();

    // Act and Assert
    assertEquals(baseType, baseType);
    int expectedHashCodeResult = baseType.hashCode();
    assertEquals(expectedHashCodeResult, baseType.hashCode());
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseType(), 1);
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BaseType baseType = new BaseType();
    baseType.id("42");

    // Act and Assert
    assertNotEquals(baseType, new BaseType());
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    BaseType baseType = new BaseType();
    baseType.ownerType(Owner.PLATFORM);

    // Act and Assert
    assertNotEquals(baseType, new BaseType());
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    BaseType baseType = new BaseType();
    baseType.name("Name");

    // Act and Assert
    assertNotEquals(baseType, new BaseType());
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    BaseType baseType = new BaseType();
    baseType.status(Status.ACTIVE);

    // Act and Assert
    assertNotEquals(baseType, new BaseType());
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseType(), null);
  }

  /**
   * Test {@link BaseType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseType.equals(Object)", "int BaseType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseType(), "Different type to BaseType");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link BaseType}
   *   <li>{@link BaseType#id(String)}
   *   <li>{@link BaseType#name(String)}
   *   <li>{@link BaseType#ownerType(Owner)}
   *   <li>{@link BaseType#setId(String)}
   *   <li>{@link BaseType#setName(String)}
   *   <li>{@link BaseType#setOwnerType(Owner)}
   *   <li>{@link BaseType#setStatus(Status)}
   *   <li>{@link BaseType#status(Status)}
   *   <li>{@link BaseType#toString()}
   *   <li>{@link BaseType#getId()}
   *   <li>{@link BaseType#getName()}
   *   <li>{@link BaseType#getOwnerType()}
   *   <li>{@link BaseType#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BaseType.<init>()",
    "String BaseType.getId()",
    "String BaseType.getName()",
    "Owner BaseType.getOwnerType()",
    "Status BaseType.getStatus()",
    "BaseType BaseType.id(String)",
    "BaseType BaseType.name(String)",
    "BaseType BaseType.ownerType(Owner)",
    "void BaseType.setId(String)",
    "void BaseType.setName(String)",
    "void BaseType.setOwnerType(Owner)",
    "void BaseType.setStatus(Status)",
    "BaseType BaseType.status(Status)",
    "String BaseType.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    BaseType actualBaseType = new BaseType();
    BaseType actualIdResult = actualBaseType.id("42");
    BaseType actualNameResult = actualBaseType.name("Name");
    BaseType actualOwnerTypeResult = actualBaseType.ownerType(Owner.PLATFORM);
    actualBaseType.setId("42");
    actualBaseType.setName("Name");
    actualBaseType.setOwnerType(Owner.PLATFORM);
    actualBaseType.setStatus(Status.ACTIVE);
    BaseType actualStatusResult = actualBaseType.status(Status.ACTIVE);
    String actualToStringResult = actualBaseType.toString();
    String actualId = actualBaseType.getId();
    String actualName = actualBaseType.getName();
    Owner actualOwnerType = actualBaseType.getOwnerType();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals(
        "class BaseType {\n    id: 42\n    ownerType: PLATFORM\n    name: Name\n    status: ACTIVE\n}",
        actualToStringResult);
    assertEquals(Owner.PLATFORM, actualOwnerType);
    assertEquals(Status.ACTIVE, actualBaseType.getStatus());
    assertSame(actualBaseType, actualIdResult);
    assertSame(actualBaseType, actualNameResult);
    assertSame(actualBaseType, actualOwnerTypeResult);
    assertSame(actualBaseType, actualStatusResult);
  }
}
