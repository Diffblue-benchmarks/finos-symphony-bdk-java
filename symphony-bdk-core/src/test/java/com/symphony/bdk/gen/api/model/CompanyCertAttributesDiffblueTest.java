package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompanyCertAttributesDiffblueTest {
  /**
   * Test {@link CompanyCertAttributes#equals(Object)}, and {@link CompanyCertAttributes#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertAttributes#equals(Object)}
   *   <li>{@link CompanyCertAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    CompanyCertAttributes companyCertAttributes2 = new CompanyCertAttributes();

    // Act and Assert
    assertEquals(companyCertAttributes, companyCertAttributes2);
    int expectedHashCodeResult = companyCertAttributes.hashCode();
    assertEquals(expectedHashCodeResult, companyCertAttributes2.hashCode());
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}, and {@link CompanyCertAttributes#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertAttributes#equals(Object)}
   *   <li>{@link CompanyCertAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();

    // Act and Assert
    assertEquals(companyCertAttributes, companyCertAttributes);
    int expectedHashCodeResult = companyCertAttributes.hashCode();
    assertEquals(expectedHashCodeResult, companyCertAttributes.hashCode());
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertAttributes(), 1);
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    companyCertAttributes.name("Name");

    // Act and Assert
    assertNotEquals(companyCertAttributes, new CompanyCertAttributes());
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    companyCertAttributes.type(new CompanyCertType());

    // Act and Assert
    assertNotEquals(companyCertAttributes, new CompanyCertAttributes());
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    companyCertAttributes.status(new CompanyCertStatus());

    // Act and Assert
    assertNotEquals(companyCertAttributes, new CompanyCertAttributes());
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertAttributes(), null);
  }

  /**
   * Test {@link CompanyCertAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertAttributes.equals(Object)", "int CompanyCertAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertAttributes(), "Different type to CompanyCertAttributes");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertAttributes}
   *   <li>{@link CompanyCertAttributes#name(String)}
   *   <li>{@link CompanyCertAttributes#setName(String)}
   *   <li>{@link CompanyCertAttributes#setStatus(CompanyCertStatus)}
   *   <li>{@link CompanyCertAttributes#setType(CompanyCertType)}
   *   <li>{@link CompanyCertAttributes#status(CompanyCertStatus)}
   *   <li>{@link CompanyCertAttributes#type(CompanyCertType)}
   *   <li>{@link CompanyCertAttributes#toString()}
   *   <li>{@link CompanyCertAttributes#getName()}
   *   <li>{@link CompanyCertAttributes#getStatus()}
   *   <li>{@link CompanyCertAttributes#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompanyCertAttributes.<init>()", "String CompanyCertAttributes.getName()",
      "CompanyCertStatus CompanyCertAttributes.getStatus()", "CompanyCertType CompanyCertAttributes.getType()",
      "CompanyCertAttributes CompanyCertAttributes.name(String)", "void CompanyCertAttributes.setName(String)",
      "void CompanyCertAttributes.setStatus(CompanyCertStatus)", "void CompanyCertAttributes.setType(CompanyCertType)",
      "CompanyCertAttributes CompanyCertAttributes.status(CompanyCertStatus)",
      "String CompanyCertAttributes.toString()", "CompanyCertAttributes CompanyCertAttributes.type(CompanyCertType)"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertAttributes actualCompanyCertAttributes = new CompanyCertAttributes();
    CompanyCertAttributes actualNameResult = actualCompanyCertAttributes.name("Name");
    actualCompanyCertAttributes.setName("Name");
    actualCompanyCertAttributes.setStatus(new CompanyCertStatus());
    actualCompanyCertAttributes.setType(new CompanyCertType());
    CompanyCertStatus status = new CompanyCertStatus();
    CompanyCertAttributes actualStatusResult = actualCompanyCertAttributes.status(status);
    CompanyCertType type = new CompanyCertType();
    CompanyCertAttributes actualTypeResult = actualCompanyCertAttributes.type(type);
    String actualToStringResult = actualCompanyCertAttributes.toString();
    String actualName = actualCompanyCertAttributes.getName();
    CompanyCertStatus actualStatus = actualCompanyCertAttributes.getStatus();
    CompanyCertType actualType = actualCompanyCertAttributes.getType();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("class CompanyCertAttributes {\n" + "    name: Name\n" + "    type: class CompanyCertType {\n"
        + "        type: null\n" + "    }\n" + "    status: class CompanyCertStatus {\n" + "        type: null\n"
        + "    }\n" + "}", actualToStringResult);
    assertNull(actualStatus.getType());
    assertNull(actualType.getType());
    assertSame(actualCompanyCertAttributes, actualNameResult);
    assertSame(actualCompanyCertAttributes, actualStatusResult);
    assertSame(actualCompanyCertAttributes, actualTypeResult);
    assertSame(status, actualStatus);
    assertSame(type, actualType);
  }
}
