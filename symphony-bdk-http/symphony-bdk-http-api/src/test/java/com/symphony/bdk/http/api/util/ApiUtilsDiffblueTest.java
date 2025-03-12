package com.symphony.bdk.http.api.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiUtilsDiffblueTest {
  /**
   * Test {@link ApiUtils#getUserAgent()}.
   * <p>
   * Method under test: {@link ApiUtils#getUserAgent()}
   */
  @Test
  @DisplayName("Test getUserAgent()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiUtils.getUserAgent()"})
  void testGetUserAgent() {
    // Arrange and Act
    String actualUserAgent = ApiUtils.getUserAgent();

    // Assert
    assertEquals(String.join("", "Symphony-BDK-Java/2.0 Java/", System.getProperty("java.version")), actualUserAgent);
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(ApiUtils.isCollectionOfFiles(objectList));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_thenReturnTrue() {
    // Arrange
    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertTrue(ApiUtils.isCollectionOfFiles(objectSet));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ApiUtils.isCollectionOfFiles(new ArrayList<>()));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   * <ul>
   *   <li>When {@code Param Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); when 'Param Value'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_whenParamValue_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ApiUtils.isCollectionOfFiles("Param Value"));
  }
}
