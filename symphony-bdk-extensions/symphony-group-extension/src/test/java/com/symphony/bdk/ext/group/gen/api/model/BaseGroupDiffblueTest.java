package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BaseGroupDiffblueTest {
  /**
   * Test {@link BaseGroup#equals(Object)}, and {@link BaseGroup#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BaseGroup#equals(Object)}
   *   <li>{@link BaseGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BaseGroup baseGroup = new BaseGroup();
    BaseGroup baseGroup2 = new BaseGroup();

    // Act and Assert
    assertEquals(baseGroup, baseGroup2);
    int expectedHashCodeResult = baseGroup.hashCode();
    assertEquals(expectedHashCodeResult, baseGroup2.hashCode());
  }

  /**
   * Test {@link BaseGroup#equals(Object)}, and {@link BaseGroup#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BaseGroup#equals(Object)}
   *   <li>{@link BaseGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BaseGroup baseGroup = new BaseGroup();

    // Act and Assert
    assertEquals(baseGroup, baseGroup);
    int expectedHashCodeResult = baseGroup.hashCode();
    assertEquals(expectedHashCodeResult, baseGroup.hashCode());
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseGroup(), 1);
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BaseGroup baseGroup = new BaseGroup();
    baseGroup.type("Type");

    // Act and Assert
    assertNotEquals(baseGroup, new BaseGroup());
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    BaseGroup baseGroup = new BaseGroup();
    baseGroup.ownerType(Owner.PLATFORM);

    // Act and Assert
    assertNotEquals(baseGroup, new BaseGroup());
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    BaseGroup baseGroup = new BaseGroup();
    baseGroup.ownerId(1L);

    // Act and Assert
    assertNotEquals(baseGroup, new BaseGroup());
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    BaseGroup baseGroup = new BaseGroup();
    baseGroup.name("Name");

    // Act and Assert
    assertNotEquals(baseGroup, new BaseGroup());
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseGroup(), null);
  }

  /**
   * Test {@link BaseGroup#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseGroup.equals(Object)", "int BaseGroup.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseGroup(), "Different type to BaseGroup");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BaseGroup}
   *   <li>{@link BaseGroup#name(String)}
   *   <li>{@link BaseGroup#ownerId(Long)}
   *   <li>{@link BaseGroup#ownerType(Owner)}
   *   <li>{@link BaseGroup#setName(String)}
   *   <li>{@link BaseGroup#setOwnerId(Long)}
   *   <li>{@link BaseGroup#setOwnerType(Owner)}
   *   <li>{@link BaseGroup#setType(String)}
   *   <li>{@link BaseGroup#type(String)}
   *   <li>{@link BaseGroup#toString()}
   *   <li>{@link BaseGroup#getName()}
   *   <li>{@link BaseGroup#getOwnerId()}
   *   <li>{@link BaseGroup#getOwnerType()}
   *   <li>{@link BaseGroup#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BaseGroup.<init>()", "String BaseGroup.getName()", "Long BaseGroup.getOwnerId()",
      "Owner BaseGroup.getOwnerType()", "String BaseGroup.getType()", "BaseGroup BaseGroup.name(String)",
      "BaseGroup BaseGroup.ownerId(Long)", "BaseGroup BaseGroup.ownerType(Owner)", "void BaseGroup.setName(String)",
      "void BaseGroup.setOwnerId(Long)", "void BaseGroup.setOwnerType(Owner)", "void BaseGroup.setType(String)",
      "String BaseGroup.toString()", "BaseGroup BaseGroup.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BaseGroup actualBaseGroup = new BaseGroup();
    BaseGroup actualNameResult = actualBaseGroup.name("Name");
    BaseGroup actualOwnerIdResult = actualBaseGroup.ownerId(1L);
    BaseGroup actualOwnerTypeResult = actualBaseGroup.ownerType(Owner.PLATFORM);
    actualBaseGroup.setName("Name");
    actualBaseGroup.setOwnerId(1L);
    actualBaseGroup.setOwnerType(Owner.PLATFORM);
    actualBaseGroup.setType("Type");
    BaseGroup actualTypeResult = actualBaseGroup.type("Type");
    String actualToStringResult = actualBaseGroup.toString();
    String actualName = actualBaseGroup.getName();
    Long actualOwnerId = actualBaseGroup.getOwnerId();
    Owner actualOwnerType = actualBaseGroup.getOwnerType();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Type", actualBaseGroup.getType());
    assertEquals("class BaseGroup {\n    type: Type\n    ownerType: PLATFORM\n    ownerId: 1\n    name: Name\n}",
        actualToStringResult);
    assertEquals(1L, actualOwnerId.longValue());
    assertEquals(Owner.PLATFORM, actualOwnerType);
    assertSame(actualBaseGroup, actualNameResult);
    assertSame(actualBaseGroup, actualOwnerIdResult);
    assertSame(actualBaseGroup, actualOwnerTypeResult);
    assertSame(actualBaseGroup, actualTypeResult);
  }
}
