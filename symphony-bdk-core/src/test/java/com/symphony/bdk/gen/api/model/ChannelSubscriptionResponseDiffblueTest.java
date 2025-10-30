package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ChannelSubscriptionResponseDiffblueTest {
  /**
   * Test {@link ChannelSubscriptionResponse#addSubscriptionErrorsItem(ChannelSubscriptionError)}.
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#addSubscriptionErrorsItem(ChannelSubscriptionError)}
   */
  @Test
  @DisplayName("Test addSubscriptionErrorsItem(ChannelSubscriptionError)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ChannelSubscriptionResponse ChannelSubscriptionResponse.addSubscriptionErrorsItem(ChannelSubscriptionError)"})
  void testAddSubscriptionErrorsItem() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();
    channelSubscriptionResponse.subscriptionErrors(new ArrayList<>());

    // Act and Assert
    assertSame(channelSubscriptionResponse,
        channelSubscriptionResponse.addSubscriptionErrorsItem(new ChannelSubscriptionError()));
  }

  /**
   * Test {@link ChannelSubscriptionResponse#addSubscriptionErrorsItem(ChannelSubscriptionError)}.
   * <ul>
   *   <li>Given {@link ChannelSubscriptionResponse} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#addSubscriptionErrorsItem(ChannelSubscriptionError)}
   */
  @Test
  @DisplayName("Test addSubscriptionErrorsItem(ChannelSubscriptionError); given ChannelSubscriptionResponse (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ChannelSubscriptionResponse ChannelSubscriptionResponse.addSubscriptionErrorsItem(ChannelSubscriptionError)"})
  void testAddSubscriptionErrorsItem_givenChannelSubscriptionResponse() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();

    // Act and Assert
    assertSame(channelSubscriptionResponse,
        channelSubscriptionResponse.addSubscriptionErrorsItem(new ChannelSubscriptionError()));
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}, and {@link ChannelSubscriptionResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ChannelSubscriptionResponse#equals(Object)}
   *   <li>{@link ChannelSubscriptionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();
    ChannelSubscriptionResponse channelSubscriptionResponse2 = new ChannelSubscriptionResponse();

    // Act and Assert
    assertEquals(channelSubscriptionResponse, channelSubscriptionResponse2);
    int expectedHashCodeResult = channelSubscriptionResponse.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriptionResponse2.hashCode());
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}, and {@link ChannelSubscriptionResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ChannelSubscriptionResponse#equals(Object)}
   *   <li>{@link ChannelSubscriptionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();

    // Act and Assert
    assertEquals(channelSubscriptionResponse, channelSubscriptionResponse);
    int expectedHashCodeResult = channelSubscriptionResponse.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriptionResponse.hashCode());
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();
    channelSubscriptionResponse.addSubscriptionErrorsItem(new ChannelSubscriptionError());

    // Act and Assert
    assertNotEquals(channelSubscriptionResponse, new ChannelSubscriptionResponse());
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();
    channelSubscriptionResponse.requestedSubscription(1L);
    channelSubscriptionResponse.addSubscriptionErrorsItem(new ChannelSubscriptionError());

    // Act and Assert
    assertNotEquals(channelSubscriptionResponse, new ChannelSubscriptionResponse());
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();
    channelSubscriptionResponse.successfulSubscription(1L);
    channelSubscriptionResponse.addSubscriptionErrorsItem(new ChannelSubscriptionError());

    // Act and Assert
    assertNotEquals(channelSubscriptionResponse, new ChannelSubscriptionResponse());
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ChannelSubscriptionResponse channelSubscriptionResponse = new ChannelSubscriptionResponse();
    channelSubscriptionResponse.failedSubscription(1L);
    channelSubscriptionResponse.addSubscriptionErrorsItem(new ChannelSubscriptionError());

    // Act and Assert
    assertNotEquals(channelSubscriptionResponse, new ChannelSubscriptionResponse());
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriptionResponse(), null);
  }

  /**
   * Test {@link ChannelSubscriptionResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriptionResponse.equals(Object)",
      "int ChannelSubscriptionResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriptionResponse(), "Different type to ChannelSubscriptionResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ChannelSubscriptionResponse}
   *   <li>{@link ChannelSubscriptionResponse#failedSubscription(Long)}
   *   <li>{@link ChannelSubscriptionResponse#requestedSubscription(Long)}
   *   <li>{@link ChannelSubscriptionResponse#setFailedSubscription(Long)}
   *   <li>{@link ChannelSubscriptionResponse#setRequestedSubscription(Long)}
   *   <li>{@link ChannelSubscriptionResponse#setSubscriptionErrors(List)}
   *   <li>{@link ChannelSubscriptionResponse#setSuccessfulSubscription(Long)}
   *   <li>{@link ChannelSubscriptionResponse#subscriptionErrors(List)}
   *   <li>{@link ChannelSubscriptionResponse#successfulSubscription(Long)}
   *   <li>{@link ChannelSubscriptionResponse#toString()}
   *   <li>{@link ChannelSubscriptionResponse#getFailedSubscription()}
   *   <li>{@link ChannelSubscriptionResponse#getRequestedSubscription()}
   *   <li>{@link ChannelSubscriptionResponse#getSubscriptionErrors()}
   *   <li>{@link ChannelSubscriptionResponse#getSuccessfulSubscription()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ChannelSubscriptionResponse.<init>()",
      "ChannelSubscriptionResponse ChannelSubscriptionResponse.failedSubscription(Long)",
      "Long ChannelSubscriptionResponse.getFailedSubscription()",
      "Long ChannelSubscriptionResponse.getRequestedSubscription()",
      "List ChannelSubscriptionResponse.getSubscriptionErrors()",
      "Long ChannelSubscriptionResponse.getSuccessfulSubscription()",
      "ChannelSubscriptionResponse ChannelSubscriptionResponse.requestedSubscription(Long)",
      "void ChannelSubscriptionResponse.setFailedSubscription(Long)",
      "void ChannelSubscriptionResponse.setRequestedSubscription(Long)",
      "void ChannelSubscriptionResponse.setSubscriptionErrors(List)",
      "void ChannelSubscriptionResponse.setSuccessfulSubscription(Long)",
      "ChannelSubscriptionResponse ChannelSubscriptionResponse.subscriptionErrors(List)",
      "ChannelSubscriptionResponse ChannelSubscriptionResponse.successfulSubscription(Long)",
      "String ChannelSubscriptionResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ChannelSubscriptionResponse actualChannelSubscriptionResponse = new ChannelSubscriptionResponse();
    ChannelSubscriptionResponse actualFailedSubscriptionResult = actualChannelSubscriptionResponse
        .failedSubscription(1L);
    ChannelSubscriptionResponse actualRequestedSubscriptionResult = actualChannelSubscriptionResponse
        .requestedSubscription(1L);
    actualChannelSubscriptionResponse.setFailedSubscription(1L);
    actualChannelSubscriptionResponse.setRequestedSubscription(1L);
    actualChannelSubscriptionResponse.setSubscriptionErrors(new ArrayList<>());
    actualChannelSubscriptionResponse.setSuccessfulSubscription(1L);
    ArrayList<ChannelSubscriptionError> subscriptionErrors = new ArrayList<>();
    ChannelSubscriptionResponse actualSubscriptionErrorsResult = actualChannelSubscriptionResponse
        .subscriptionErrors(subscriptionErrors);
    ChannelSubscriptionResponse actualSuccessfulSubscriptionResult = actualChannelSubscriptionResponse
        .successfulSubscription(1L);
    String actualToStringResult = actualChannelSubscriptionResponse.toString();
    Long actualFailedSubscription = actualChannelSubscriptionResponse.getFailedSubscription();
    Long actualRequestedSubscription = actualChannelSubscriptionResponse.getRequestedSubscription();
    List<ChannelSubscriptionError> actualSubscriptionErrors = actualChannelSubscriptionResponse.getSubscriptionErrors();
    Long actualSuccessfulSubscription = actualChannelSubscriptionResponse.getSuccessfulSubscription();

    // Assert
    assertEquals("class ChannelSubscriptionResponse {\n" + "    requestedSubscription: 1\n"
        + "    successfulSubscription: 1\n" + "    failedSubscription: 1\n" + "    subscriptionErrors: []\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualFailedSubscription.longValue());
    assertEquals(1L, actualRequestedSubscription.longValue());
    assertEquals(1L, actualSuccessfulSubscription.longValue());
    assertTrue(actualSubscriptionErrors.isEmpty());
    assertSame(actualChannelSubscriptionResponse, actualFailedSubscriptionResult);
    assertSame(actualChannelSubscriptionResponse, actualRequestedSubscriptionResult);
    assertSame(actualChannelSubscriptionResponse, actualSubscriptionErrorsResult);
    assertSame(actualChannelSubscriptionResponse, actualSuccessfulSubscriptionResult);
    assertSame(subscriptionErrors, actualSubscriptionErrors);
  }
}
