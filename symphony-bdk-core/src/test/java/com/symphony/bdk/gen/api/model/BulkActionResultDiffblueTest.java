package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.BulkActionResult.OverallResultEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BulkActionResultDiffblueTest {
  /**
   * Test {@link BulkActionResult#addResultsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BulkActionResult} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BulkActionResult#addResultsItem(String)}
   */
  @Test
  @DisplayName("Test addResultsItem(String); given BulkActionResult (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BulkActionResult BulkActionResult.addResultsItem(String)"})
  void testAddResultsItem_givenBulkActionResult() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();

    // Act
    BulkActionResult actualAddResultsItemResult = bulkActionResult.addResultsItem("Results Item");

    // Assert
    assertSame(bulkActionResult, actualAddResultsItemResult);
  }

  /**
   * Test {@link BulkActionResult#addResultsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BulkActionResult} (default constructor) results {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link BulkActionResult#addResultsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addResultsItem(String); given BulkActionResult (default constructor) results ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BulkActionResult BulkActionResult.addResultsItem(String)"})
  void testAddResultsItem_givenBulkActionResultResultsArrayList() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    bulkActionResult.results(new ArrayList<>());

    // Act
    BulkActionResult actualAddResultsItemResult = bulkActionResult.addResultsItem("Results Item");

    // Assert
    assertSame(bulkActionResult, actualAddResultsItemResult);
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}, and {@link BulkActionResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BulkActionResult#equals(Object)}
   *   <li>{@link BulkActionResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    BulkActionResult bulkActionResult2 = new BulkActionResult();

    // Act and Assert
    assertEquals(bulkActionResult, bulkActionResult2);
    assertEquals(bulkActionResult.hashCode(), bulkActionResult2.hashCode());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}, and {@link BulkActionResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BulkActionResult#equals(Object)}
   *   <li>{@link BulkActionResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();

    // Act and Assert
    assertEquals(bulkActionResult, bulkActionResult);
    int expectedHashCodeResult = bulkActionResult.hashCode();
    assertEquals(expectedHashCodeResult, bulkActionResult.hashCode());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    bulkActionResult.addResultsItem("Results Item");

    // Act and Assert
    assertNotEquals(bulkActionResult, new BulkActionResult());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    bulkActionResult.overallResult(OverallResultEnum.SUCCESS);
    bulkActionResult.addResultsItem("Results Item");

    // Act and Assert
    assertNotEquals(bulkActionResult, new BulkActionResult());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BulkActionResult(), null);
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BulkActionResult(), "Different type to BulkActionResult");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link BulkActionResult}
   *   <li>{@link BulkActionResult#overallResult(OverallResultEnum)}
   *   <li>{@link BulkActionResult#results(List)}
   *   <li>{@link BulkActionResult#setOverallResult(OverallResultEnum)}
   *   <li>{@link BulkActionResult#setResults(List)}
   *   <li>{@link BulkActionResult#toString()}
   *   <li>{@link BulkActionResult#getOverallResult()}
   *   <li>{@link BulkActionResult#getResults()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BulkActionResult.<init>()",
    "OverallResultEnum BulkActionResult.getOverallResult()",
    "List BulkActionResult.getResults()",
    "BulkActionResult BulkActionResult.overallResult(OverallResultEnum)",
    "BulkActionResult BulkActionResult.results(List)",
    "void BulkActionResult.setOverallResult(OverallResultEnum)",
    "void BulkActionResult.setResults(List)",
    "String BulkActionResult.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    BulkActionResult actualBulkActionResult = new BulkActionResult();
    BulkActionResult actualOverallResultResult =
        actualBulkActionResult.overallResult(OverallResultEnum.SUCCESS);
    BulkActionResult actualResultsResult = actualBulkActionResult.results(new ArrayList<>());
    actualBulkActionResult.setOverallResult(OverallResultEnum.SUCCESS);
    ArrayList<String> results = new ArrayList<>();
    actualBulkActionResult.setResults(results);
    String actualToStringResult = actualBulkActionResult.toString();
    OverallResultEnum actualOverallResult = actualBulkActionResult.getOverallResult();
    List<String> actualResults = actualBulkActionResult.getResults();

    // Assert
    assertEquals(
        "class BulkActionResult {\n    overallResult: SUCCESS\n    results: []\n}",
        actualToStringResult);
    assertEquals(OverallResultEnum.SUCCESS, actualOverallResult);
    assertTrue(actualResults.isEmpty());
    assertSame(actualBulkActionResult, actualOverallResultResult);
    assertSame(actualBulkActionResult, actualResultsResult);
    assertSame(results, actualResults);
  }

  /**
   * Test OverallResultEnum {@link OverallResultEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OverallResultEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test OverallResultEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OverallResultEnum OverallResultEnum.fromValue(String)"})
  void testOverallResultEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OverallResultEnum.fromValue("42"));
  }

  /**
   * Test OverallResultEnum {@link OverallResultEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code SUCCESS}.
   *   <li>Then return {@code SUCCESS}.
   * </ul>
   *
   * <p>Method under test: {@link OverallResultEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test OverallResultEnum fromValue(String); when 'SUCCESS'; then return 'SUCCESS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OverallResultEnum OverallResultEnum.fromValue(String)"})
  void testOverallResultEnumFromValue_whenSuccess_thenReturnSuccess() {
    // Arrange, Act and Assert
    assertEquals(OverallResultEnum.SUCCESS, OverallResultEnum.fromValue("SUCCESS"));
  }

  /**
   * Test OverallResultEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OverallResultEnum#toString()}
   *   <li>{@link OverallResultEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test OverallResultEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OverallResultEnum.getValue()", "String OverallResultEnum.toString()"})
  void testOverallResultEnumGettersAndSetters() {
    // Arrange
    OverallResultEnum valueOfResult = OverallResultEnum.valueOf("SUCCESS");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("SUCCESS", valueOfResult.getValue());
    assertEquals("SUCCESS", actualToStringResult);
  }
}
