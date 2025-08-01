package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MemberDiffblueTest {
  /**
   * Test {@link Member#equals(Object)}, and {@link Member#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Member#equals(Object)}
   *   <li>{@link Member#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Member member = new Member();
    Member member2 = new Member();

    // Act and Assert
    assertEquals(member, member2);
    int expectedHashCodeResult = member.hashCode();
    assertEquals(expectedHashCodeResult, member2.hashCode());
  }

  /**
   * Test {@link Member#equals(Object)}, and {@link Member#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Member#equals(Object)}
   *   <li>{@link Member#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Member member = new Member();

    // Act and Assert
    assertEquals(member, member);
    int expectedHashCodeResult = member.hashCode();
    assertEquals(expectedHashCodeResult, member.hashCode());
  }

  /**
   * Test {@link Member#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Member#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Member(), 1);
  }

  /**
   * Test {@link Member#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Member#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Member member = new Member();
    member.memberTenant(1);

    // Act and Assert
    assertNotEquals(member, new Member());
  }

  /**
   * Test {@link Member#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Member#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Member member = new Member();
    member.memberId(1L);

    // Act and Assert
    assertNotEquals(member, new Member());
  }

  /**
   * Test {@link Member#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Member#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Member(), null);
  }

  /**
   * Test {@link Member#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Member#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Member.equals(Object)", "int Member.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Member(), "Different type to Member");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Member}
   *   <li>{@link Member#memberId(Long)}
   *   <li>{@link Member#memberTenant(Integer)}
   *   <li>{@link Member#setMemberId(Long)}
   *   <li>{@link Member#setMemberTenant(Integer)}
   *   <li>{@link Member#toString()}
   *   <li>{@link Member#getMemberId()}
   *   <li>{@link Member#getMemberTenant()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Member.<init>()",
    "Long Member.getMemberId()",
    "Integer Member.getMemberTenant()",
    "Member Member.memberId(Long)",
    "Member Member.memberTenant(Integer)",
    "void Member.setMemberId(Long)",
    "void Member.setMemberTenant(Integer)",
    "String Member.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Member actualMember = new Member();
    Member actualMemberIdResult = actualMember.memberId(1L);
    Member actualMemberTenantResult = actualMember.memberTenant(1);
    actualMember.setMemberId(1L);
    actualMember.setMemberTenant(1);
    String actualToStringResult = actualMember.toString();
    Long actualMemberId = actualMember.getMemberId();

    // Assert
    assertEquals("class Member {\n    memberTenant: 1\n    memberId: 1\n}", actualToStringResult);
    assertEquals(1, actualMember.getMemberTenant().intValue());
    assertEquals(1L, actualMemberId.longValue());
    assertSame(actualMember, actualMemberIdResult);
    assertSame(actualMember, actualMemberTenantResult);
  }
}
