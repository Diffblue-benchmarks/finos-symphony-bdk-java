package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PaginationDiffblueTest {
  /**
   * Test {@link Pagination#equals(Object)}, and {@link Pagination#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pagination#equals(Object)}
   *   <li>{@link Pagination#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Pagination pagination = new Pagination();
    Pagination pagination2 = new Pagination();

    // Act and Assert
    assertEquals(pagination, pagination2);
    assertEquals(pagination.hashCode(), pagination2.hashCode());
  }

  /**
   * Test {@link Pagination#equals(Object)}, and {@link Pagination#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pagination#equals(Object)}
   *   <li>{@link Pagination#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Pagination pagination = new Pagination();

    // Act and Assert
    assertEquals(pagination, pagination);
    int expectedHashCodeResult = pagination.hashCode();
    assertEquals(expectedHashCodeResult, pagination.hashCode());
  }

  /**
   * Test {@link Pagination#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pagination#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Pagination(), 1);
  }

  /**
   * Test {@link Pagination#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pagination#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pagination pagination = new Pagination();
    pagination.cursors(new PaginationCursors());

    // Act and Assert
    assertNotEquals(pagination, new Pagination());
  }

  /**
   * Test {@link Pagination#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pagination#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Pagination pagination = new Pagination();
    pagination.previous("Previous");

    // Act and Assert
    assertNotEquals(pagination, new Pagination());
  }

  /**
   * Test {@link Pagination#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pagination#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Pagination pagination = new Pagination();
    pagination.next("Next");

    // Act and Assert
    assertNotEquals(pagination, new Pagination());
  }

  /**
   * Test {@link Pagination#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pagination#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Pagination(), null);
  }

  /**
   * Test {@link Pagination#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pagination#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pagination.equals(Object)", "int Pagination.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Pagination(), "Different type to Pagination");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Pagination}
   *   <li>{@link Pagination#cursors(PaginationCursors)}
   *   <li>{@link Pagination#next(String)}
   *   <li>{@link Pagination#previous(String)}
   *   <li>{@link Pagination#setCursors(PaginationCursors)}
   *   <li>{@link Pagination#setNext(String)}
   *   <li>{@link Pagination#setPrevious(String)}
   *   <li>{@link Pagination#toString()}
   *   <li>{@link Pagination#getCursors()}
   *   <li>{@link Pagination#getNext()}
   *   <li>{@link Pagination#getPrevious()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Pagination.<init>()",
    "Pagination Pagination.cursors(PaginationCursors)",
    "PaginationCursors Pagination.getCursors()",
    "String Pagination.getNext()",
    "String Pagination.getPrevious()",
    "Pagination Pagination.next(String)",
    "Pagination Pagination.previous(String)",
    "void Pagination.setCursors(PaginationCursors)",
    "void Pagination.setNext(String)",
    "void Pagination.setPrevious(String)",
    "String Pagination.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Pagination actualPagination = new Pagination();
    Pagination actualCursorsResult = actualPagination.cursors(new PaginationCursors());
    Pagination actualNextResult = actualPagination.next("Next");
    Pagination actualPreviousResult = actualPagination.previous("Previous");
    PaginationCursors cursors = new PaginationCursors();
    actualPagination.setCursors(cursors);
    actualPagination.setNext("Next");
    actualPagination.setPrevious("Previous");
    String actualToStringResult = actualPagination.toString();
    PaginationCursors actualCursors = actualPagination.getCursors();
    String actualNext = actualPagination.getNext();

    // Assert
    assertEquals("Next", actualNext);
    assertEquals("Previous", actualPagination.getPrevious());
    assertEquals(
        "class Pagination {\n"
            + "    cursors: class PaginationCursors {\n"
            + "        before: null\n"
            + "        after: null\n"
            + "    }\n"
            + "    previous: Previous\n"
            + "    next: Next\n"
            + "}",
        actualToStringResult);
    assertSame(actualPagination, actualCursorsResult);
    assertSame(actualPagination, actualNextResult);
    assertSame(actualPagination, actualPreviousResult);
    assertSame(cursors, actualCursors);
  }
}
