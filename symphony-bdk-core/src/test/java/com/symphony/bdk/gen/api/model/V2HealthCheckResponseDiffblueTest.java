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

class V2HealthCheckResponseDiffblueTest {
  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}, and {@link
   * V2HealthCheckResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2HealthCheckResponse#equals(Object)}
   *   <li>{@link V2HealthCheckResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    V2HealthCheckResponse v2HealthCheckResponse2 = new V2HealthCheckResponse();

    // Act and Assert
    assertEquals(v2HealthCheckResponse, v2HealthCheckResponse2);
    assertEquals(v2HealthCheckResponse.hashCode(), v2HealthCheckResponse2.hashCode());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}, and {@link
   * V2HealthCheckResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2HealthCheckResponse#equals(Object)}
   *   <li>{@link V2HealthCheckResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();

    // Act and Assert
    assertEquals(v2HealthCheckResponse, v2HealthCheckResponse);
    int expectedHashCodeResult = v2HealthCheckResponse.hashCode();
    assertEquals(expectedHashCodeResult, v2HealthCheckResponse.hashCode());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2HealthCheckResponse(), 1);
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.podConnectivity(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.podConnectivityError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.keyManagerConnectivity(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.keyManagerConnectivityError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.firehoseConnectivity(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.firehoseConnectivityError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.datafeedConnectivity(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.datafeedConnectivityError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.datafeedVersion("1.0.2");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.encryptDecryptSuccess(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.encryptDecryptError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.podVersion("1.0.2");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.agentVersion("1.0.2");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.agentServiceUser(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.agentServiceUserError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.ceServiceUser(true);

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    V2HealthCheckResponse v2HealthCheckResponse = new V2HealthCheckResponse();
    v2HealthCheckResponse.ceServiceUserError("An error occurred");

    // Act and Assert
    assertNotEquals(v2HealthCheckResponse, new V2HealthCheckResponse());
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2HealthCheckResponse(), null);
  }

  /**
   * Test {@link V2HealthCheckResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2HealthCheckResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2HealthCheckResponse.equals(Object)",
    "int V2HealthCheckResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2HealthCheckResponse(), "Different type to V2HealthCheckResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2HealthCheckResponse}
   *   <li>{@link V2HealthCheckResponse#agentServiceUser(Boolean)}
   *   <li>{@link V2HealthCheckResponse#agentServiceUserError(String)}
   *   <li>{@link V2HealthCheckResponse#agentVersion(String)}
   *   <li>{@link V2HealthCheckResponse#ceServiceUser(Boolean)}
   *   <li>{@link V2HealthCheckResponse#ceServiceUserError(String)}
   *   <li>{@link V2HealthCheckResponse#datafeedConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#datafeedConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#datafeedVersion(String)}
   *   <li>{@link V2HealthCheckResponse#encryptDecryptError(String)}
   *   <li>{@link V2HealthCheckResponse#encryptDecryptSuccess(Boolean)}
   *   <li>{@link V2HealthCheckResponse#firehoseConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#firehoseConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#keyManagerConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#keyManagerConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#podConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#podConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#podVersion(String)}
   *   <li>{@link V2HealthCheckResponse#setAgentServiceUser(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setAgentServiceUserError(String)}
   *   <li>{@link V2HealthCheckResponse#setAgentVersion(String)}
   *   <li>{@link V2HealthCheckResponse#setCeServiceUser(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setCeServiceUserError(String)}
   *   <li>{@link V2HealthCheckResponse#setDatafeedConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setDatafeedConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#setDatafeedVersion(String)}
   *   <li>{@link V2HealthCheckResponse#setEncryptDecryptError(String)}
   *   <li>{@link V2HealthCheckResponse#setEncryptDecryptSuccess(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setFirehoseConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setFirehoseConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#setKeyManagerConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setKeyManagerConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#setPodConnectivity(Boolean)}
   *   <li>{@link V2HealthCheckResponse#setPodConnectivityError(String)}
   *   <li>{@link V2HealthCheckResponse#setPodVersion(String)}
   *   <li>{@link V2HealthCheckResponse#toString()}
   *   <li>{@link V2HealthCheckResponse#getAgentServiceUser()}
   *   <li>{@link V2HealthCheckResponse#getAgentServiceUserError()}
   *   <li>{@link V2HealthCheckResponse#getAgentVersion()}
   *   <li>{@link V2HealthCheckResponse#getCeServiceUser()}
   *   <li>{@link V2HealthCheckResponse#getCeServiceUserError()}
   *   <li>{@link V2HealthCheckResponse#getDatafeedConnectivity()}
   *   <li>{@link V2HealthCheckResponse#getDatafeedConnectivityError()}
   *   <li>{@link V2HealthCheckResponse#getDatafeedVersion()}
   *   <li>{@link V2HealthCheckResponse#getEncryptDecryptError()}
   *   <li>{@link V2HealthCheckResponse#getEncryptDecryptSuccess()}
   *   <li>{@link V2HealthCheckResponse#getFirehoseConnectivity()}
   *   <li>{@link V2HealthCheckResponse#getFirehoseConnectivityError()}
   *   <li>{@link V2HealthCheckResponse#getKeyManagerConnectivity()}
   *   <li>{@link V2HealthCheckResponse#getKeyManagerConnectivityError()}
   *   <li>{@link V2HealthCheckResponse#getPodConnectivity()}
   *   <li>{@link V2HealthCheckResponse#getPodConnectivityError()}
   *   <li>{@link V2HealthCheckResponse#getPodVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2HealthCheckResponse.<init>()",
    "V2HealthCheckResponse V2HealthCheckResponse.agentServiceUser(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.agentServiceUserError(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.agentVersion(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.ceServiceUser(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.ceServiceUserError(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.datafeedConnectivity(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.datafeedConnectivityError(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.datafeedVersion(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.encryptDecryptError(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.encryptDecryptSuccess(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.firehoseConnectivity(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.firehoseConnectivityError(String)",
    "Boolean V2HealthCheckResponse.getAgentServiceUser()",
    "String V2HealthCheckResponse.getAgentServiceUserError()",
    "String V2HealthCheckResponse.getAgentVersion()",
    "Boolean V2HealthCheckResponse.getCeServiceUser()",
    "String V2HealthCheckResponse.getCeServiceUserError()",
    "Boolean V2HealthCheckResponse.getDatafeedConnectivity()",
    "String V2HealthCheckResponse.getDatafeedConnectivityError()",
    "String V2HealthCheckResponse.getDatafeedVersion()",
    "String V2HealthCheckResponse.getEncryptDecryptError()",
    "Boolean V2HealthCheckResponse.getEncryptDecryptSuccess()",
    "Boolean V2HealthCheckResponse.getFirehoseConnectivity()",
    "String V2HealthCheckResponse.getFirehoseConnectivityError()",
    "Boolean V2HealthCheckResponse.getKeyManagerConnectivity()",
    "String V2HealthCheckResponse.getKeyManagerConnectivityError()",
    "Boolean V2HealthCheckResponse.getPodConnectivity()",
    "String V2HealthCheckResponse.getPodConnectivityError()",
    "String V2HealthCheckResponse.getPodVersion()",
    "V2HealthCheckResponse V2HealthCheckResponse.keyManagerConnectivity(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.keyManagerConnectivityError(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.podConnectivity(Boolean)",
    "V2HealthCheckResponse V2HealthCheckResponse.podConnectivityError(String)",
    "V2HealthCheckResponse V2HealthCheckResponse.podVersion(String)",
    "void V2HealthCheckResponse.setAgentServiceUser(Boolean)",
    "void V2HealthCheckResponse.setAgentServiceUserError(String)",
    "void V2HealthCheckResponse.setAgentVersion(String)",
    "void V2HealthCheckResponse.setCeServiceUser(Boolean)",
    "void V2HealthCheckResponse.setCeServiceUserError(String)",
    "void V2HealthCheckResponse.setDatafeedConnectivity(Boolean)",
    "void V2HealthCheckResponse.setDatafeedConnectivityError(String)",
    "void V2HealthCheckResponse.setDatafeedVersion(String)",
    "void V2HealthCheckResponse.setEncryptDecryptError(String)",
    "void V2HealthCheckResponse.setEncryptDecryptSuccess(Boolean)",
    "void V2HealthCheckResponse.setFirehoseConnectivity(Boolean)",
    "void V2HealthCheckResponse.setFirehoseConnectivityError(String)",
    "void V2HealthCheckResponse.setKeyManagerConnectivity(Boolean)",
    "void V2HealthCheckResponse.setKeyManagerConnectivityError(String)",
    "void V2HealthCheckResponse.setPodConnectivity(Boolean)",
    "void V2HealthCheckResponse.setPodConnectivityError(String)",
    "void V2HealthCheckResponse.setPodVersion(String)",
    "String V2HealthCheckResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2HealthCheckResponse actualV2HealthCheckResponse = new V2HealthCheckResponse();
    V2HealthCheckResponse actualAgentServiceUserResult =
        actualV2HealthCheckResponse.agentServiceUser(true);
    V2HealthCheckResponse actualAgentServiceUserErrorResult =
        actualV2HealthCheckResponse.agentServiceUserError("An error occurred");
    V2HealthCheckResponse actualAgentVersionResult =
        actualV2HealthCheckResponse.agentVersion("1.0.2");
    V2HealthCheckResponse actualCeServiceUserResult =
        actualV2HealthCheckResponse.ceServiceUser(true);
    V2HealthCheckResponse actualCeServiceUserErrorResult =
        actualV2HealthCheckResponse.ceServiceUserError("An error occurred");
    V2HealthCheckResponse actualDatafeedConnectivityResult =
        actualV2HealthCheckResponse.datafeedConnectivity(true);
    V2HealthCheckResponse actualDatafeedConnectivityErrorResult =
        actualV2HealthCheckResponse.datafeedConnectivityError("An error occurred");
    V2HealthCheckResponse actualDatafeedVersionResult =
        actualV2HealthCheckResponse.datafeedVersion("1.0.2");
    V2HealthCheckResponse actualEncryptDecryptErrorResult =
        actualV2HealthCheckResponse.encryptDecryptError("An error occurred");
    V2HealthCheckResponse actualEncryptDecryptSuccessResult =
        actualV2HealthCheckResponse.encryptDecryptSuccess(true);
    V2HealthCheckResponse actualFirehoseConnectivityResult =
        actualV2HealthCheckResponse.firehoseConnectivity(true);
    V2HealthCheckResponse actualFirehoseConnectivityErrorResult =
        actualV2HealthCheckResponse.firehoseConnectivityError("An error occurred");
    V2HealthCheckResponse actualKeyManagerConnectivityResult =
        actualV2HealthCheckResponse.keyManagerConnectivity(true);
    V2HealthCheckResponse actualKeyManagerConnectivityErrorResult =
        actualV2HealthCheckResponse.keyManagerConnectivityError("An error occurred");
    V2HealthCheckResponse actualPodConnectivityResult =
        actualV2HealthCheckResponse.podConnectivity(true);
    V2HealthCheckResponse actualPodConnectivityErrorResult =
        actualV2HealthCheckResponse.podConnectivityError("An error occurred");
    V2HealthCheckResponse actualPodVersionResult = actualV2HealthCheckResponse.podVersion("1.0.2");
    actualV2HealthCheckResponse.setAgentServiceUser(true);
    actualV2HealthCheckResponse.setAgentServiceUserError("An error occurred");
    actualV2HealthCheckResponse.setAgentVersion("1.0.2");
    actualV2HealthCheckResponse.setCeServiceUser(true);
    actualV2HealthCheckResponse.setCeServiceUserError("An error occurred");
    actualV2HealthCheckResponse.setDatafeedConnectivity(true);
    actualV2HealthCheckResponse.setDatafeedConnectivityError("An error occurred");
    actualV2HealthCheckResponse.setDatafeedVersion("1.0.2");
    actualV2HealthCheckResponse.setEncryptDecryptError("An error occurred");
    actualV2HealthCheckResponse.setEncryptDecryptSuccess(true);
    actualV2HealthCheckResponse.setFirehoseConnectivity(true);
    actualV2HealthCheckResponse.setFirehoseConnectivityError("An error occurred");
    actualV2HealthCheckResponse.setKeyManagerConnectivity(true);
    actualV2HealthCheckResponse.setKeyManagerConnectivityError("An error occurred");
    actualV2HealthCheckResponse.setPodConnectivity(true);
    actualV2HealthCheckResponse.setPodConnectivityError("An error occurred");
    actualV2HealthCheckResponse.setPodVersion("1.0.2");
    String actualToStringResult = actualV2HealthCheckResponse.toString();
    Boolean actualAgentServiceUser = actualV2HealthCheckResponse.getAgentServiceUser();
    String actualAgentServiceUserError = actualV2HealthCheckResponse.getAgentServiceUserError();
    String actualAgentVersion = actualV2HealthCheckResponse.getAgentVersion();
    Boolean actualCeServiceUser = actualV2HealthCheckResponse.getCeServiceUser();
    String actualCeServiceUserError = actualV2HealthCheckResponse.getCeServiceUserError();
    Boolean actualDatafeedConnectivity = actualV2HealthCheckResponse.getDatafeedConnectivity();
    String actualDatafeedConnectivityError =
        actualV2HealthCheckResponse.getDatafeedConnectivityError();
    String actualDatafeedVersion = actualV2HealthCheckResponse.getDatafeedVersion();
    String actualEncryptDecryptError = actualV2HealthCheckResponse.getEncryptDecryptError();
    Boolean actualEncryptDecryptSuccess = actualV2HealthCheckResponse.getEncryptDecryptSuccess();
    Boolean actualFirehoseConnectivity = actualV2HealthCheckResponse.getFirehoseConnectivity();
    String actualFirehoseConnectivityError =
        actualV2HealthCheckResponse.getFirehoseConnectivityError();
    Boolean actualKeyManagerConnectivity = actualV2HealthCheckResponse.getKeyManagerConnectivity();
    String actualKeyManagerConnectivityError =
        actualV2HealthCheckResponse.getKeyManagerConnectivityError();
    Boolean actualPodConnectivity = actualV2HealthCheckResponse.getPodConnectivity();
    String actualPodConnectivityError = actualV2HealthCheckResponse.getPodConnectivityError();

    // Assert
    assertEquals("1.0.2", actualAgentVersion);
    assertEquals("1.0.2", actualDatafeedVersion);
    assertEquals("1.0.2", actualV2HealthCheckResponse.getPodVersion());
    assertEquals("An error occurred", actualAgentServiceUserError);
    assertEquals("An error occurred", actualCeServiceUserError);
    assertEquals("An error occurred", actualDatafeedConnectivityError);
    assertEquals("An error occurred", actualEncryptDecryptError);
    assertEquals("An error occurred", actualFirehoseConnectivityError);
    assertEquals("An error occurred", actualKeyManagerConnectivityError);
    assertEquals("An error occurred", actualPodConnectivityError);
    assertEquals(
        "class V2HealthCheckResponse {\n"
            + "    podConnectivity: true\n"
            + "    podConnectivityError: An error occurred\n"
            + "    keyManagerConnectivity: true\n"
            + "    keyManagerConnectivityError: An error occurred\n"
            + "    firehoseConnectivity: true\n"
            + "    firehoseConnectivityError: An error occurred\n"
            + "    datafeedConnectivity: true\n"
            + "    datafeedConnectivityError: An error occurred\n"
            + "    datafeedVersion: 1.0.2\n"
            + "    encryptDecryptSuccess: true\n"
            + "    encryptDecryptError: An error occurred\n"
            + "    podVersion: 1.0.2\n"
            + "    agentVersion: 1.0.2\n"
            + "    agentServiceUser: true\n"
            + "    agentServiceUserError: An error occurred\n"
            + "    ceServiceUser: true\n"
            + "    ceServiceUserError: An error occurred\n"
            + "}",
        actualToStringResult);
    assertTrue(actualAgentServiceUser);
    assertTrue(actualCeServiceUser);
    assertTrue(actualDatafeedConnectivity);
    assertTrue(actualEncryptDecryptSuccess);
    assertTrue(actualFirehoseConnectivity);
    assertTrue(actualKeyManagerConnectivity);
    assertTrue(actualPodConnectivity);
    assertSame(actualV2HealthCheckResponse, actualAgentServiceUserResult);
    assertSame(actualV2HealthCheckResponse, actualAgentServiceUserErrorResult);
    assertSame(actualV2HealthCheckResponse, actualAgentVersionResult);
    assertSame(actualV2HealthCheckResponse, actualCeServiceUserResult);
    assertSame(actualV2HealthCheckResponse, actualCeServiceUserErrorResult);
    assertSame(actualV2HealthCheckResponse, actualDatafeedConnectivityResult);
    assertSame(actualV2HealthCheckResponse, actualDatafeedConnectivityErrorResult);
    assertSame(actualV2HealthCheckResponse, actualDatafeedVersionResult);
    assertSame(actualV2HealthCheckResponse, actualEncryptDecryptErrorResult);
    assertSame(actualV2HealthCheckResponse, actualEncryptDecryptSuccessResult);
    assertSame(actualV2HealthCheckResponse, actualFirehoseConnectivityResult);
    assertSame(actualV2HealthCheckResponse, actualFirehoseConnectivityErrorResult);
    assertSame(actualV2HealthCheckResponse, actualKeyManagerConnectivityResult);
    assertSame(actualV2HealthCheckResponse, actualKeyManagerConnectivityErrorResult);
    assertSame(actualV2HealthCheckResponse, actualPodConnectivityResult);
    assertSame(actualV2HealthCheckResponse, actualPodConnectivityErrorResult);
    assertSame(actualV2HealthCheckResponse, actualPodVersionResult);
  }
}
