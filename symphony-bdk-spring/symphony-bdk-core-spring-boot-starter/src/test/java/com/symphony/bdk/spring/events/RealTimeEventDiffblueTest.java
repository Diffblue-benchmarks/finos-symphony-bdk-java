package com.symphony.bdk.spring.events;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V4Initiator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.core.ResolvableType;

class RealTimeEventDiffblueTest {
  /**
   * Test {@link RealTimeEvent#RealTimeEvent(V4Initiator, Object)}.
   *
   * <p>Method under test: {@link RealTimeEvent#RealTimeEvent(V4Initiator, Object)}
   */
  @Test
  @DisplayName("Test new RealTimeEvent(V4Initiator, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEvent.<init>(V4Initiator, Object)"})
  void testNewRealTimeEvent() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    // Act
    RealTimeEvent<Object> actualRealTimeEvent = new RealTimeEvent<>(initiator, "Source");

    // Assert
    assertEquals("Source", actualRealTimeEvent.getSource());
    ResolvableType resolvableType = actualRealTimeEvent.getResolvableType();
    assertEquals(1, resolvableType.getGenerics().length);
    assertEquals(1, resolvableType.getInterfaces().length);
    assertTrue(resolvableType.hasGenerics());
    Class<RealTimeEvent> expectedRawClass = RealTimeEvent.class;
    assertEquals(expectedRawClass, resolvableType.getRawClass());
    assertSame(initiator, actualRealTimeEvent.getInitiator());
  }

  /**
   * Test {@link RealTimeEvent#getResolvableType()}.
   *
   * <p>Method under test: {@link RealTimeEvent#getResolvableType()}
   */
  @Test
  @DisplayName("Test getResolvableType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResolvableType RealTimeEvent.getResolvableType()"})
  void testGetResolvableType() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(new V4Initiator(), "Source");

    // Act
    ResolvableType actualResolvableType = realTimeEvent.getResolvableType();

    // Assert
    assertEquals(1, actualResolvableType.getGenerics().length);
    assertEquals(1, actualResolvableType.getInterfaces().length);
    assertTrue(actualResolvableType.hasGenerics());
    Class<RealTimeEvent> expectedRawClass = RealTimeEvent.class;
    assertEquals(expectedRawClass, actualResolvableType.getRawClass());
    assertSame(ResolvableType.NONE, actualResolvableType.getComponentType());
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}, and {@link RealTimeEvent#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RealTimeEvent#equals(Object)}
   *   <li>{@link RealTimeEvent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(new V4Initiator(), "Source");
    RealTimeEvent<Object> realTimeEvent2 = new RealTimeEvent<>(new V4Initiator(), "Source");

    // Act and Assert
    assertEquals(realTimeEvent, realTimeEvent2);
    int expectedHashCodeResult = realTimeEvent.hashCode();
    assertEquals(expectedHashCodeResult, realTimeEvent2.hashCode());
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}, and {@link RealTimeEvent#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RealTimeEvent#equals(Object)}
   *   <li>{@link RealTimeEvent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(new V4Initiator(), "Source");

    // Act and Assert
    assertEquals(realTimeEvent, realTimeEvent);
    int expectedHashCodeResult = realTimeEvent.hashCode();
    assertEquals(expectedHashCodeResult, realTimeEvent.hashCode());
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(mock(V4Initiator.class), "Source");

    // Act and Assert
    assertNotEquals(realTimeEvent, new RealTimeEvent<>(new V4Initiator(), "Source"));
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(new V4Initiator(), 1);

    // Act and Assert
    assertNotEquals(realTimeEvent, new RealTimeEvent<>(new V4Initiator(), "Source"));
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4Initiator initiator = new V4Initiator();
    RealTimeEvent<Object> realTimeEvent =
        new RealTimeEvent<>(initiator, new RealTimeEvent<>(new V4Initiator(), "Source"));

    // Act and Assert
    assertNotEquals(realTimeEvent, new RealTimeEvent<>(new V4Initiator(), "Source"));
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(new V4Initiator(), "Source");

    // Act and Assert
    assertNotEquals(realTimeEvent, null);
  }

  /**
   * Test {@link RealTimeEvent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RealTimeEvent.equals(Object)", "int RealTimeEvent.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    RealTimeEvent<Object> realTimeEvent = new RealTimeEvent<>(new V4Initiator(), "Source");

    // Act and Assert
    assertNotEquals(realTimeEvent, "Different type to RealTimeEvent");
  }
}
