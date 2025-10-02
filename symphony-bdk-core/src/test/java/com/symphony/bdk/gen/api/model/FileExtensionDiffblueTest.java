package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.FileExtension.SourceEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileExtensionDiffblueTest {
  /**
   * Test {@link FileExtension#equals(Object)}, and {@link FileExtension#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileExtension#equals(Object)}
   *   <li>{@link FileExtension#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FileExtension fileExtension = new FileExtension();
    FileExtension fileExtension2 = new FileExtension();

    // Act and Assert
    assertEquals(fileExtension, fileExtension2);
    assertEquals(fileExtension.hashCode(), fileExtension2.hashCode());
  }

  /**
   * Test {@link FileExtension#equals(Object)}, and {@link FileExtension#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileExtension#equals(Object)}
   *   <li>{@link FileExtension#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileExtension fileExtension = new FileExtension();

    // Act and Assert
    assertEquals(fileExtension, fileExtension);
    int expectedHashCodeResult = fileExtension.hashCode();
    assertEquals(expectedHashCodeResult, fileExtension.hashCode());
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileExtension(), 1);
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FileExtension fileExtension = new FileExtension();
    fileExtension.extension("Extension");

    // Act and Assert
    assertNotEquals(fileExtension, new FileExtension());
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FileExtension fileExtension = new FileExtension();
    fileExtension.scopeInternal(true);

    // Act and Assert
    assertNotEquals(fileExtension, new FileExtension());
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FileExtension fileExtension = new FileExtension();
    fileExtension.scopeExternal(true);

    // Act and Assert
    assertNotEquals(fileExtension, new FileExtension());
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    FileExtension fileExtension = new FileExtension();
    fileExtension.source(SourceEnum.SYSTEM);

    // Act and Assert
    assertNotEquals(fileExtension, new FileExtension());
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileExtension(), null);
  }

  /**
   * Test {@link FileExtension#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileExtension.equals(Object)", "int FileExtension.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileExtension(), "Different type to FileExtension");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link FileExtension}
   *   <li>{@link FileExtension#extension(String)}
   *   <li>{@link FileExtension#scopeExternal(Boolean)}
   *   <li>{@link FileExtension#scopeInternal(Boolean)}
   *   <li>{@link FileExtension#setExtension(String)}
   *   <li>{@link FileExtension#setScopeExternal(Boolean)}
   *   <li>{@link FileExtension#setScopeInternal(Boolean)}
   *   <li>{@link FileExtension#setSource(SourceEnum)}
   *   <li>{@link FileExtension#source(SourceEnum)}
   *   <li>{@link FileExtension#toString()}
   *   <li>{@link FileExtension#getExtension()}
   *   <li>{@link FileExtension#getScopeExternal()}
   *   <li>{@link FileExtension#getScopeInternal()}
   *   <li>{@link FileExtension#getSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FileExtension.<init>()",
    "FileExtension FileExtension.extension(String)",
    "String FileExtension.getExtension()",
    "Boolean FileExtension.getScopeExternal()",
    "Boolean FileExtension.getScopeInternal()",
    "SourceEnum FileExtension.getSource()",
    "FileExtension FileExtension.scopeExternal(Boolean)",
    "FileExtension FileExtension.scopeInternal(Boolean)",
    "void FileExtension.setExtension(String)",
    "void FileExtension.setScopeExternal(Boolean)",
    "void FileExtension.setScopeInternal(Boolean)",
    "void FileExtension.setSource(SourceEnum)",
    "FileExtension FileExtension.source(SourceEnum)",
    "String FileExtension.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    FileExtension actualFileExtension = new FileExtension();
    FileExtension actualExtensionResult = actualFileExtension.extension("Extension");
    FileExtension actualScopeExternalResult = actualFileExtension.scopeExternal(true);
    FileExtension actualScopeInternalResult = actualFileExtension.scopeInternal(true);
    actualFileExtension.setExtension("Extension");
    actualFileExtension.setScopeExternal(true);
    actualFileExtension.setScopeInternal(true);
    actualFileExtension.setSource(SourceEnum.SYSTEM);
    FileExtension actualSourceResult = actualFileExtension.source(SourceEnum.SYSTEM);
    String actualToStringResult = actualFileExtension.toString();
    String actualExtension = actualFileExtension.getExtension();
    Boolean actualScopeExternal = actualFileExtension.getScopeExternal();
    Boolean actualScopeInternal = actualFileExtension.getScopeInternal();

    // Assert
    assertEquals("Extension", actualExtension);
    assertEquals(
        "class FileExtension {\n"
            + "    extension: Extension\n"
            + "    scopeInternal: true\n"
            + "    scopeExternal: true\n"
            + "    source: SYSTEM\n"
            + "}",
        actualToStringResult);
    assertEquals(SourceEnum.SYSTEM, actualFileExtension.getSource());
    assertTrue(actualScopeExternal);
    assertTrue(actualScopeInternal);
    assertSame(actualFileExtension, actualExtensionResult);
    assertSame(actualFileExtension, actualScopeExternalResult);
    assertSame(actualFileExtension, actualScopeInternalResult);
    assertSame(actualFileExtension, actualSourceResult);
  }

  /**
   * Test SourceEnum {@link SourceEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SourceEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test SourceEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SourceEnum SourceEnum.fromValue(String)"})
  void testSourceEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SourceEnum.fromValue("42"));
  }

  /**
   * Test SourceEnum {@link SourceEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code SYSTEM}.
   *   <li>Then return {@code SYSTEM}.
   * </ul>
   *
   * <p>Method under test: {@link SourceEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test SourceEnum fromValue(String); when 'SYSTEM'; then return 'SYSTEM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SourceEnum SourceEnum.fromValue(String)"})
  void testSourceEnumFromValue_whenSystem_thenReturnSystem() {
    // Arrange, Act and Assert
    assertEquals(SourceEnum.SYSTEM, SourceEnum.fromValue("SYSTEM"));
  }

  /**
   * Test SourceEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SourceEnum#toString()}
   *   <li>{@link SourceEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test SourceEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SourceEnum.getValue()", "String SourceEnum.toString()"})
  void testSourceEnumGettersAndSetters() {
    // Arrange
    SourceEnum valueOfResult = SourceEnum.valueOf("SYSTEM");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("SYSTEM", valueOfResult.getValue());
    assertEquals("SYSTEM", actualToStringResult);
  }
}
