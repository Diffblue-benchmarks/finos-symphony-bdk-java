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

class V2MemberInfoDiffblueTest {
  /**
   * Test {@link V2MemberInfo#addAddedThroughGroupsItem(Long)}.
   * <ul>
   *   <li>Given {@link V2MemberInfo} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#addAddedThroughGroupsItem(Long)}
   */
  @Test
  @DisplayName("Test addAddedThroughGroupsItem(Long); given V2MemberInfo (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2MemberInfo V2MemberInfo.addAddedThroughGroupsItem(Long)"})
  void testAddAddedThroughGroupsItem_givenV2MemberInfo() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();

    // Act and Assert
    assertSame(v2MemberInfo, v2MemberInfo.addAddedThroughGroupsItem(1L));
  }

  /**
   * Test {@link V2MemberInfo#addAddedThroughGroupsItem(Long)}.
   * <ul>
   *   <li>Given {@link V2MemberInfo} (default constructor) AddedThroughGroups is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#addAddedThroughGroupsItem(Long)}
   */
  @Test
  @DisplayName("Test addAddedThroughGroupsItem(Long); given V2MemberInfo (default constructor) AddedThroughGroups is ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2MemberInfo V2MemberInfo.addAddedThroughGroupsItem(Long)"})
  void testAddAddedThroughGroupsItem_givenV2MemberInfoAddedThroughGroupsIsArrayList() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    v2MemberInfo.setAddedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertSame(v2MemberInfo, v2MemberInfo.addAddedThroughGroupsItem(1L));
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}, and {@link V2MemberInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MemberInfo#equals(Object)}
   *   <li>{@link V2MemberInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    V2MemberInfo v2MemberInfo2 = new V2MemberInfo();

    // Act and Assert
    assertEquals(v2MemberInfo, v2MemberInfo2);
    int expectedHashCodeResult = v2MemberInfo.hashCode();
    assertEquals(expectedHashCodeResult, v2MemberInfo2.hashCode());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}, and {@link V2MemberInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MemberInfo#equals(Object)}
   *   <li>{@link V2MemberInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();

    // Act and Assert
    assertEquals(v2MemberInfo, v2MemberInfo);
    int expectedHashCodeResult = v2MemberInfo.hashCode();
    assertEquals(expectedHashCodeResult, v2MemberInfo.hashCode());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    v2MemberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(v2MemberInfo, new V2MemberInfo());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    v2MemberInfo.user(new V2MemberUserDetail());
    v2MemberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(v2MemberInfo, new V2MemberInfo());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    v2MemberInfo.setIsOwner(true);
    v2MemberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(v2MemberInfo, new V2MemberInfo());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    v2MemberInfo.setIsCreator(true);
    v2MemberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(v2MemberInfo, new V2MemberInfo());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2MemberInfo v2MemberInfo = new V2MemberInfo();
    v2MemberInfo.joinDate(1L);
    v2MemberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(v2MemberInfo, new V2MemberInfo());
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberInfo(), null);
  }

  /**
   * Test {@link V2MemberInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2MemberInfo.equals(Object)", "int V2MemberInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberInfo(), "Different type to V2MemberInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MemberInfo}
   *   <li>{@link V2MemberInfo#joinDate(Long)}
   *   <li>{@link V2MemberInfo#setAddedThroughGroups(List)}
   *   <li>{@link V2MemberInfo#setIsCreator(Boolean)}
   *   <li>{@link V2MemberInfo#setIsOwner(Boolean)}
   *   <li>{@link V2MemberInfo#setJoinDate(Long)}
   *   <li>{@link V2MemberInfo#setUser(V2MemberUserDetail)}
   *   <li>{@link V2MemberInfo#user(V2MemberUserDetail)}
   *   <li>{@link V2MemberInfo#addedThroughGroups(List)}
   *   <li>{@link V2MemberInfo#isCreator(Boolean)}
   *   <li>{@link V2MemberInfo#isOwner(Boolean)}
   *   <li>{@link V2MemberInfo#toString()}
   *   <li>{@link V2MemberInfo#getAddedThroughGroups()}
   *   <li>{@link V2MemberInfo#getIsCreator()}
   *   <li>{@link V2MemberInfo#getIsOwner()}
   *   <li>{@link V2MemberInfo#getJoinDate()}
   *   <li>{@link V2MemberInfo#getUser()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2MemberInfo.<init>()", "V2MemberInfo V2MemberInfo.addedThroughGroups(List)",
      "List V2MemberInfo.getAddedThroughGroups()", "Boolean V2MemberInfo.getIsCreator()",
      "Boolean V2MemberInfo.getIsOwner()", "Long V2MemberInfo.getJoinDate()",
      "V2MemberUserDetail V2MemberInfo.getUser()", "V2MemberInfo V2MemberInfo.isCreator(Boolean)",
      "V2MemberInfo V2MemberInfo.isOwner(Boolean)", "V2MemberInfo V2MemberInfo.joinDate(Long)",
      "void V2MemberInfo.setAddedThroughGroups(List)", "void V2MemberInfo.setIsCreator(Boolean)",
      "void V2MemberInfo.setIsOwner(Boolean)", "void V2MemberInfo.setJoinDate(Long)",
      "void V2MemberInfo.setUser(V2MemberUserDetail)", "String V2MemberInfo.toString()",
      "V2MemberInfo V2MemberInfo.user(V2MemberUserDetail)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2MemberInfo actualV2MemberInfo = new V2MemberInfo();
    V2MemberInfo actualJoinDateResult = actualV2MemberInfo.joinDate(1L);
    actualV2MemberInfo.setAddedThroughGroups(new ArrayList<>());
    actualV2MemberInfo.setIsCreator(true);
    actualV2MemberInfo.setIsOwner(true);
    actualV2MemberInfo.setJoinDate(1L);
    actualV2MemberInfo.setUser(new V2MemberUserDetail());
    V2MemberUserDetail user = new V2MemberUserDetail();
    V2MemberInfo actualUserResult = actualV2MemberInfo.user(user);
    ArrayList<Long> addedThroughGroups = new ArrayList<>();
    V2MemberInfo actualAddedThroughGroupsResult = actualV2MemberInfo.addedThroughGroups(addedThroughGroups);
    V2MemberInfo actualIsCreatorResult = actualV2MemberInfo.isCreator(true);
    V2MemberInfo actualIsOwnerResult = actualV2MemberInfo.isOwner(true);
    String actualToStringResult = actualV2MemberInfo.toString();
    List<Long> actualAddedThroughGroups = actualV2MemberInfo.getAddedThroughGroups();
    Boolean actualIsCreator = actualV2MemberInfo.getIsCreator();
    Boolean actualIsOwner = actualV2MemberInfo.getIsOwner();
    Long actualJoinDate = actualV2MemberInfo.getJoinDate();
    V2MemberUserDetail actualUser = actualV2MemberInfo.getUser();

    // Assert
    assertEquals("class V2MemberInfo {\n" + "    user: class V2MemberUserDetail {\n" + "        userId: null\n"
        + "        email: null\n" + "        firstName: null\n" + "        lastName: null\n"
        + "        displayName: null\n" + "        company: null\n" + "        companyId: null\n"
        + "        isExternal: null\n" + "    }\n" + "    isOwner: true\n" + "    isCreator: true\n"
        + "    joinDate: 1\n" + "    addedThroughGroups: []\n" + "}", actualToStringResult);
    assertEquals(1L, actualJoinDate.longValue());
    assertTrue(actualIsCreator);
    assertTrue(actualIsOwner);
    assertTrue(actualAddedThroughGroups.isEmpty());
    assertSame(actualV2MemberInfo, actualAddedThroughGroupsResult);
    assertSame(actualV2MemberInfo, actualIsCreatorResult);
    assertSame(actualV2MemberInfo, actualIsOwnerResult);
    assertSame(actualV2MemberInfo, actualJoinDateResult);
    assertSame(actualV2MemberInfo, actualUserResult);
    assertSame(user, actualUser);
    assertSame(addedThroughGroups, actualAddedThroughGroups);
  }
}
