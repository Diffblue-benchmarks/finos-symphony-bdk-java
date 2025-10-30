package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPStreamDiffblueTest {
  /**
   * Test {@link V1DLPStream#equals(Object)}, and {@link V1DLPStream#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPStream#equals(Object)}
   *   <li>{@link V1DLPStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    V1DLPStream v1dlpStream2 = new V1DLPStream();

    // Act and Assert
    assertEquals(v1dlpStream, v1dlpStream2);
    int expectedHashCodeResult = v1dlpStream.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpStream2.hashCode());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}, and {@link V1DLPStream#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPStream#equals(Object)}
   *   <li>{@link V1DLPStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();

    // Act and Assert
    assertEquals(v1dlpStream, v1dlpStream);
    int expectedHashCodeResult = v1dlpStream.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpStream.hashCode());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPStream(), 1);
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.name("Name");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.creatorPrettyName("Creator Pretty Name");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.publicRoom(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.crossPod(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.allowExternal(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.creatorId("42");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.roomDescription("Room Description");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.streamId("42");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.state("MD");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.type("Type");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.lastDisabled(1L);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.memberAddUserEnabled(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.active(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.discoverable(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.readOnly(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.copyDisabled(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.externalOwned(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual19() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.sendMessageDisabled(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual20() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.moderated(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual21() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.shareHistoryEnabled(true);

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual22() {
    // Arrange
    V1DLPStream v1dlpStream = new V1DLPStream();
    v1dlpStream.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v1dlpStream, new V1DLPStream());
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPStream(), null);
  }

  /**
   * Test {@link V1DLPStream#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPStream.equals(Object)", "int V1DLPStream.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPStream(), "Different type to V1DLPStream");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPStream}
   *   <li>{@link V1DLPStream#active(Boolean)}
   *   <li>{@link V1DLPStream#allowExternal(Boolean)}
   *   <li>{@link V1DLPStream#copyDisabled(Boolean)}
   *   <li>{@link V1DLPStream#creatorId(String)}
   *   <li>{@link V1DLPStream#creatorPrettyName(String)}
   *   <li>{@link V1DLPStream#crossPod(Boolean)}
   *   <li>{@link V1DLPStream#diagnostic(String)}
   *   <li>{@link V1DLPStream#discoverable(Boolean)}
   *   <li>{@link V1DLPStream#externalOwned(Boolean)}
   *   <li>{@link V1DLPStream#lastDisabled(Long)}
   *   <li>{@link V1DLPStream#memberAddUserEnabled(Boolean)}
   *   <li>{@link V1DLPStream#moderated(Boolean)}
   *   <li>{@link V1DLPStream#name(String)}
   *   <li>{@link V1DLPStream#publicRoom(Boolean)}
   *   <li>{@link V1DLPStream#readOnly(Boolean)}
   *   <li>{@link V1DLPStream#roomDescription(String)}
   *   <li>{@link V1DLPStream#sendMessageDisabled(Boolean)}
   *   <li>{@link V1DLPStream#setActive(Boolean)}
   *   <li>{@link V1DLPStream#setAllowExternal(Boolean)}
   *   <li>{@link V1DLPStream#setCopyDisabled(Boolean)}
   *   <li>{@link V1DLPStream#setCreatorId(String)}
   *   <li>{@link V1DLPStream#setCreatorPrettyName(String)}
   *   <li>{@link V1DLPStream#setCrossPod(Boolean)}
   *   <li>{@link V1DLPStream#setDiagnostic(String)}
   *   <li>{@link V1DLPStream#setDiscoverable(Boolean)}
   *   <li>{@link V1DLPStream#setExternalOwned(Boolean)}
   *   <li>{@link V1DLPStream#setLastDisabled(Long)}
   *   <li>{@link V1DLPStream#setMemberAddUserEnabled(Boolean)}
   *   <li>{@link V1DLPStream#setModerated(Boolean)}
   *   <li>{@link V1DLPStream#setName(String)}
   *   <li>{@link V1DLPStream#setPublicRoom(Boolean)}
   *   <li>{@link V1DLPStream#setReadOnly(Boolean)}
   *   <li>{@link V1DLPStream#setRoomDescription(String)}
   *   <li>{@link V1DLPStream#setSendMessageDisabled(Boolean)}
   *   <li>{@link V1DLPStream#setShareHistoryEnabled(Boolean)}
   *   <li>{@link V1DLPStream#setState(String)}
   *   <li>{@link V1DLPStream#setStreamId(String)}
   *   <li>{@link V1DLPStream#setType(String)}
   *   <li>{@link V1DLPStream#shareHistoryEnabled(Boolean)}
   *   <li>{@link V1DLPStream#state(String)}
   *   <li>{@link V1DLPStream#streamId(String)}
   *   <li>{@link V1DLPStream#type(String)}
   *   <li>{@link V1DLPStream#toString()}
   *   <li>{@link V1DLPStream#getActive()}
   *   <li>{@link V1DLPStream#getAllowExternal()}
   *   <li>{@link V1DLPStream#getCopyDisabled()}
   *   <li>{@link V1DLPStream#getCreatorId()}
   *   <li>{@link V1DLPStream#getCreatorPrettyName()}
   *   <li>{@link V1DLPStream#getCrossPod()}
   *   <li>{@link V1DLPStream#getDiagnostic()}
   *   <li>{@link V1DLPStream#getDiscoverable()}
   *   <li>{@link V1DLPStream#getExternalOwned()}
   *   <li>{@link V1DLPStream#getLastDisabled()}
   *   <li>{@link V1DLPStream#getMemberAddUserEnabled()}
   *   <li>{@link V1DLPStream#getModerated()}
   *   <li>{@link V1DLPStream#getName()}
   *   <li>{@link V1DLPStream#getPublicRoom()}
   *   <li>{@link V1DLPStream#getReadOnly()}
   *   <li>{@link V1DLPStream#getRoomDescription()}
   *   <li>{@link V1DLPStream#getSendMessageDisabled()}
   *   <li>{@link V1DLPStream#getShareHistoryEnabled()}
   *   <li>{@link V1DLPStream#getState()}
   *   <li>{@link V1DLPStream#getStreamId()}
   *   <li>{@link V1DLPStream#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPStream.<init>()", "V1DLPStream V1DLPStream.active(Boolean)",
      "V1DLPStream V1DLPStream.allowExternal(Boolean)", "V1DLPStream V1DLPStream.copyDisabled(Boolean)",
      "V1DLPStream V1DLPStream.creatorId(String)", "V1DLPStream V1DLPStream.creatorPrettyName(String)",
      "V1DLPStream V1DLPStream.crossPod(Boolean)", "V1DLPStream V1DLPStream.diagnostic(String)",
      "V1DLPStream V1DLPStream.discoverable(Boolean)", "V1DLPStream V1DLPStream.externalOwned(Boolean)",
      "Boolean V1DLPStream.getActive()", "Boolean V1DLPStream.getAllowExternal()",
      "Boolean V1DLPStream.getCopyDisabled()", "String V1DLPStream.getCreatorId()",
      "String V1DLPStream.getCreatorPrettyName()", "Boolean V1DLPStream.getCrossPod()",
      "String V1DLPStream.getDiagnostic()", "Boolean V1DLPStream.getDiscoverable()",
      "Boolean V1DLPStream.getExternalOwned()", "Long V1DLPStream.getLastDisabled()",
      "Boolean V1DLPStream.getMemberAddUserEnabled()", "Boolean V1DLPStream.getModerated()",
      "String V1DLPStream.getName()", "Boolean V1DLPStream.getPublicRoom()", "Boolean V1DLPStream.getReadOnly()",
      "String V1DLPStream.getRoomDescription()", "Boolean V1DLPStream.getSendMessageDisabled()",
      "Boolean V1DLPStream.getShareHistoryEnabled()", "String V1DLPStream.getState()",
      "String V1DLPStream.getStreamId()", "String V1DLPStream.getType()", "V1DLPStream V1DLPStream.lastDisabled(Long)",
      "V1DLPStream V1DLPStream.memberAddUserEnabled(Boolean)", "V1DLPStream V1DLPStream.moderated(Boolean)",
      "V1DLPStream V1DLPStream.name(String)", "V1DLPStream V1DLPStream.publicRoom(Boolean)",
      "V1DLPStream V1DLPStream.readOnly(Boolean)", "V1DLPStream V1DLPStream.roomDescription(String)",
      "V1DLPStream V1DLPStream.sendMessageDisabled(Boolean)", "void V1DLPStream.setActive(Boolean)",
      "void V1DLPStream.setAllowExternal(Boolean)", "void V1DLPStream.setCopyDisabled(Boolean)",
      "void V1DLPStream.setCreatorId(String)", "void V1DLPStream.setCreatorPrettyName(String)",
      "void V1DLPStream.setCrossPod(Boolean)", "void V1DLPStream.setDiagnostic(String)",
      "void V1DLPStream.setDiscoverable(Boolean)", "void V1DLPStream.setExternalOwned(Boolean)",
      "void V1DLPStream.setLastDisabled(Long)", "void V1DLPStream.setMemberAddUserEnabled(Boolean)",
      "void V1DLPStream.setModerated(Boolean)", "void V1DLPStream.setName(String)",
      "void V1DLPStream.setPublicRoom(Boolean)", "void V1DLPStream.setReadOnly(Boolean)",
      "void V1DLPStream.setRoomDescription(String)", "void V1DLPStream.setSendMessageDisabled(Boolean)",
      "void V1DLPStream.setShareHistoryEnabled(Boolean)", "void V1DLPStream.setState(String)",
      "void V1DLPStream.setStreamId(String)", "void V1DLPStream.setType(String)",
      "V1DLPStream V1DLPStream.shareHistoryEnabled(Boolean)", "V1DLPStream V1DLPStream.state(String)",
      "V1DLPStream V1DLPStream.streamId(String)", "String V1DLPStream.toString()",
      "V1DLPStream V1DLPStream.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPStream actualV1dlpStream = new V1DLPStream();
    V1DLPStream actualActiveResult = actualV1dlpStream.active(true);
    V1DLPStream actualAllowExternalResult = actualV1dlpStream.allowExternal(true);
    V1DLPStream actualCopyDisabledResult = actualV1dlpStream.copyDisabled(true);
    V1DLPStream actualCreatorIdResult = actualV1dlpStream.creatorId("42");
    V1DLPStream actualCreatorPrettyNameResult = actualV1dlpStream.creatorPrettyName("Creator Pretty Name");
    V1DLPStream actualCrossPodResult = actualV1dlpStream.crossPod(true);
    V1DLPStream actualDiagnosticResult = actualV1dlpStream.diagnostic("Diagnostic");
    V1DLPStream actualDiscoverableResult = actualV1dlpStream.discoverable(true);
    V1DLPStream actualExternalOwnedResult = actualV1dlpStream.externalOwned(true);
    V1DLPStream actualLastDisabledResult = actualV1dlpStream.lastDisabled(1L);
    V1DLPStream actualMemberAddUserEnabledResult = actualV1dlpStream.memberAddUserEnabled(true);
    V1DLPStream actualModeratedResult = actualV1dlpStream.moderated(true);
    V1DLPStream actualNameResult = actualV1dlpStream.name("Name");
    V1DLPStream actualPublicRoomResult = actualV1dlpStream.publicRoom(true);
    V1DLPStream actualReadOnlyResult = actualV1dlpStream.readOnly(true);
    V1DLPStream actualRoomDescriptionResult = actualV1dlpStream.roomDescription("Room Description");
    V1DLPStream actualSendMessageDisabledResult = actualV1dlpStream.sendMessageDisabled(true);
    actualV1dlpStream.setActive(true);
    actualV1dlpStream.setAllowExternal(true);
    actualV1dlpStream.setCopyDisabled(true);
    actualV1dlpStream.setCreatorId("42");
    actualV1dlpStream.setCreatorPrettyName("Creator Pretty Name");
    actualV1dlpStream.setCrossPod(true);
    actualV1dlpStream.setDiagnostic("Diagnostic");
    actualV1dlpStream.setDiscoverable(true);
    actualV1dlpStream.setExternalOwned(true);
    actualV1dlpStream.setLastDisabled(1L);
    actualV1dlpStream.setMemberAddUserEnabled(true);
    actualV1dlpStream.setModerated(true);
    actualV1dlpStream.setName("Name");
    actualV1dlpStream.setPublicRoom(true);
    actualV1dlpStream.setReadOnly(true);
    actualV1dlpStream.setRoomDescription("Room Description");
    actualV1dlpStream.setSendMessageDisabled(true);
    actualV1dlpStream.setShareHistoryEnabled(true);
    actualV1dlpStream.setState("MD");
    actualV1dlpStream.setStreamId("42");
    actualV1dlpStream.setType("Type");
    V1DLPStream actualShareHistoryEnabledResult = actualV1dlpStream.shareHistoryEnabled(true);
    V1DLPStream actualStateResult = actualV1dlpStream.state("MD");
    V1DLPStream actualStreamIdResult = actualV1dlpStream.streamId("42");
    V1DLPStream actualTypeResult = actualV1dlpStream.type("Type");
    String actualToStringResult = actualV1dlpStream.toString();
    Boolean actualActive = actualV1dlpStream.getActive();
    Boolean actualAllowExternal = actualV1dlpStream.getAllowExternal();
    Boolean actualCopyDisabled = actualV1dlpStream.getCopyDisabled();
    String actualCreatorId = actualV1dlpStream.getCreatorId();
    String actualCreatorPrettyName = actualV1dlpStream.getCreatorPrettyName();
    Boolean actualCrossPod = actualV1dlpStream.getCrossPod();
    String actualDiagnostic = actualV1dlpStream.getDiagnostic();
    Boolean actualDiscoverable = actualV1dlpStream.getDiscoverable();
    Boolean actualExternalOwned = actualV1dlpStream.getExternalOwned();
    Long actualLastDisabled = actualV1dlpStream.getLastDisabled();
    Boolean actualMemberAddUserEnabled = actualV1dlpStream.getMemberAddUserEnabled();
    Boolean actualModerated = actualV1dlpStream.getModerated();
    String actualName = actualV1dlpStream.getName();
    Boolean actualPublicRoom = actualV1dlpStream.getPublicRoom();
    Boolean actualReadOnly = actualV1dlpStream.getReadOnly();
    String actualRoomDescription = actualV1dlpStream.getRoomDescription();
    Boolean actualSendMessageDisabled = actualV1dlpStream.getSendMessageDisabled();
    Boolean actualShareHistoryEnabled = actualV1dlpStream.getShareHistoryEnabled();
    String actualState = actualV1dlpStream.getState();
    String actualStreamId = actualV1dlpStream.getStreamId();

    // Assert
    assertEquals("42", actualCreatorId);
    assertEquals("42", actualStreamId);
    assertEquals("Creator Pretty Name", actualCreatorPrettyName);
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("MD", actualState);
    assertEquals("Name", actualName);
    assertEquals("Room Description", actualRoomDescription);
    assertEquals("Type", actualV1dlpStream.getType());
    assertEquals("class V1DLPStream {\n" + "    name: Name\n" + "    creatorPrettyName: Creator Pretty Name\n"
        + "    publicRoom: true\n" + "    crossPod: true\n" + "    allowExternal: true\n" + "    creatorId: 42\n"
        + "    roomDescription: Room Description\n" + "    streamId: 42\n" + "    state: MD\n" + "    type: Type\n"
        + "    lastDisabled: 1\n" + "    memberAddUserEnabled: true\n" + "    active: true\n"
        + "    discoverable: true\n" + "    readOnly: true\n" + "    copyDisabled: true\n" + "    externalOwned: true\n"
        + "    sendMessageDisabled: true\n" + "    moderated: true\n" + "    shareHistoryEnabled: true\n"
        + "    diagnostic: Diagnostic\n" + "}", actualToStringResult);
    assertEquals(1L, actualLastDisabled.longValue());
    assertTrue(actualActive);
    assertTrue(actualAllowExternal);
    assertTrue(actualCopyDisabled);
    assertTrue(actualCrossPod);
    assertTrue(actualDiscoverable);
    assertTrue(actualExternalOwned);
    assertTrue(actualMemberAddUserEnabled);
    assertTrue(actualModerated);
    assertTrue(actualPublicRoom);
    assertTrue(actualReadOnly);
    assertTrue(actualSendMessageDisabled);
    assertTrue(actualShareHistoryEnabled);
    assertSame(actualV1dlpStream, actualActiveResult);
    assertSame(actualV1dlpStream, actualAllowExternalResult);
    assertSame(actualV1dlpStream, actualCopyDisabledResult);
    assertSame(actualV1dlpStream, actualCreatorIdResult);
    assertSame(actualV1dlpStream, actualCreatorPrettyNameResult);
    assertSame(actualV1dlpStream, actualCrossPodResult);
    assertSame(actualV1dlpStream, actualDiagnosticResult);
    assertSame(actualV1dlpStream, actualDiscoverableResult);
    assertSame(actualV1dlpStream, actualExternalOwnedResult);
    assertSame(actualV1dlpStream, actualLastDisabledResult);
    assertSame(actualV1dlpStream, actualMemberAddUserEnabledResult);
    assertSame(actualV1dlpStream, actualModeratedResult);
    assertSame(actualV1dlpStream, actualNameResult);
    assertSame(actualV1dlpStream, actualPublicRoomResult);
    assertSame(actualV1dlpStream, actualReadOnlyResult);
    assertSame(actualV1dlpStream, actualRoomDescriptionResult);
    assertSame(actualV1dlpStream, actualSendMessageDisabledResult);
    assertSame(actualV1dlpStream, actualShareHistoryEnabledResult);
    assertSame(actualV1dlpStream, actualStateResult);
    assertSame(actualV1dlpStream, actualStreamIdResult);
    assertSame(actualV1dlpStream, actualTypeResult);
  }
}
