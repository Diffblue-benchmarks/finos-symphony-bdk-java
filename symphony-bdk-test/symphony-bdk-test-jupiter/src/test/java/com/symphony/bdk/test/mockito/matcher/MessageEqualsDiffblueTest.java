package com.symphony.bdk.test.mockito.matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.jwt.UserClaim;
import com.symphony.bdk.core.service.message.model.Message;
import com.symphony.bdk.core.service.message.model.Message.MessageBuilder;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageEqualsDiffblueTest {
  /**
   * Test {@link MessageEquals#matches(Message)} with {@code Message}.
   *
   * <ul>
   *   <li>Given {@code https://example.org/example}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MessageEquals#matches(Message)}
   */
  @Test
  @DisplayName(
      "Test matches(Message) with 'Message'; given 'https://example.org/example'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageEquals.matches(Message)"})
  void testMatchesWithMessage_givenHttpsExampleOrgExample_thenReturnTrue() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");
    MessageBuilder builderResult = Message.builder();
    Message message =
        builderResult
            .attachments(new ArrayList<>())
            .content("Not all who wander are lost")
            .data(userClaim)
            .silent(true)
            .version("1.0.2")
            .build();
    MessageEquals messageEquals = new MessageEquals(message);

    UserClaim userClaim2 = new UserClaim();
    userClaim2.setAvatarSmallUrl("https://example.org/example");
    userClaim2.setAvatarUrl("https://example.org/example");
    userClaim2.setCompany("Company");
    userClaim2.setCompanyId("42");
    userClaim2.setDisplayName("Display Name");
    userClaim2.setEmailAddress("42 Main St");
    userClaim2.setFirstName("Jane");
    userClaim2.setId(1L);
    userClaim2.setLastName("Doe");
    userClaim2.setLocation("Location");
    userClaim2.setTitle("Dr");
    userClaim2.setUsername("janedoe");
    MessageBuilder builderResult2 = Message.builder();
    Message argument =
        builderResult2
            .attachments(new ArrayList<>())
            .content("Not all who wander are lost")
            .data(userClaim2)
            .silent(true)
            .version("1.0.2")
            .build();

    // Act and Assert
    assertTrue(messageEquals.matches(argument));
  }

  /**
   * Test {@link MessageEquals#type()}.
   *
   * <p>Method under test: {@link MessageEquals#type()}
   */
  @Test
  @DisplayName("Test type()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class MessageEquals.type()"})
  void testType() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");
    MessageBuilder builderResult = Message.builder();
    Message message =
        builderResult
            .attachments(new ArrayList<>())
            .content("Not all who wander are lost")
            .data(userClaim)
            .silent(true)
            .version("1.0.2")
            .build();

    // Act
    Class<?> actualTypeResult = new MessageEquals(message).type();

    // Assert
    Class<Message> expectedTypeResult = Message.class;
    assertEquals(expectedTypeResult, actualTypeResult);
  }

  /**
   * Test {@link MessageEquals#toString()}.
   *
   * <p>Method under test: {@link MessageEquals#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String MessageEquals.toString()"})
  void testToString() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");
    MessageBuilder builderResult = Message.builder();
    Message message =
        builderResult
            .attachments(new ArrayList<>())
            .content("Not all who wander are lost")
            .data(userClaim)
            .silent(true)
            .version("1.0.2")
            .build();

    // Act and Assert
    assertEquals("message does not match the expected.", new MessageEquals(message).toString());
  }
}
