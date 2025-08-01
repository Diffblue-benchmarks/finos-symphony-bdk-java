package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileExtensionsResponseDiffblueTest {
  /**
   * Test {@link FileExtensionsResponse#addDataItem(FileExtension)}.
   *
   * <p>Method under test: {@link FileExtensionsResponse#addDataItem(FileExtension)}
   */
  @Test
  @DisplayName("Test addDataItem(FileExtension)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileExtensionsResponse FileExtensionsResponse.addDataItem(FileExtension)"})
  void testAddDataItem() {
    // Arrange
    FileExtensionsResponse fileExtensionsResponse = new FileExtensionsResponse();
    FileExtension dataItem = new FileExtension();

    // Act
    FileExtensionsResponse actualAddDataItemResult = fileExtensionsResponse.addDataItem(dataItem);

    // Assert
    List<FileExtension> data = actualAddDataItemResult.getData();
    assertEquals(1, data.size());
    assertSame(dataItem, data.get(0));
    assertSame(fileExtensionsResponse, actualAddDataItemResult);
  }

  /**
   * Test {@link FileExtensionsResponse#equals(Object)}, and {@link
   * FileExtensionsResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileExtensionsResponse#equals(Object)}
   *   <li>{@link FileExtensionsResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FileExtensionsResponse.equals(Object)",
    "int FileExtensionsResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FileExtensionsResponse fileExtensionsResponse = new FileExtensionsResponse();
    FileExtensionsResponse fileExtensionsResponse2 = new FileExtensionsResponse();

    // Act and Assert
    assertEquals(fileExtensionsResponse, fileExtensionsResponse2);
    int expectedHashCodeResult = fileExtensionsResponse.hashCode();
    assertEquals(expectedHashCodeResult, fileExtensionsResponse2.hashCode());
  }

  /**
   * Test {@link FileExtensionsResponse#equals(Object)}, and {@link
   * FileExtensionsResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileExtensionsResponse#equals(Object)}
   *   <li>{@link FileExtensionsResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FileExtensionsResponse.equals(Object)",
    "int FileExtensionsResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileExtensionsResponse fileExtensionsResponse = new FileExtensionsResponse();

    // Act and Assert
    assertEquals(fileExtensionsResponse, fileExtensionsResponse);
    int expectedHashCodeResult = fileExtensionsResponse.hashCode();
    assertEquals(expectedHashCodeResult, fileExtensionsResponse.hashCode());
  }

  /**
   * Test {@link FileExtensionsResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtensionsResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FileExtensionsResponse.equals(Object)",
    "int FileExtensionsResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FileExtensionsResponse fileExtensionsResponse = new FileExtensionsResponse();
    fileExtensionsResponse.addDataItem(new FileExtension());

    // Act and Assert
    assertNotEquals(fileExtensionsResponse, new FileExtensionsResponse());
  }

  /**
   * Test {@link FileExtensionsResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtensionsResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FileExtensionsResponse.equals(Object)",
    "int FileExtensionsResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileExtensionsResponse(), null);
  }

  /**
   * Test {@link FileExtensionsResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileExtensionsResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FileExtensionsResponse.equals(Object)",
    "int FileExtensionsResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileExtensionsResponse(), "Different type to FileExtensionsResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link FileExtensionsResponse}
   *   <li>{@link FileExtensionsResponse#data(List)}
   *   <li>{@link FileExtensionsResponse#setData(List)}
   *   <li>{@link FileExtensionsResponse#toString()}
   *   <li>{@link FileExtensionsResponse#getData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FileExtensionsResponse.<init>()",
    "FileExtensionsResponse FileExtensionsResponse.data(List)",
    "List FileExtensionsResponse.getData()",
    "void FileExtensionsResponse.setData(List)",
    "String FileExtensionsResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    FileExtensionsResponse actualFileExtensionsResponse = new FileExtensionsResponse();
    FileExtensionsResponse actualDataResult = actualFileExtensionsResponse.data(new ArrayList<>());
    ArrayList<FileExtension> data = new ArrayList<>();
    actualFileExtensionsResponse.setData(data);
    String actualToStringResult = actualFileExtensionsResponse.toString();
    List<FileExtension> actualData = actualFileExtensionsResponse.getData();

    // Assert
    assertEquals("class FileExtensionsResponse {\n    data: []\n}", actualToStringResult);
    assertTrue(actualData.isEmpty());
    assertSame(actualFileExtensionsResponse, actualDataResult);
    assertSame(data, actualData);
  }
}
