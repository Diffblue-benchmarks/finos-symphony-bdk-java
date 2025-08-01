package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileControlDiffblueTest {
  /**
   * Test {@link ProfileControl#addProfileFieldsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link ProfileControl} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#addProfileFieldsItem(String)}
   */
  @Test
  @DisplayName("Test addProfileFieldsItem(String); given ProfileControl (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProfileControl ProfileControl.addProfileFieldsItem(String)"})
  void testAddProfileFieldsItem_givenProfileControl() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();

    // Act and Assert
    assertSame(profileControl, profileControl.addProfileFieldsItem("Profile Fields Item"));
  }

  /**
   * Test {@link ProfileControl#addProfileFieldsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link ProfileControl} (default constructor) profileFields {@link
   *       HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#addProfileFieldsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addProfileFieldsItem(String); given ProfileControl (default constructor) profileFields HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProfileControl ProfileControl.addProfileFieldsItem(String)"})
  void testAddProfileFieldsItem_givenProfileControlProfileFieldsHashSet() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.profileFields(new HashSet<>());

    // Act and Assert
    assertSame(profileControl, profileControl.addProfileFieldsItem("Profile Fields Item"));
  }

  /**
   * Test {@link ProfileControl#addSearchFieldsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link ProfileControl} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#addSearchFieldsItem(String)}
   */
  @Test
  @DisplayName("Test addSearchFieldsItem(String); given ProfileControl (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProfileControl ProfileControl.addSearchFieldsItem(String)"})
  void testAddSearchFieldsItem_givenProfileControl() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();

    // Act and Assert
    assertSame(profileControl, profileControl.addSearchFieldsItem("Search Fields Item"));
  }

  /**
   * Test {@link ProfileControl#addSearchFieldsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link ProfileControl} (default constructor) SearchFields is {@link
   *       HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#addSearchFieldsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addSearchFieldsItem(String); given ProfileControl (default constructor) SearchFields is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProfileControl ProfileControl.addSearchFieldsItem(String)"})
  void testAddSearchFieldsItem_givenProfileControlSearchFieldsIsHashSet() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.setSearchFields(new HashSet<>());

    // Act and Assert
    assertSame(profileControl, profileControl.addSearchFieldsItem("Search Fields Item"));
  }

  /**
   * Test {@link ProfileControl#equals(Object)}, and {@link ProfileControl#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ProfileControl#equals(Object)}
   *   <li>{@link ProfileControl#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    ProfileControl profileControl2 = new ProfileControl();

    // Act and Assert
    assertEquals(profileControl, profileControl2);
    int expectedHashCodeResult = profileControl.hashCode();
    assertEquals(expectedHashCodeResult, profileControl2.hashCode());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}, and {@link ProfileControl#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ProfileControl#equals(Object)}
   *   <li>{@link ProfileControl#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();

    // Act and Assert
    assertEquals(profileControl, profileControl);
    int expectedHashCodeResult = profileControl.hashCode();
    assertEquals(expectedHashCodeResult, profileControl.hashCode());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.addProfileFieldsItem("Profile Fields Item");

    // Act and Assert
    assertNotEquals(profileControl, new ProfileControl());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.visibilityRestriction(new VisibilityRestriction());
    profileControl.addProfileFieldsItem("Profile Fields Item");

    // Act and Assert
    assertNotEquals(profileControl, new ProfileControl());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.implicitConnection(new ImplicitConnection());
    profileControl.addProfileFieldsItem("Profile Fields Item");

    // Act and Assert
    assertNotEquals(profileControl, new ProfileControl());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.wallSupport(true);
    profileControl.addProfileFieldsItem("Profile Fields Item");

    // Act and Assert
    assertNotEquals(profileControl, new ProfileControl());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ProfileControl profileControl = new ProfileControl();
    profileControl.addSearchFieldsItem("Search Fields Item");

    // Act and Assert
    assertNotEquals(profileControl, new ProfileControl());
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ProfileControl(), null);
  }

  /**
   * Test {@link ProfileControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileControl.equals(Object)", "int ProfileControl.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ProfileControl(), "Different type to ProfileControl");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ProfileControl}
   *   <li>{@link ProfileControl#canHavePublicProfile(Boolean)}
   *   <li>{@link ProfileControl#implicitConnection(ImplicitConnection)}
   *   <li>{@link ProfileControl#profileFields(Set)}
   *   <li>{@link ProfileControl#setCanHavePublicProfile(Boolean)}
   *   <li>{@link ProfileControl#setImplicitConnection(ImplicitConnection)}
   *   <li>{@link ProfileControl#setProfileFields(Set)}
   *   <li>{@link ProfileControl#setSearchFields(Set)}
   *   <li>{@link ProfileControl#setVisibilityRestriction(VisibilityRestriction)}
   *   <li>{@link ProfileControl#setWallSupport(Boolean)}
   *   <li>{@link ProfileControl#visibilityRestriction(VisibilityRestriction)}
   *   <li>{@link ProfileControl#wallSupport(Boolean)}
   *   <li>{@link ProfileControl#searchFields(Set)}
   *   <li>{@link ProfileControl#toString()}
   *   <li>{@link ProfileControl#getCanHavePublicProfile()}
   *   <li>{@link ProfileControl#getImplicitConnection()}
   *   <li>{@link ProfileControl#getProfileFields()}
   *   <li>{@link ProfileControl#getSearchFields()}
   *   <li>{@link ProfileControl#getVisibilityRestriction()}
   *   <li>{@link ProfileControl#getWallSupport()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ProfileControl.<init>()",
    "ProfileControl ProfileControl.canHavePublicProfile(Boolean)",
    "Boolean ProfileControl.getCanHavePublicProfile()",
    "ImplicitConnection ProfileControl.getImplicitConnection()",
    "Set ProfileControl.getProfileFields()",
    "Set ProfileControl.getSearchFields()",
    "VisibilityRestriction ProfileControl.getVisibilityRestriction()",
    "Boolean ProfileControl.getWallSupport()",
    "ProfileControl ProfileControl.implicitConnection(ImplicitConnection)",
    "ProfileControl ProfileControl.profileFields(Set)",
    "ProfileControl ProfileControl.searchFields(Set)",
    "void ProfileControl.setCanHavePublicProfile(Boolean)",
    "void ProfileControl.setImplicitConnection(ImplicitConnection)",
    "void ProfileControl.setProfileFields(Set)",
    "void ProfileControl.setSearchFields(Set)",
    "void ProfileControl.setVisibilityRestriction(VisibilityRestriction)",
    "void ProfileControl.setWallSupport(Boolean)",
    "String ProfileControl.toString()",
    "ProfileControl ProfileControl.visibilityRestriction(VisibilityRestriction)",
    "ProfileControl ProfileControl.wallSupport(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ProfileControl actualProfileControl = new ProfileControl();
    ProfileControl actualCanHavePublicProfileResult =
        actualProfileControl.canHavePublicProfile(true);
    ProfileControl actualImplicitConnectionResult =
        actualProfileControl.implicitConnection(new ImplicitConnection());
    ProfileControl actualProfileFieldsResult = actualProfileControl.profileFields(new HashSet<>());
    actualProfileControl.setCanHavePublicProfile(true);
    ImplicitConnection implicitConnection = new ImplicitConnection();
    actualProfileControl.setImplicitConnection(implicitConnection);
    HashSet<String> profileFields = new HashSet<>();
    actualProfileControl.setProfileFields(profileFields);
    actualProfileControl.setSearchFields(new HashSet<>());
    actualProfileControl.setVisibilityRestriction(new VisibilityRestriction());
    actualProfileControl.setWallSupport(true);
    VisibilityRestriction visibilityRestriction = new VisibilityRestriction();
    ProfileControl actualVisibilityRestrictionResult =
        actualProfileControl.visibilityRestriction(visibilityRestriction);
    ProfileControl actualWallSupportResult = actualProfileControl.wallSupport(true);
    HashSet<String> searchFields = new HashSet<>();
    ProfileControl actualSearchFieldsResult = actualProfileControl.searchFields(searchFields);
    String actualToStringResult = actualProfileControl.toString();
    Boolean actualCanHavePublicProfile = actualProfileControl.getCanHavePublicProfile();
    ImplicitConnection actualImplicitConnection = actualProfileControl.getImplicitConnection();
    Set<String> actualProfileFields = actualProfileControl.getProfileFields();
    Set<String> actualSearchFields = actualProfileControl.getSearchFields();
    VisibilityRestriction actualVisibilityRestriction =
        actualProfileControl.getVisibilityRestriction();

    // Assert
    assertEquals(
        "class ProfileControl {\n"
            + "    visibilityRestriction: class VisibilityRestriction {\n"
            + "        visible: null\n"
            + "        restrictToTenants: null\n"
            + "        restrictToUsers: null\n"
            + "    }\n"
            + "    implicitConnection: class ImplicitConnection {\n"
            + "        all: null\n"
            + "        connectToTenants: null\n"
            + "        connectToUsers: null\n"
            + "    }\n"
            + "    wallSupport: true\n"
            + "    profileFields: []\n"
            + "    searchFields: []\n"
            + "    canHavePublicProfile: true\n"
            + "}",
        actualToStringResult);
    assertTrue(actualCanHavePublicProfile);
    assertTrue(actualProfileControl.getWallSupport());
    assertTrue(actualProfileFields.isEmpty());
    assertTrue(actualSearchFields.isEmpty());
    assertSame(implicitConnection, actualImplicitConnection);
    assertSame(actualProfileControl, actualCanHavePublicProfileResult);
    assertSame(actualProfileControl, actualImplicitConnectionResult);
    assertSame(actualProfileControl, actualProfileFieldsResult);
    assertSame(actualProfileControl, actualSearchFieldsResult);
    assertSame(actualProfileControl, actualVisibilityRestrictionResult);
    assertSame(actualProfileControl, actualWallSupportResult);
    assertSame(visibilityRestriction, actualVisibilityRestriction);
    assertSame(profileFields, actualProfileFields);
    assertSame(searchFields, actualSearchFields);
  }
}
