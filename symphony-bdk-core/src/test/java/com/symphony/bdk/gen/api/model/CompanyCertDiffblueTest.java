package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompanyCertDiffblueTest {
  /**
   * Test {@link CompanyCert#equals(Object)}, and {@link CompanyCert#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCert#equals(Object)}
   *   <li>{@link CompanyCert#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCert companyCert = new CompanyCert();
    CompanyCert companyCert2 = new CompanyCert();

    // Act and Assert
    assertEquals(companyCert, companyCert2);
    int expectedHashCodeResult = companyCert.hashCode();
    assertEquals(expectedHashCodeResult, companyCert2.hashCode());
  }

  /**
   * Test {@link CompanyCert#equals(Object)}, and {@link CompanyCert#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCert#equals(Object)}
   *   <li>{@link CompanyCert#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCert companyCert = new CompanyCert();

    // Act and Assert
    assertEquals(companyCert, companyCert);
    int expectedHashCodeResult = companyCert.hashCode();
    assertEquals(expectedHashCodeResult, companyCert.hashCode());
  }

  /**
   * Test {@link CompanyCert#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCert#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCert(), 1);
  }

  /**
   * Test {@link CompanyCert#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCert#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompanyCert companyCert = new CompanyCert();
    companyCert.pem("Pem");

    // Act and Assert
    assertNotEquals(companyCert, new CompanyCert());
  }

  /**
   * Test {@link CompanyCert#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCert#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompanyCert companyCert = new CompanyCert();
    companyCert.attributes(new CompanyCertAttributes());

    // Act and Assert
    assertNotEquals(companyCert, new CompanyCert());
  }

  /**
   * Test {@link CompanyCert#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCert#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCert(), null);
  }

  /**
   * Test {@link CompanyCert#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCert#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCert.equals(Object)", "int CompanyCert.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCert(), "Different type to CompanyCert");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCert}
   *   <li>{@link CompanyCert#attributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCert#pem(String)}
   *   <li>{@link CompanyCert#setAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCert#setPem(String)}
   *   <li>{@link CompanyCert#toString()}
   *   <li>{@link CompanyCert#getAttributes()}
   *   <li>{@link CompanyCert#getPem()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompanyCert.<init>()", "CompanyCert CompanyCert.attributes(CompanyCertAttributes)",
      "CompanyCertAttributes CompanyCert.getAttributes()", "String CompanyCert.getPem()",
      "CompanyCert CompanyCert.pem(String)", "void CompanyCert.setAttributes(CompanyCertAttributes)",
      "void CompanyCert.setPem(String)", "String CompanyCert.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompanyCert actualCompanyCert = new CompanyCert();
    CompanyCert actualAttributesResult = actualCompanyCert.attributes(new CompanyCertAttributes());
    CompanyCert actualPemResult = actualCompanyCert.pem("Pem");
    CompanyCertAttributes attributes = new CompanyCertAttributes();
    actualCompanyCert.setAttributes(attributes);
    actualCompanyCert.setPem("Pem");
    String actualToStringResult = actualCompanyCert.toString();
    CompanyCertAttributes actualAttributes = actualCompanyCert.getAttributes();

    // Assert
    assertEquals("Pem", actualCompanyCert.getPem());
    assertEquals(
        "class CompanyCert {\n" + "    pem: Pem\n" + "    attributes: class CompanyCertAttributes {\n"
            + "        name: null\n" + "        type: null\n" + "        status: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertSame(actualCompanyCert, actualAttributesResult);
    assertSame(actualCompanyCert, actualPemResult);
    assertSame(attributes, actualAttributes);
  }
}
