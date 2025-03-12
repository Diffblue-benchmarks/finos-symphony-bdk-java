package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ChannelSubscriberDiffblueTest {
  /**
   * Test {@link ChannelSubscriber#equals(Object)}, and {@link ChannelSubscriber#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ChannelSubscriber#equals(Object)}
   *   <li>{@link ChannelSubscriber#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    ChannelSubscriber channelSubscriber2 = new ChannelSubscriber();

    // Act and Assert
    assertEquals(channelSubscriber, channelSubscriber2);
    int expectedHashCodeResult = channelSubscriber.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriber2.hashCode());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}, and {@link ChannelSubscriber#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ChannelSubscriber#equals(Object)}
   *   <li>{@link ChannelSubscriber#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();

    // Act and Assert
    assertEquals(channelSubscriber, channelSubscriber);
    int expectedHashCodeResult = channelSubscriber.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriber.hashCode());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriber(), 1);
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.subscriptionId("42");

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.pushed(true);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.owner(true);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.subscriberName("Subscriber Name");

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.userId(1L);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.timestamp(10L);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriber(), null);
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ChannelSubscriber.equals(Object)", "int ChannelSubscriber.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriber(), "Different type to ChannelSubscriber");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ChannelSubscriber}
   *   <li>{@link ChannelSubscriber#owner(Boolean)}
   *   <li>{@link ChannelSubscriber#pushed(Boolean)}
   *   <li>{@link ChannelSubscriber#setOwner(Boolean)}
   *   <li>{@link ChannelSubscriber#setPushed(Boolean)}
   *   <li>{@link ChannelSubscriber#setSubscriberName(String)}
   *   <li>{@link ChannelSubscriber#setSubscriptionId(String)}
   *   <li>{@link ChannelSubscriber#setTimestamp(Long)}
   *   <li>{@link ChannelSubscriber#setUserId(Long)}
   *   <li>{@link ChannelSubscriber#subscriberName(String)}
   *   <li>{@link ChannelSubscriber#subscriptionId(String)}
   *   <li>{@link ChannelSubscriber#timestamp(Long)}
   *   <li>{@link ChannelSubscriber#userId(Long)}
   *   <li>{@link ChannelSubscriber#toString()}
   *   <li>{@link ChannelSubscriber#getOwner()}
   *   <li>{@link ChannelSubscriber#getPushed()}
   *   <li>{@link ChannelSubscriber#getSubscriberName()}
   *   <li>{@link ChannelSubscriber#getSubscriptionId()}
   *   <li>{@link ChannelSubscriber#getTimestamp()}
   *   <li>{@link ChannelSubscriber#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ChannelSubscriber.<init>()", "Boolean ChannelSubscriber.getOwner()",
      "Boolean ChannelSubscriber.getPushed()", "String ChannelSubscriber.getSubscriberName()",
      "String ChannelSubscriber.getSubscriptionId()", "Long ChannelSubscriber.getTimestamp()",
      "Long ChannelSubscriber.getUserId()", "ChannelSubscriber ChannelSubscriber.owner(Boolean)",
      "ChannelSubscriber ChannelSubscriber.pushed(Boolean)", "void ChannelSubscriber.setOwner(Boolean)",
      "void ChannelSubscriber.setPushed(Boolean)", "void ChannelSubscriber.setSubscriberName(String)",
      "void ChannelSubscriber.setSubscriptionId(String)", "void ChannelSubscriber.setTimestamp(Long)",
      "void ChannelSubscriber.setUserId(Long)", "ChannelSubscriber ChannelSubscriber.subscriberName(String)",
      "ChannelSubscriber ChannelSubscriber.subscriptionId(String)",
      "ChannelSubscriber ChannelSubscriber.timestamp(Long)", "String ChannelSubscriber.toString()",
      "ChannelSubscriber ChannelSubscriber.userId(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    ChannelSubscriber actualChannelSubscriber = new ChannelSubscriber();
    ChannelSubscriber actualOwnerResult = actualChannelSubscriber.owner(true);
    ChannelSubscriber actualPushedResult = actualChannelSubscriber.pushed(true);
    actualChannelSubscriber.setOwner(true);
    actualChannelSubscriber.setPushed(true);
    actualChannelSubscriber.setSubscriberName("Subscriber Name");
    actualChannelSubscriber.setSubscriptionId("42");
    actualChannelSubscriber.setTimestamp(10L);
    actualChannelSubscriber.setUserId(1L);
    ChannelSubscriber actualSubscriberNameResult = actualChannelSubscriber.subscriberName("Subscriber Name");
    ChannelSubscriber actualSubscriptionIdResult = actualChannelSubscriber.subscriptionId("42");
    ChannelSubscriber actualTimestampResult = actualChannelSubscriber.timestamp(10L);
    ChannelSubscriber actualUserIdResult = actualChannelSubscriber.userId(1L);
    String actualToStringResult = actualChannelSubscriber.toString();
    Boolean actualOwner = actualChannelSubscriber.getOwner();
    Boolean actualPushed = actualChannelSubscriber.getPushed();
    String actualSubscriberName = actualChannelSubscriber.getSubscriberName();
    String actualSubscriptionId = actualChannelSubscriber.getSubscriptionId();
    Long actualTimestamp = actualChannelSubscriber.getTimestamp();
    Long actualUserId = actualChannelSubscriber.getUserId();

    // Assert
    assertEquals("42", actualSubscriptionId);
    assertEquals("Subscriber Name", actualSubscriberName);
    assertEquals(
        "class ChannelSubscriber {\n" + "    subscriptionId: 42\n" + "    pushed: true\n" + "    owner: true\n"
            + "    subscriberName: Subscriber Name\n" + "    userId: 1\n" + "    timestamp: 10\n" + "}",
        actualToStringResult);
    assertEquals(10L, actualTimestamp.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualOwner);
    assertTrue(actualPushed);
    assertSame(actualChannelSubscriber, actualOwnerResult);
    assertSame(actualChannelSubscriber, actualPushedResult);
    assertSame(actualChannelSubscriber, actualSubscriberNameResult);
    assertSame(actualChannelSubscriber, actualSubscriptionIdResult);
    assertSame(actualChannelSubscriber, actualTimestampResult);
    assertSame(actualChannelSubscriber, actualUserIdResult);
  }
}
