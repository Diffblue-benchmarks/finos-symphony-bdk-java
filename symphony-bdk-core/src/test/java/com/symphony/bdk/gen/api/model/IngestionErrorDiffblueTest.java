package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IngestionErrorDiffblueTest {
  /**
   * Test {@link IngestionError#equals(Object)}, and {@link IngestionError#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IngestionError#equals(Object)}
   *   <li>{@link IngestionError#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IngestionError ingestionError = new IngestionError();
    IngestionError ingestionError2 = new IngestionError();

    // Act and Assert
    assertEquals(ingestionError, ingestionError2);
    int expectedHashCodeResult = ingestionError.hashCode();
    assertEquals(expectedHashCodeResult, ingestionError2.hashCode());
  }

  /**
   * Test {@link IngestionError#equals(Object)}, and {@link IngestionError#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IngestionError#equals(Object)}
   *   <li>{@link IngestionError#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IngestionError ingestionError = new IngestionError();

    // Act and Assert
    assertEquals(ingestionError, ingestionError);
    int expectedHashCodeResult = ingestionError.hashCode();
    assertEquals(expectedHashCodeResult, ingestionError.hashCode());
  }

  /**
   * Test {@link IngestionError#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IngestionError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IngestionError(), 1);
  }

  /**
   * Test {@link IngestionError#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IngestionError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IngestionError ingestionError = new IngestionError();
    ingestionError.code(1);

    // Act and Assert
    assertNotEquals(ingestionError, new IngestionError());
  }

  /**
   * Test {@link IngestionError#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IngestionError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    IngestionError ingestionError = new IngestionError();
    ingestionError.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(ingestionError, new IngestionError());
  }

  /**
   * Test {@link IngestionError#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IngestionError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    IngestionError ingestionError = new IngestionError();
    ingestionError.ingestionStatus("Ingestion Status");

    // Act and Assert
    assertNotEquals(ingestionError, new IngestionError());
  }

  /**
   * Test {@link IngestionError#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IngestionError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IngestionError(), null);
  }

  /**
   * Test {@link IngestionError#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IngestionError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IngestionError.equals(Object)", "int IngestionError.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IngestionError(), "Different type to IngestionError");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link IngestionError}
   *   <li>{@link IngestionError#code(Integer)}
   *   <li>{@link IngestionError#ingestionStatus(String)}
   *   <li>{@link IngestionError#message(String)}
   *   <li>{@link IngestionError#setCode(Integer)}
   *   <li>{@link IngestionError#setIngestionStatus(String)}
   *   <li>{@link IngestionError#setMessage(String)}
   *   <li>{@link IngestionError#toString()}
   *   <li>{@link IngestionError#getCode()}
   *   <li>{@link IngestionError#getIngestionStatus()}
   *   <li>{@link IngestionError#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IngestionError.<init>()",
    "IngestionError IngestionError.code(Integer)",
    "Integer IngestionError.getCode()",
    "String IngestionError.getIngestionStatus()",
    "String IngestionError.getMessage()",
    "IngestionError IngestionError.ingestionStatus(String)",
    "IngestionError IngestionError.message(String)",
    "void IngestionError.setCode(Integer)",
    "void IngestionError.setIngestionStatus(String)",
    "void IngestionError.setMessage(String)",
    "String IngestionError.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    IngestionError actualIngestionError = new IngestionError();
    IngestionError actualCodeResult = actualIngestionError.code(1);
    IngestionError actualIngestionStatusResult =
        actualIngestionError.ingestionStatus("Ingestion Status");
    IngestionError actualMessageResult =
        actualIngestionError.message("Not all who wander are lost");
    actualIngestionError.setCode(1);
    actualIngestionError.setIngestionStatus("Ingestion Status");
    actualIngestionError.setMessage("Not all who wander are lost");
    String actualToStringResult = actualIngestionError.toString();
    Integer actualCode = actualIngestionError.getCode();
    String actualIngestionStatus = actualIngestionError.getIngestionStatus();

    // Assert
    assertEquals("Ingestion Status", actualIngestionStatus);
    assertEquals("Not all who wander are lost", actualIngestionError.getMessage());
    assertEquals(
        "class IngestionError {\n"
            + "    code: 1\n"
            + "    message: Not all who wander are lost\n"
            + "    ingestionStatus: Ingestion Status\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualCode.intValue());
    assertSame(actualIngestionError, actualCodeResult);
    assertSame(actualIngestionError, actualIngestionStatusResult);
    assertSame(actualIngestionError, actualMessageResult);
  }
}
