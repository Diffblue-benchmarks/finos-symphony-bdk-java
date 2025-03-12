package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AddMemberDiffblueTest {
  /**
   * Test {@link AddMember#equals(Object)}, and {@link AddMember#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AddMember#equals(Object)}
   *   <li>{@link AddMember#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AddMember.equals(Object)", "int AddMember.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AddMember addMember = new AddMember();
    AddMember addMember2 = new AddMember();

    // Act and Assert
    assertEquals(addMember, addMember2);
    int expectedHashCodeResult = addMember.hashCode();
    assertEquals(expectedHashCodeResult, addMember2.hashCode());
  }

  /**
   * Test {@link AddMember#equals(Object)}, and {@link AddMember#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AddMember#equals(Object)}
   *   <li>{@link AddMember#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AddMember.equals(Object)", "int AddMember.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AddMember addMember = new AddMember();

    // Act and Assert
    assertEquals(addMember, addMember);
    int expectedHashCodeResult = addMember.hashCode();
    assertEquals(expectedHashCodeResult, addMember.hashCode());
  }

  /**
   * Test {@link AddMember#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AddMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AddMember.equals(Object)", "int AddMember.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AddMember(), null);
  }

  /**
   * Test {@link AddMember#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AddMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AddMember.equals(Object)", "int AddMember.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AddMember(), null);
  }

  /**
   * Test {@link AddMember#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AddMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AddMember.equals(Object)", "int AddMember.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AddMember(), "Different type to AddMember");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AddMember}
   *   <li>{@link AddMember#member(Member)}
   *   <li>{@link AddMember#setMember(Member)}
   *   <li>{@link AddMember#toString()}
   *   <li>{@link AddMember#getMember()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AddMember.<init>()", "Member AddMember.getMember()", "AddMember AddMember.member(Member)",
      "void AddMember.setMember(Member)", "String AddMember.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    AddMember actualAddMember = new AddMember();
    AddMember actualMemberResult = actualAddMember.member(new Member());
    Member member = new Member();
    actualAddMember.setMember(member);
    String actualToStringResult = actualAddMember.toString();

    // Assert
    assertEquals("class AddMember {\n" + "    member: class Member {\n" + "        memberTenant: null\n"
        + "        memberId: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualAddMember, actualMemberResult);
    assertSame(member, actualAddMember.getMember());
  }
}
