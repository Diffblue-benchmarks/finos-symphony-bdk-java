package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BaseSignalDiffblueTest {
  /**
   * Test {@link BaseSignal#equals(Object)}, and {@link BaseSignal#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BaseSignal#equals(Object)}
   *   <li>{@link BaseSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BaseSignal baseSignal = new BaseSignal();
    BaseSignal baseSignal2 = new BaseSignal();

    // Act and Assert
    assertEquals(baseSignal, baseSignal2);
    int expectedHashCodeResult = baseSignal.hashCode();
    assertEquals(expectedHashCodeResult, baseSignal2.hashCode());
  }

  /**
   * Test {@link BaseSignal#equals(Object)}, and {@link BaseSignal#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BaseSignal#equals(Object)}
   *   <li>{@link BaseSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BaseSignal baseSignal = new BaseSignal();

    // Act and Assert
    assertEquals(baseSignal, baseSignal);
    int expectedHashCodeResult = baseSignal.hashCode();
    assertEquals(expectedHashCodeResult, baseSignal.hashCode());
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseSignal(), 1);
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BaseSignal baseSignal = new BaseSignal();
    baseSignal.name("Name");

    // Act and Assert
    assertNotEquals(baseSignal, new BaseSignal());
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    BaseSignal baseSignal = new BaseSignal();
    baseSignal.query("Query");

    // Act and Assert
    assertNotEquals(baseSignal, new BaseSignal());
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    BaseSignal baseSignal = new BaseSignal();
    baseSignal.visibleOnProfile(true);

    // Act and Assert
    assertNotEquals(baseSignal, new BaseSignal());
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    BaseSignal baseSignal = new BaseSignal();
    baseSignal.companyWide(true);

    // Act and Assert
    assertNotEquals(baseSignal, new BaseSignal());
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseSignal(), null);
  }

  /**
   * Test {@link BaseSignal#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BaseSignal.equals(Object)", "int BaseSignal.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseSignal(), "Different type to BaseSignal");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BaseSignal}
   *   <li>{@link BaseSignal#companyWide(Boolean)}
   *   <li>{@link BaseSignal#name(String)}
   *   <li>{@link BaseSignal#query(String)}
   *   <li>{@link BaseSignal#setCompanyWide(Boolean)}
   *   <li>{@link BaseSignal#setName(String)}
   *   <li>{@link BaseSignal#setQuery(String)}
   *   <li>{@link BaseSignal#setVisibleOnProfile(Boolean)}
   *   <li>{@link BaseSignal#visibleOnProfile(Boolean)}
   *   <li>{@link BaseSignal#toString()}
   *   <li>{@link BaseSignal#getCompanyWide()}
   *   <li>{@link BaseSignal#getName()}
   *   <li>{@link BaseSignal#getQuery()}
   *   <li>{@link BaseSignal#getVisibleOnProfile()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BaseSignal.<init>()", "BaseSignal BaseSignal.companyWide(Boolean)",
      "Boolean BaseSignal.getCompanyWide()", "String BaseSignal.getName()", "String BaseSignal.getQuery()",
      "Boolean BaseSignal.getVisibleOnProfile()", "BaseSignal BaseSignal.name(String)",
      "BaseSignal BaseSignal.query(String)", "void BaseSignal.setCompanyWide(Boolean)",
      "void BaseSignal.setName(String)", "void BaseSignal.setQuery(String)",
      "void BaseSignal.setVisibleOnProfile(Boolean)", "String BaseSignal.toString()",
      "BaseSignal BaseSignal.visibleOnProfile(Boolean)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BaseSignal actualBaseSignal = new BaseSignal();
    BaseSignal actualCompanyWideResult = actualBaseSignal.companyWide(true);
    BaseSignal actualNameResult = actualBaseSignal.name("Name");
    BaseSignal actualQueryResult = actualBaseSignal.query("Query");
    actualBaseSignal.setCompanyWide(true);
    actualBaseSignal.setName("Name");
    actualBaseSignal.setQuery("Query");
    actualBaseSignal.setVisibleOnProfile(true);
    BaseSignal actualVisibleOnProfileResult = actualBaseSignal.visibleOnProfile(true);
    String actualToStringResult = actualBaseSignal.toString();
    Boolean actualCompanyWide = actualBaseSignal.getCompanyWide();
    String actualName = actualBaseSignal.getName();
    String actualQuery = actualBaseSignal.getQuery();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Query", actualQuery);
    assertEquals("class BaseSignal {\n" + "    name: Name\n" + "    query: Query\n" + "    visibleOnProfile: true\n"
        + "    companyWide: true\n" + "}", actualToStringResult);
    assertTrue(actualCompanyWide);
    assertTrue(actualBaseSignal.getVisibleOnProfile());
    assertSame(actualBaseSignal, actualCompanyWideResult);
    assertSame(actualBaseSignal, actualNameResult);
    assertSame(actualBaseSignal, actualQueryResult);
    assertSame(actualBaseSignal, actualVisibleOnProfileResult);
  }
}
