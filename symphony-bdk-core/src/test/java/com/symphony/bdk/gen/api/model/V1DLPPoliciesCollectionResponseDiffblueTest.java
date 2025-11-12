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

class V1DLPPoliciesCollectionResponseDiffblueTest {
  /**
   * Test {@link V1DLPPoliciesCollectionResponse#addPoliciesItem(V1DLPPolicy)}.
   *
   * <p>Method under test: {@link V1DLPPoliciesCollectionResponse#addPoliciesItem(V1DLPPolicy)}
   */
  @Test
  @DisplayName("Test addPoliciesItem(V1DLPPolicy)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V1DLPPoliciesCollectionResponse V1DLPPoliciesCollectionResponse.addPoliciesItem(V1DLPPolicy)"
  })
  void testAddPoliciesItem() {
    // Arrange
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();

    // Act
    V1DLPPoliciesCollectionResponse actualAddPoliciesItemResult =
        v1dlpPoliciesCollectionResponse.addPoliciesItem(new V1DLPPolicy());

    // Assert
    assertSame(v1dlpPoliciesCollectionResponse, actualAddPoliciesItemResult);
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}, and {@link
   * V1DLPPoliciesCollectionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPPoliciesCollectionResponse#equals(Object)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse2 =
        new V1DLPPoliciesCollectionResponse();

    // Act and Assert
    assertEquals(v1dlpPoliciesCollectionResponse, v1dlpPoliciesCollectionResponse2);
    assertEquals(
        v1dlpPoliciesCollectionResponse.hashCode(), v1dlpPoliciesCollectionResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}, and {@link
   * V1DLPPoliciesCollectionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPPoliciesCollectionResponse#equals(Object)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();

    // Act and Assert
    assertEquals(v1dlpPoliciesCollectionResponse, v1dlpPoliciesCollectionResponse);
    int expectedHashCodeResult = v1dlpPoliciesCollectionResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpPoliciesCollectionResponse.hashCode());
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();
    v1dlpPoliciesCollectionResponse.addPoliciesItem(new V1DLPPolicy());

    // Act and Assert
    assertNotEquals(v1dlpPoliciesCollectionResponse, new V1DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();
    v1dlpPoliciesCollectionResponse.page(1);

    // Act and Assert
    assertNotEquals(v1dlpPoliciesCollectionResponse, new V1DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPPoliciesCollectionResponse v1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();
    v1dlpPoliciesCollectionResponse.pageCount(3);

    // Act and Assert
    assertNotEquals(v1dlpPoliciesCollectionResponse, new V1DLPPoliciesCollectionResponse());
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPoliciesCollectionResponse(), null);
  }

  /**
   * Test {@link V1DLPPoliciesCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPPoliciesCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPPoliciesCollectionResponse.equals(Object)",
    "int V1DLPPoliciesCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V1DLPPoliciesCollectionResponse(), "Different type to V1DLPPoliciesCollectionResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPPoliciesCollectionResponse}
   *   <li>{@link V1DLPPoliciesCollectionResponse#page(Integer)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#pageCount(Integer)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#policies(List)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#setPage(Integer)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#setPageCount(Integer)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#setPolicies(List)}
   *   <li>{@link V1DLPPoliciesCollectionResponse#toString()}
   *   <li>{@link V1DLPPoliciesCollectionResponse#getPage()}
   *   <li>{@link V1DLPPoliciesCollectionResponse#getPageCount()}
   *   <li>{@link V1DLPPoliciesCollectionResponse#getPolicies()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPPoliciesCollectionResponse.<init>()",
    "Integer V1DLPPoliciesCollectionResponse.getPage()",
    "Integer V1DLPPoliciesCollectionResponse.getPageCount()",
    "List V1DLPPoliciesCollectionResponse.getPolicies()",
    "V1DLPPoliciesCollectionResponse V1DLPPoliciesCollectionResponse.page(Integer)",
    "V1DLPPoliciesCollectionResponse V1DLPPoliciesCollectionResponse.pageCount(Integer)",
    "V1DLPPoliciesCollectionResponse V1DLPPoliciesCollectionResponse.policies(List)",
    "void V1DLPPoliciesCollectionResponse.setPage(Integer)",
    "void V1DLPPoliciesCollectionResponse.setPageCount(Integer)",
    "void V1DLPPoliciesCollectionResponse.setPolicies(List)",
    "String V1DLPPoliciesCollectionResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPPoliciesCollectionResponse actualV1dlpPoliciesCollectionResponse =
        new V1DLPPoliciesCollectionResponse();
    V1DLPPoliciesCollectionResponse actualPageResult =
        actualV1dlpPoliciesCollectionResponse.page(1);
    V1DLPPoliciesCollectionResponse actualPageCountResult =
        actualV1dlpPoliciesCollectionResponse.pageCount(3);
    V1DLPPoliciesCollectionResponse actualPoliciesResult =
        actualV1dlpPoliciesCollectionResponse.policies(new ArrayList<>());
    actualV1dlpPoliciesCollectionResponse.setPage(1);
    actualV1dlpPoliciesCollectionResponse.setPageCount(3);
    ArrayList<V1DLPPolicy> policies = new ArrayList<>();
    actualV1dlpPoliciesCollectionResponse.setPolicies(policies);
    String actualToStringResult = actualV1dlpPoliciesCollectionResponse.toString();
    Integer actualPage = actualV1dlpPoliciesCollectionResponse.getPage();
    Integer actualPageCount = actualV1dlpPoliciesCollectionResponse.getPageCount();
    List<V1DLPPolicy> actualPolicies = actualV1dlpPoliciesCollectionResponse.getPolicies();

    // Assert
    assertEquals(
        "class V1DLPPoliciesCollectionResponse {\n    policies: []\n    page: 1\n    pageCount: 3\n}",
        actualToStringResult);
    assertEquals(1, actualPage.intValue());
    assertEquals(3, actualPageCount.intValue());
    assertTrue(actualPolicies.isEmpty());
    assertSame(actualV1dlpPoliciesCollectionResponse, actualPageResult);
    assertSame(actualV1dlpPoliciesCollectionResponse, actualPageCountResult);
    assertSame(actualV1dlpPoliciesCollectionResponse, actualPoliciesResult);
    assertSame(policies, actualPolicies);
  }
}
