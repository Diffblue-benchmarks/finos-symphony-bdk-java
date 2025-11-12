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

class MessageContainsDiffblueTest {
  /**
   * Test {@link MessageContains#matches(Message)} with {@code Message}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MessageContains#matches(Message)}
   */
  @Test
  @DisplayName("Test matches(Message) with 'Message'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageContains.matches(Message)"})
  void testMatchesWithMessage_thenReturnTrue() {
    // Arrange
    MessageContains messageContains = new MessageContains("Not all who wander are lost");

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

    // Act
    boolean actualMatchesResult =
        messageContains.matches(
            builderResult
                .attachments(new ArrayList<>())
                .content("Not all who wander are lost")
                .data(userClaim)
                .silent(true)
                .version("1.0.2")
                .build());

    // Assert
    assertTrue(actualMatchesResult);
  }

  /**
   * Test {@link MessageContains#toString()}.
   *
   * <p>Method under test: {@link MessageContains#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String MessageContains.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "message does not contain 'Not all who wander are lost'.",
        new MessageContains("Not all who wander are lost").toString());
  }
}
