package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomSystemInfoDiffblueTest {
  /**
   * Test {@link RoomSystemInfo#equals(Object)}, and {@link RoomSystemInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomSystemInfo#equals(Object)}
   *   <li>{@link RoomSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    RoomSystemInfo roomSystemInfo2 = new RoomSystemInfo();

    // Act and Assert
    assertEquals(roomSystemInfo, roomSystemInfo2);
    int expectedHashCodeResult = roomSystemInfo.hashCode();
    assertEquals(expectedHashCodeResult, roomSystemInfo2.hashCode());
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}, and {@link RoomSystemInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomSystemInfo#equals(Object)}
   *   <li>{@link RoomSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();

    // Act and Assert
    assertEquals(roomSystemInfo, roomSystemInfo);
    int expectedHashCodeResult = roomSystemInfo.hashCode();
    assertEquals(expectedHashCodeResult, roomSystemInfo.hashCode());
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSystemInfo(), 1);
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    roomSystemInfo.id("42");

    // Act and Assert
    assertNotEquals(roomSystemInfo, new RoomSystemInfo());
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    roomSystemInfo.creationDate(1L);

    // Act and Assert
    assertNotEquals(roomSystemInfo, new RoomSystemInfo());
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    roomSystemInfo.createdByUserId(1L);

    // Act and Assert
    assertNotEquals(roomSystemInfo, new RoomSystemInfo());
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    roomSystemInfo.active(true);

    // Act and Assert
    assertNotEquals(roomSystemInfo, new RoomSystemInfo());
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSystemInfo(), null);
  }

  /**
   * Test {@link RoomSystemInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomSystemInfo.equals(Object)", "int RoomSystemInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSystemInfo(), "Different type to RoomSystemInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomSystemInfo}
   *   <li>{@link RoomSystemInfo#active(Boolean)}
   *   <li>{@link RoomSystemInfo#createdByUserId(Long)}
   *   <li>{@link RoomSystemInfo#creationDate(Long)}
   *   <li>{@link RoomSystemInfo#id(String)}
   *   <li>{@link RoomSystemInfo#setActive(Boolean)}
   *   <li>{@link RoomSystemInfo#setCreatedByUserId(Long)}
   *   <li>{@link RoomSystemInfo#setCreationDate(Long)}
   *   <li>{@link RoomSystemInfo#setId(String)}
   *   <li>{@link RoomSystemInfo#toString()}
   *   <li>{@link RoomSystemInfo#getActive()}
   *   <li>{@link RoomSystemInfo#getCreatedByUserId()}
   *   <li>{@link RoomSystemInfo#getCreationDate()}
   *   <li>{@link RoomSystemInfo#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RoomSystemInfo.<init>()", "RoomSystemInfo RoomSystemInfo.active(Boolean)",
      "RoomSystemInfo RoomSystemInfo.createdByUserId(Long)", "RoomSystemInfo RoomSystemInfo.creationDate(Long)",
      "Boolean RoomSystemInfo.getActive()", "Long RoomSystemInfo.getCreatedByUserId()",
      "Long RoomSystemInfo.getCreationDate()", "String RoomSystemInfo.getId()",
      "RoomSystemInfo RoomSystemInfo.id(String)", "void RoomSystemInfo.setActive(Boolean)",
      "void RoomSystemInfo.setCreatedByUserId(Long)", "void RoomSystemInfo.setCreationDate(Long)",
      "void RoomSystemInfo.setId(String)", "String RoomSystemInfo.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    RoomSystemInfo actualRoomSystemInfo = new RoomSystemInfo();
    RoomSystemInfo actualActiveResult = actualRoomSystemInfo.active(true);
    RoomSystemInfo actualCreatedByUserIdResult = actualRoomSystemInfo.createdByUserId(1L);
    RoomSystemInfo actualCreationDateResult = actualRoomSystemInfo.creationDate(1L);
    RoomSystemInfo actualIdResult = actualRoomSystemInfo.id("42");
    actualRoomSystemInfo.setActive(true);
    actualRoomSystemInfo.setCreatedByUserId(1L);
    actualRoomSystemInfo.setCreationDate(1L);
    actualRoomSystemInfo.setId("42");
    String actualToStringResult = actualRoomSystemInfo.toString();
    Boolean actualActive = actualRoomSystemInfo.getActive();
    Long actualCreatedByUserId = actualRoomSystemInfo.getCreatedByUserId();
    Long actualCreationDate = actualRoomSystemInfo.getCreationDate();

    // Assert
    assertEquals("42", actualRoomSystemInfo.getId());
    assertEquals("class RoomSystemInfo {\n    id: 42\n    creationDate: 1\n    createdByUserId: 1\n    active: true\n}",
        actualToStringResult);
    assertEquals(1L, actualCreatedByUserId.longValue());
    assertEquals(1L, actualCreationDate.longValue());
    assertTrue(actualActive);
    assertSame(actualRoomSystemInfo, actualActiveResult);
    assertSame(actualRoomSystemInfo, actualCreatedByUserIdResult);
    assertSame(actualRoomSystemInfo, actualCreationDateResult);
    assertSame(actualRoomSystemInfo, actualIdResult);
  }
}
