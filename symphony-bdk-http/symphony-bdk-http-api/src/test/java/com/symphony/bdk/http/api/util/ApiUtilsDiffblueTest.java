package com.symphony.bdk.http.api.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiUtilsDiffblueTest {
  /**
   * Test {@link ApiUtils#getUserAgent()}.
   *
   * <p>Method under test: {@link ApiUtils#getUserAgent()}
   */
  @Test
  @DisplayName("Test getUserAgent()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiUtils.getUserAgent()"})
  void testGetUserAgent() {
    // Arrange and Act
    String actualUserAgent = ApiUtils.getUserAgent();

    // Assert
    String expectedUserAgent =
        String.join("", "Symphony-BDK-Java/2.0 Java/", System.getProperty("java.version"));
    assertEquals(expectedUserAgent, actualUserAgent);
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); given '42'; when LinkedList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_given42_whenLinkedListAdd42() {
    // Arrange
    LinkedList<Object> objectList = new LinkedList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(ApiUtils.isCollectionOfFiles(objectList));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_whenArrayList() {
    // Arrange, Act and Assert
    assertFalse(ApiUtils.isCollectionOfFiles(new ArrayList<>()));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfFiles(Object)}.
   *
   * <ul>
   *   <li>When {@code Param Value}.
   * </ul>
   *
   * <p>Method under test: {@link ApiUtils#isCollectionOfFiles(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfFiles(Object); when 'Param Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfFiles(Object)"})
  void testIsCollectionOfFiles_whenParamValue() {
    // Arrange, Act and Assert
    assertFalse(ApiUtils.isCollectionOfFiles("Param Value"));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfApiClientBodyPart(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiUtils#isCollectionOfApiClientBodyPart(Object)}
   */
  @Test
  @DisplayName(
      "Test isCollectionOfApiClientBodyPart(Object); given '42'; when LinkedList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfApiClientBodyPart(Object)"})
  void testIsCollectionOfApiClientBodyPart_given42_whenLinkedListAdd42() {
    // Arrange
    LinkedList<Object> objectList = new LinkedList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(ApiUtils.isCollectionOfApiClientBodyPart(objectList));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfApiClientBodyPart(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ApiUtils#isCollectionOfApiClientBodyPart(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfApiClientBodyPart(Object); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfApiClientBodyPart(Object)"})
  void testIsCollectionOfApiClientBodyPart_whenArrayList() {
    // Arrange, Act and Assert
    assertFalse(ApiUtils.isCollectionOfApiClientBodyPart(new ArrayList<>()));
  }

  /**
   * Test {@link ApiUtils#isCollectionOfApiClientBodyPart(Object)}.
   *
   * <ul>
   *   <li>When {@code Param Value}.
   * </ul>
   *
   * <p>Method under test: {@link ApiUtils#isCollectionOfApiClientBodyPart(Object)}
   */
  @Test
  @DisplayName("Test isCollectionOfApiClientBodyPart(Object); when 'Param Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiUtils.isCollectionOfApiClientBodyPart(Object)"})
  void testIsCollectionOfApiClientBodyPart_whenParamValue() {
    // Arrange, Act and Assert
    assertFalse(ApiUtils.isCollectionOfApiClientBodyPart("Param Value"));
  }
}
