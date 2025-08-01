package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1HealthCheckResponseDiffblueTest {
  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}, and {@link
   * V1HealthCheckResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1HealthCheckResponse#equals(Object)}
   *   <li>{@link V1HealthCheckResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();
    V1HealthCheckResponse v1HealthCheckResponse2 = new V1HealthCheckResponse();

    // Act and Assert
    assertEquals(v1HealthCheckResponse, v1HealthCheckResponse2);
    int expectedHashCodeResult = v1HealthCheckResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1HealthCheckResponse2.hashCode());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}, and {@link
   * V1HealthCheckResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1HealthCheckResponse#equals(Object)}
   *   <li>{@link V1HealthCheckResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();

    // Act and Assert
    assertEquals(v1HealthCheckResponse, v1HealthCheckResponse);
    int expectedHashCodeResult = v1HealthCheckResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1HealthCheckResponse.hashCode());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1HealthCheckResponse(), 1);
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();
    v1HealthCheckResponse.podConnectivity(true);

    // Act and Assert
    assertNotEquals(v1HealthCheckResponse, new V1HealthCheckResponse());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();
    v1HealthCheckResponse.podConnectivityError("An error occurred");

    // Act and Assert
    assertNotEquals(v1HealthCheckResponse, new V1HealthCheckResponse());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();
    v1HealthCheckResponse.keyManagerConnectivity(true);

    // Act and Assert
    assertNotEquals(v1HealthCheckResponse, new V1HealthCheckResponse());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();
    v1HealthCheckResponse.keyManagerConnectivityError("An error occurred");

    // Act and Assert
    assertNotEquals(v1HealthCheckResponse, new V1HealthCheckResponse());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1HealthCheckResponse v1HealthCheckResponse = new V1HealthCheckResponse();
    v1HealthCheckResponse.version("1.0.2");

    // Act and Assert
    assertNotEquals(v1HealthCheckResponse, new V1HealthCheckResponse());
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1HealthCheckResponse(), null);
  }

  /**
   * Test {@link V1HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1HealthCheckResponse.equals(Object)",
    "int V1HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1HealthCheckResponse(), "Different type to V1HealthCheckResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1HealthCheckResponse}
   *   <li>{@link V1HealthCheckResponse#keyManagerConnectivity(Boolean)}
   *   <li>{@link V1HealthCheckResponse#keyManagerConnectivityError(String)}
   *   <li>{@link V1HealthCheckResponse#podConnectivity(Boolean)}
   *   <li>{@link V1HealthCheckResponse#podConnectivityError(String)}
   *   <li>{@link V1HealthCheckResponse#setKeyManagerConnectivity(Boolean)}
   *   <li>{@link V1HealthCheckResponse#setKeyManagerConnectivityError(String)}
   *   <li>{@link V1HealthCheckResponse#setPodConnectivity(Boolean)}
   *   <li>{@link V1HealthCheckResponse#setPodConnectivityError(String)}
   *   <li>{@link V1HealthCheckResponse#setVersion(String)}
   *   <li>{@link V1HealthCheckResponse#version(String)}
   *   <li>{@link V1HealthCheckResponse#toString()}
   *   <li>{@link V1HealthCheckResponse#getKeyManagerConnectivity()}
   *   <li>{@link V1HealthCheckResponse#getKeyManagerConnectivityError()}
   *   <li>{@link V1HealthCheckResponse#getPodConnectivity()}
   *   <li>{@link V1HealthCheckResponse#getPodConnectivityError()}
   *   <li>{@link V1HealthCheckResponse#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1HealthCheckResponse.<init>()",
    "Boolean V1HealthCheckResponse.getKeyManagerConnectivity()",
    "String V1HealthCheckResponse.getKeyManagerConnectivityError()",
    "Boolean V1HealthCheckResponse.getPodConnectivity()",
    "String V1HealthCheckResponse.getPodConnectivityError()",
    "String V1HealthCheckResponse.getVersion()",
    "V1HealthCheckResponse V1HealthCheckResponse.keyManagerConnectivity(Boolean)",
    "V1HealthCheckResponse V1HealthCheckResponse.keyManagerConnectivityError(String)",
    "V1HealthCheckResponse V1HealthCheckResponse.podConnectivity(Boolean)",
    "V1HealthCheckResponse V1HealthCheckResponse.podConnectivityError(String)",
    "void V1HealthCheckResponse.setKeyManagerConnectivity(Boolean)",
    "void V1HealthCheckResponse.setKeyManagerConnectivityError(String)",
    "void V1HealthCheckResponse.setPodConnectivity(Boolean)",
    "void V1HealthCheckResponse.setPodConnectivityError(String)",
    "void V1HealthCheckResponse.setVersion(String)",
    "String V1HealthCheckResponse.toString()",
    "V1HealthCheckResponse V1HealthCheckResponse.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1HealthCheckResponse actualV1HealthCheckResponse = new V1HealthCheckResponse();
    V1HealthCheckResponse actualKeyManagerConnectivityResult =
        actualV1HealthCheckResponse.keyManagerConnectivity(true);
    V1HealthCheckResponse actualKeyManagerConnectivityErrorResult =
        actualV1HealthCheckResponse.keyManagerConnectivityError("An error occurred");
    V1HealthCheckResponse actualPodConnectivityResult =
        actualV1HealthCheckResponse.podConnectivity(true);
    V1HealthCheckResponse actualPodConnectivityErrorResult =
        actualV1HealthCheckResponse.podConnectivityError("An error occurred");
    actualV1HealthCheckResponse.setKeyManagerConnectivity(true);
    actualV1HealthCheckResponse.setKeyManagerConnectivityError("An error occurred");
    actualV1HealthCheckResponse.setPodConnectivity(true);
    actualV1HealthCheckResponse.setPodConnectivityError("An error occurred");
    actualV1HealthCheckResponse.setVersion("1.0.2");
    V1HealthCheckResponse actualVersionResult = actualV1HealthCheckResponse.version("1.0.2");
    String actualToStringResult = actualV1HealthCheckResponse.toString();
    Boolean actualKeyManagerConnectivity = actualV1HealthCheckResponse.getKeyManagerConnectivity();
    String actualKeyManagerConnectivityError =
        actualV1HealthCheckResponse.getKeyManagerConnectivityError();
    Boolean actualPodConnectivity = actualV1HealthCheckResponse.getPodConnectivity();
    String actualPodConnectivityError = actualV1HealthCheckResponse.getPodConnectivityError();

    // Assert
    assertEquals("1.0.2", actualV1HealthCheckResponse.getVersion());
    assertEquals("An error occurred", actualKeyManagerConnectivityError);
    assertEquals("An error occurred", actualPodConnectivityError);
    assertEquals(
        "class V1HealthCheckResponse {\n"
            + "    podConnectivity: true\n"
            + "    podConnectivityError: An error occurred\n"
            + "    keyManagerConnectivity: true\n"
            + "    keyManagerConnectivityError: An error occurred\n"
            + "    version: 1.0.2\n"
            + "}",
        actualToStringResult);
    assertTrue(actualKeyManagerConnectivity);
    assertTrue(actualPodConnectivity);
    assertSame(actualV1HealthCheckResponse, actualKeyManagerConnectivityResult);
    assertSame(actualV1HealthCheckResponse, actualKeyManagerConnectivityErrorResult);
    assertSame(actualV1HealthCheckResponse, actualPodConnectivityResult);
    assertSame(actualV1HealthCheckResponse, actualPodConnectivityErrorResult);
    assertSame(actualV1HealthCheckResponse, actualVersionResult);
  }
}
