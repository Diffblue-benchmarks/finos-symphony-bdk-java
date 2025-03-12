package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PaginationCursorsDiffblueTest {
  /**
   * Test {@link PaginationCursors#equals(Object)}, and {@link PaginationCursors#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PaginationCursors#equals(Object)}
   *   <li>{@link PaginationCursors#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PaginationCursors paginationCursors = new PaginationCursors();
    PaginationCursors paginationCursors2 = new PaginationCursors();

    // Act and Assert
    assertEquals(paginationCursors, paginationCursors2);
    int expectedHashCodeResult = paginationCursors.hashCode();
    assertEquals(expectedHashCodeResult, paginationCursors2.hashCode());
  }

  /**
   * Test {@link PaginationCursors#equals(Object)}, and {@link PaginationCursors#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PaginationCursors#equals(Object)}
   *   <li>{@link PaginationCursors#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PaginationCursors paginationCursors = new PaginationCursors();

    // Act and Assert
    assertEquals(paginationCursors, paginationCursors);
    int expectedHashCodeResult = paginationCursors.hashCode();
    assertEquals(expectedHashCodeResult, paginationCursors.hashCode());
  }

  /**
   * Test {@link PaginationCursors#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PaginationCursors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PaginationCursors(), 1);
  }

  /**
   * Test {@link PaginationCursors#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PaginationCursors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PaginationCursors paginationCursors = new PaginationCursors();
    paginationCursors.before("Before");

    // Act and Assert
    assertNotEquals(paginationCursors, new PaginationCursors());
  }

  /**
   * Test {@link PaginationCursors#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PaginationCursors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    PaginationCursors paginationCursors = new PaginationCursors();
    paginationCursors.after("After");

    // Act and Assert
    assertNotEquals(paginationCursors, new PaginationCursors());
  }

  /**
   * Test {@link PaginationCursors#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PaginationCursors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PaginationCursors(), null);
  }

  /**
   * Test {@link PaginationCursors#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PaginationCursors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PaginationCursors.equals(Object)", "int PaginationCursors.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PaginationCursors(), "Different type to PaginationCursors");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link PaginationCursors}
   *   <li>{@link PaginationCursors#after(String)}
   *   <li>{@link PaginationCursors#before(String)}
   *   <li>{@link PaginationCursors#setAfter(String)}
   *   <li>{@link PaginationCursors#setBefore(String)}
   *   <li>{@link PaginationCursors#toString()}
   *   <li>{@link PaginationCursors#getAfter()}
   *   <li>{@link PaginationCursors#getBefore()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PaginationCursors.<init>()", "PaginationCursors PaginationCursors.after(String)",
      "PaginationCursors PaginationCursors.before(String)", "String PaginationCursors.getAfter()",
      "String PaginationCursors.getBefore()", "void PaginationCursors.setAfter(String)",
      "void PaginationCursors.setBefore(String)", "String PaginationCursors.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    PaginationCursors actualPaginationCursors = new PaginationCursors();
    PaginationCursors actualAfterResult = actualPaginationCursors.after("After");
    PaginationCursors actualBeforeResult = actualPaginationCursors.before("Before");
    actualPaginationCursors.setAfter("After");
    actualPaginationCursors.setBefore("Before");
    String actualToStringResult = actualPaginationCursors.toString();
    String actualAfter = actualPaginationCursors.getAfter();

    // Assert
    assertEquals("After", actualAfter);
    assertEquals("Before", actualPaginationCursors.getBefore());
    assertEquals("class PaginationCursors {\n    before: Before\n    after: After\n}", actualToStringResult);
    assertSame(actualPaginationCursors, actualAfterResult);
    assertSame(actualPaginationCursors, actualBeforeResult);
  }
}
